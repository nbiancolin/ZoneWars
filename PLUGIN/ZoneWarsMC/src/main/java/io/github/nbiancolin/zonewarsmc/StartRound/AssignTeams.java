package io.github.nbiancolin.zonewarsmc.StartRound;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AssignTeams implements CommandExecutor {
    TeamSetup ts = new TeamSetup();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        System.out.println("[MCZW] - zwteams command executed");
        switch(args[0]){
            case "randomize":
                ts.randomizeAllOnline();
                System.out.println("[MCZW] (zwteams) Teams Randomized");
                break;
            case "resetkills":
                ts.resetKills();
                System.out.println("[MCZW] (zwteams) Kills Reset");
                break;
            case "createteams":
                ts.createTeams();
                System.out.println("[MCZW] (zwteams) Teams created");
                break;
            default:
                sender.sendMessage("[MCZW] Error: Invalid argument passed");
        }



        return true;
    }
}
