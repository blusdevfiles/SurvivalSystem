package me.blu.plugin.commands;

import me.blu.plugin.SurvivalSystem;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class chefemode implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p){
            p = (Player) sender;
            if (p.isInvulnerable()){

                p.setInvulnerable(false);
                p.sendMessage(SurvivalSystem.prefix + ChatColor.DARK_GREEN + "Du bist nun ein normaler Eierkopf!");
            }
            else{
                p.setInvulnerable(true);
                p.sendMessage(SurvivalSystem.prefix + ChatColor.DARK_RED + "Du bist nun Chefe!");
            }
        }

        return true;
    }
}
