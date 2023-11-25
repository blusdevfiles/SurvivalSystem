package me.blu.plugin;

import me.blu.plugin.commands.chefemode;
import me.blu.plugin.commands.feed;
import me.blu.plugin.commands.fly;
import me.blu.plugin.commands.heal;
import me.blu.plugin.listeners.JoinLeaveListener;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class SurvivalSystem extends JavaPlugin {

    public final static String prefix =
            ChatColor.LIGHT_PURPLE + "" + ChatColor.MAGIC + "g" + ChatColor.LIGHT_PURPLE + "" + "[SurvivalSystem]" + ChatColor.LIGHT_PURPLE + "" + ChatColor.MAGIC + "g ";

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin is running, my sweetie");
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
        getCommand("chefe").setExecutor(new chefemode());
        getCommand("feed").setExecutor(new feed());
        getCommand("heal").setExecutor(new heal());
        getCommand("fly").setExecutor(new fly());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin is stopped, du queen");
    }
}
