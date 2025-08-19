package com.example.gamerulesmod;

import net.minecraft.world.World;
import net.minecraftforge.event.world.WorldEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfigManager {
    private final File configDir;
    private final Map<String, String> activeRules = new HashMap<>();
    private World lastWorld;
    
    public ConfigManager(File modConfigDir) {
        this.configDir = new File(modConfigDir, "GameRulesMod");
        if (!configDir.exists()) configDir.mkdirs();
        loadAllConfigs();
    }
    
    public void reloadConfigs() {
        activeRules.clear();
        loadAllConfigs();
        applyRulesToWorld();
    }
    
    private void loadAllConfigs() {
        loadConfigFile("vanilla_rules.txt", getDefaultVanillaConfig());
        loadConfigFile("modded_rules.txt", getDefaultModdedConfig());
    }
    
    private void loadConfigFile(String fileName, String defaultContent) {
        File configFile = new File(configDir, fileName);
        try {
            if (!configFile.exists()) {
                Files.write(configFile.toPath(), defaultContent.getBytes(StandardCharsets.UTF_8));
            }
            
            List<String> lines = Files.readAllLines(configFile.toPath(), StandardCharsets.UTF_8);
            for (String line : lines) {
                line = line.trim();
                if (line.isEmpty() || line.startsWith("#")) continue;
                
                String[] parts = line.split("=", 2);
                if (parts.length == 2) {
                    activeRules.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (IOException e) {
            System.err.println("Failed to load config: " + fileName);
        }
    }
    
    private String getDefaultVanillaConfig() {
        return "# Vanilla Minecraft 1.7.10 Game Rules\n" +
               "# Format: rule = value\n\n" +
               "commandBlockOutput = true\n" +
               "doDaylightCycle = true\n" +
               "doEntityDrops = true\n" +
               "doFireTick = true\n" +
               "doMobLoot = true\n" +
               "doMobSpawning = true\n" +
               "doTileDrops = true\n" +
               "keepInventory = false\n" +
               "mobGriefing = true\n" +
               "randomTickSpeed = 3\n" +
               "spawnRadius = 10\n";
    }
    
    private String getDefaultModdedConfig() {
        return "# Modded Game Rules\n" +
               "# Add your custom mod rules here\n" +
               "# Format: RuleName = Value\n\n" +
               "# ExampleRule = true\n";
    }
    
    @SubscribeEvent
    public void onWorldLoad(WorldEvent.Load event) {
        if (!event.world.isRemote && event.world.provider.dimensionId == 0) {
            lastWorld = event.world;
            applyRulesToWorld();
        }
    }
    
    public void applyRulesToWorld() {
        if (lastWorld != null) {
            for (Map.Entry<String, String> entry : activeRules.entrySet()) {
                try {
                    lastWorld.getGameRules().setOrCreateGameRule(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    System.err.println("Failed to apply rule: " + entry.getKey());
                }
            }
        }
    }
    
    public Map<String, String> getActiveRules() {
        return new HashMap<>(activeRules);
    }
}