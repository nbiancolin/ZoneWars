package io.github.nbiancolin.zonewarsmc;

import io.github.nbiancolin.zonewarsmc.InitialStartupThings.scoreHelper;
import io.github.nbiancolin.zonewarsmc.StartRound.*;
import io.github.nbiancolin.zonewarsmc.Z_OLDGameMechanics.bridgeStick; //you have to import the package as well
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class ZoneWarsMc extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(this,this);
        getServer().getPluginManager().registerEvents(new bridgeStick(), this); //leaving this to know how to add stuff
        getServer().getPluginManager().registerEvents(new runCommand(), this); //how the fuck to register a command thingy
        //getServer().getPluginManager().registerEvents(new createTeams(), this); //wait how does this work //does it have to be an event handeler or can I just call it?
        new teamSetup(); //figure out how to call this from main function (ish)
        new teamSetup().createTeams();
        System.out.println("Zone Wars Plugin Successfully Started");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        //scoreHelper helper = scoreHelper.createScore(player);
        //helper.setTitle("&aTutorial &eA");
        //helper.setSlot(3, "&7&m--------------------------------");
        //helper.setSlot(2, "&aPlayer&f: " + player.getName());
        //helper.setSlot(1, "&7&m--------------------------------");
        System.out.println("A Player has Joined");
        //don't forget to register events that are created!
        String name = player.getName();
        event.setJoinMessage("Welcome, " + name + ", to Zone Wars!");
        teamSetup()
        //hashMap.set(event.getPlayer(), '0'); //Using 0 as the null character, and Z for the "used" character

    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        if(scoreHelper.hasScore(player)) {
            scoreHelper.removeScore(player);
        }
    }

    //Make an event handler to start the game in the main file

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Zone Wars Plugin Successfully shut down");
    }
}
