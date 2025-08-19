package com.example.gamerulesmod;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import java.util.Arrays;
import java.util.List;

public class GameRulesCommand implements ICommand {
    private final ConfigManager configManager;
    
    public GameRulesCommand(ConfigManager configManager) {
        this.configManager = configManager;
    }
    
    @Override
    public String getCommandName() {
        return "gamerules";
    }
    
    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/gamerules reload - Reloads rules from config files";
    }
    
    @Override
    public List<String> getCommandAliases() {
        return Arrays.asList("gr", "grules");
    }
    
    @Override
    public void processCommand(ICommandSender sender, String[] args) {
        if (args.length > 0 && args[0].equalsIgnoreCase("reload")) {
            configManager.reloadConfigs();
            sender.addChatMessage(new ChatComponentText("§aGame rules reloaded successfully!"));
            return;
        }
        
        sender.addChatMessage(new ChatComponentText("§eUsage: /gamerules reload"));
        sender.addChatMessage(new ChatComponentText("§7Config files location: config/GameRulesMod/"));
    }
    
    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }
    
    @Override
    public List<String> addTabCompletionOptions(ICommandSender sender, String[] args) {
        return Arrays.asList("reload");
    }
    
    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }
    
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}