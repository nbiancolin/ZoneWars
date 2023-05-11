package io.github.nbiancolin.zonewarsmc.StartRound;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static org.bukkit.Bukkit.getOnlinePlayers;

public class RunCommand implements CommandExecutor {

    TeamSetup ts = new TeamSetup();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        System.out.println("[MCZW] Start game command executed");

        if(getOnlinePlayers().size() >6){
            System.out.println("[MCZW] ERROR - Cannot start game, too many players online");
            return false;
        }

        ts.randomizeAllOnline(); //create teams
        ts.resetKills();




        return true;
    }
}
