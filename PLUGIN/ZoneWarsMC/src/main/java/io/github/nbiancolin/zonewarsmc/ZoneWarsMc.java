package io.github.nbiancolin.zonewarsmc;

import org.bukkit.plugin.java.JavaPlugin;

public final class ZoneWarsMc extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("Zone Wars Plugin Successfully Started");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Zone Wars Plugin Successfully shut down");
    }
}
