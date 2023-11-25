package me.blu.plugin.listeners;

import me.blu.plugin.SurvivalSystem;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class JoinLeaveListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();

        if (player.hasPlayedBefore()){
            e.setJoinMessage(SurvivalSystem.prefix + ChatColor.GREEN + "Hey!, freut mich das du wieder da bist,  " + ChatColor.DARK_RED + ChatColor.UNDERLINE + player.getDisplayName());
            player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
    }
        else{
            e.setJoinMessage(SurvivalSystem.prefix + ChatColor.GREEN + "Du bist also neu du Banause, viel Spaß " + ChatColor.DARK_RED + player.getDisplayName() + ChatColor.GREEN + " auf unserem Server!");
            player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
        }
    }
}
