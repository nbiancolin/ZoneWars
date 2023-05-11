package io.github.nbiancolin.zonewarsmc.StartRound;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AssignTeams implements CommandExecutor {
    TeamSetup ts = new TeamSetup();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        switch(args[0]){
            case "randomize":
                ts.randomizeAllOnline();
                break;
            case "resetkills":
                ts.resetKills();
                break;
            case "createteams":
                ts.createTeams();
                break;
            default:
                sender.sendMessage("[MCZW] Error: Invalid argument passed");
        }



        return true;
    }
}
