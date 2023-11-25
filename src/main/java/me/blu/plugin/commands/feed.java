package me.blu.plugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class feed implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p){
            p = (Player) sender;

            if (p.getFoodLevel() == 20){
                p.sendMessage(ChatColor.AQUA + "Du hast keinen Hunger");
            }
            else{
                p.setFoodLevel(20);
                p.sendMessage(ChatColor.AQUA + "Du bist nun gesättigt!");
            }
        }

        return true;
    }
}
