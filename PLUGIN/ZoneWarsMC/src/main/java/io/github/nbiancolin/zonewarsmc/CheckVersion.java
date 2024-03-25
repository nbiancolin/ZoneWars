package io.github.nbiancolin.zonewarsmc;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CheckVersion implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        System.out.print("[MCZW] - Plugin Installed!");
        System.out.print(" Thank you");
        System.out.print(sender.getName());
        System.out.println("for playing!");
        System.out.println("[MCZW] - Version 0.1 Installed");

        return true;
    }
}
