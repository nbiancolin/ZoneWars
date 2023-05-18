package io.github.nbiancolin.zonewarsmc.StartRound;

import io.github.nbiancolin.zonewarsmc.StartRound.NewTeamSetup;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AssignTeams implements CommandExecutor {
    NewTeamSetup ts = new NewTeamSetup();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        System.out.println("[MCZW] - zwteams command executed");
        switch(args[0]){
            case "randomize":
                ts.randomizeTeams();
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
            case "printhashmap":
                ts.printhashmap();
                break;
            default:
                sender.sendMessage("[MCZW] Error: Invalid argument passed");
        }



        return true;
    }
}
