package com.example.gamerulesmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = GameRulesMod.MODID, name = "Game Rules Manager", version = "1.0")
public class GameRulesMod {
    public static final String MODID = "gamerulesmod";
    
    private ConfigManager configManager;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        configManager = new ConfigManager(event.getModConfigurationDirectory());
        MinecraftForge.EVENT_BUS.register(configManager);
    }
    
    @EventHandler
    public void serverStart(FMLServerStartingEvent event) {
        event.registerServerCommand(new GameRulesCommand(configManager));
    }
}