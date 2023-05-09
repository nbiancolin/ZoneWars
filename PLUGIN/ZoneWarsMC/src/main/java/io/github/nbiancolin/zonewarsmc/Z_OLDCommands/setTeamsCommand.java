package io.github.nbiancolin.zonewarsmc.Z_OLDCommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class setTeamsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        System.out.println("Something");
        /*
        if(sender instanceof Player && args[0].length() == 1){
            Player p = (Player) sender;
            switch(args[0]){
                case "green":
                    io.github.nbiancolin.zonewarsmc.hashMap.hashMap.set(p, 'g');
                    System.out.println(p.getName() + " Has joined the green team");
                    break;
                case "red":
                    io.github.nbiancolin.zonewarsmc.hashMap.hashMap.set(p, 'r');
                    System.out.println(p.getName() + " Has joined the green team");
                    break;
            } */

        return false;
        }

    }

