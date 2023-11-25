package me.blu.plugin.commands;

import me.blu.plugin.SurvivalSystem;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class fly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p){
            p = (Player) sender;

            if (p.isFlying()){
                p.setFlying(false);
                p.setAllowFlight(false);
                p.sendMessage(SurvivalSystem.prefix + ChatColor.AQUA + "Du fliegst nun nicht mehr!");}
            else{
                if (!p.getAllowFlight())
                        p.setAllowFlight(true);
                        p.setFlying(true);
                        p.sendMessage(SurvivalSystem.prefix + ChatColor.AQUA + "Du kannst nun fliegen!");}
            }
        return true;
    }
}