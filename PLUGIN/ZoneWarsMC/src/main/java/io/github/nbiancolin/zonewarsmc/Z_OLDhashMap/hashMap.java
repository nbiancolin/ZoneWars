package io.github.nbiancolin.zonewarsmc.Z_OLDhashMap;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class hashMap extends JavaPlugin implements Listener {
    public static Map<Player, Character> map = new HashMap<>();
    Random rand = new Random();
    static char[] teamArr = {'g', 'r', 'b', 'o', 'y', 'm'};

    public static void set(Player p, char c){
        map.put(p,c);
    }

    public void randomizeTeams(){ //This function might be O(n!) but I don't give a fuck
        System.out.println("[ZONE WARS] Randomizing Teams");
        map.clear(); //clears map.
        int numPlayers = getServer().getOnlinePlayers().size();
        char[] dcTeamArr = Arrays.copyOf(teamArr, teamArr.length); //deep copy of array

        for (Player p : getServer().getOnlinePlayers()) {
            int i = rand.nextInt(numPlayers);
            while(dcTeamArr[i] == '&'){
                i = rand.nextInt(numPlayers);
            }
            map.put(p, dcTeamArr[i]);
            System.out.println(p.getName() +" has been added");
            dcTeamArr[i] = '&'; //ampersand is the dummy variable that says that the team is chosen already.
        }
    }
}
