package io.github.nbiancolin.zonewarsmc.WorldSetup;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

public class SetSpawn implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        //4th argument is team name, next is spawn points
        //do stuff
        //
        System.out.println("[MCZW] - Set " + args[3] + "spawn to " + args[0] + " " + args[1] + " " + args[2]);
        return true;
    }
}
