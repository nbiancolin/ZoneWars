package io.github.nbiancolin.zonewarsmc;

import io.github.nbiancolin.zonewarsmc.Z_OLDGameMechanics.bridgeStick; //you have to import the package as well
import io.github.nbiancolin.zonewarsmc.Z_OLDhashMap.hashMap;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class ZoneWarsMc extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(this,this);
        getServer().getPluginManager().registerEvents(new bridgeStick(), this); //leaving this to know how to add stuff
        System.out.println("Zone Wars Plugin Successfully Started");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        System.out.println("A Player has Joined");
        //don't forget to register events that are created!
        Player player = event.getPlayer();
        String name = player.getName();
        event.setJoinMessage("Welcome, " + name + ", to Zone Wars!");
        //hashMap.set(event.getPlayer(), '0'); //Using 0 as the null character, and Z for the "used" character

    }

    //Make an event handler to start the game in the main file

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Zone Wars Plugin Successfully shut down");
    }
}
