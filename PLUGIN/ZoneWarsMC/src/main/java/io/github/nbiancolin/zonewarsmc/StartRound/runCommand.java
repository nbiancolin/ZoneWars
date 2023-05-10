package io.github.nbiancolin.zonewarsmc.StartRound;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static org.bukkit.Bukkit.getOnlinePlayers;

public class runCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if(getOnlinePlayers().size() >6){
            System.out.println("[MCZW] ERROR - Cannot start game, too many players online");
            return false;
        }



        return true;
    }
}
