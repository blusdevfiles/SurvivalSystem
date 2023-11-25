package me.blu.plugin;

import me.blu.plugin.commands.chefemode;
import me.blu.plugin.commands.feed;
import me.blu.plugin.commands.heal;
import me.blu.plugin.listeners.JoinLeaveListener;
import me.blu.plugin.listeners.XPBottleBreakListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class SurvivalSystem extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("Plugin is running, my sweetie");
        getServer().getPluginManager().registerEvents(new XPBottleBreakListener(), this);
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
        getCommand("chefe").setExecutor(new chefemode());
        getCommand("feed").setExecutor(new feed());
        getCommand("heal").setExecutor(new heal());
        getCommand("cc").setExecutor(());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin is stopped, du queen");
    }
}
