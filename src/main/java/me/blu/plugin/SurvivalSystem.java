package me.blu.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class SurvivalSystem extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("Plugin is running, my sweetie");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin is stopped, du queen");
    }
}
