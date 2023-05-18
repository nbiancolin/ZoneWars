package io.github.nbiancolin.zonewarsmc.StartRound;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

import java.util.HashMap;
import java.util.Random;

import static org.bukkit.Bukkit.*;
import static org.bukkit.scoreboard.Criteria.PLAYER_KILL_COUNT;

public class NewTeamSetup {

    public HashMap<Player, String> teams = new HashMap<Player, String>();
    String[] teamNames = new String[]{"green", "red", "blue", "orange", "yellow", "magenta"};

    public Team[] oldTeams = new Team[6];

    public void createTeams() {
        teams.put(null, "test");
        teams.put(null, "green");
        teams.put(null, "red");
        teams.put(null, "blue");
        teams.put(null, "orange");
        teams.put(null, "yellow");
        teams.put(null, "magenta");
        System.out.println("[MCZW] (createteams) teams hashmap created");

        //do it with bukkit to bc why the fuck not but use hashmap primarily
        ScoreboardManager manager = getScoreboardManager();
        Scoreboard board = manager.getNewScoreboard();

        Team team = board.registerNewTeam("test");

        Team greenT = board.registerNewTeam("green");
        Team redT = board.registerNewTeam("red");
        Team blueT = board.registerNewTeam("blue");
        Team orangeT = board.registerNewTeam("orange");
        Team yellowT = board.registerNewTeam("yellow");
        Team magentaT = board.registerNewTeam("magentaT");

        Team[] oldTeams = {greenT, redT, blueT, orangeT, yellowT, magentaT}; //public?


        greenT.setPrefix(ChatColor.GREEN + "Green"); //could make into loop but who gives a shit at this point
        redT.setPrefix(ChatColor.RED + "Red");
        blueT.setPrefix(ChatColor.BLUE + "Blue");
        orangeT.setPrefix(ChatColor.getByChar("ff9102")+ "Orange");
        //orangeT.setPrefix(ChatColor.MAGIC + "Green");
        yellowT.setPrefix(ChatColor.YELLOW + "Yellow");
        magentaT.setPrefix(ChatColor.LIGHT_PURPLE + "Magenta");
        System.out.println("[MCZW] (createteams) legacy created");
    }

    public void resetKills(){
        ScoreboardManager manager = getScoreboardManager();
        Scoreboard board = manager.getMainScoreboard();

        try{ //Ok this part of Java is kind of cool
            Objective kills = board.getObjective("kills");
        }
        catch (Exception e){
            Objective kills = board.registerNewObjective("kills", PLAYER_KILL_COUNT, "Kills");
        }
        //Objective greenK =  board.registerNewObjective("greenK", TEAM_KILL_GREEN, "Green Kills"); //For statistics after the round (implement later?)
    }

    public void randomizeTeams(){
        teams.clear();
        Player[] p = generatePlayerList();
        shuffleArray(p);
        for(int i = 0; i < 6; i++){
            teams.put(p[i], teamNames[i]);
            oldTeams[i].addEntry(p[i].getName());
            System.out.println("[MCZW] (randomize teams)" + p[i].getName() + " has been added to" + oldTeams[i].getDisplayName());
        }
    }

    public Player[] generatePlayerList(){
        int num = getOnlinePlayers().size();
        Player[] players = new Player[num];
        int i = 0;
        for(Player p : getServer().getOnlinePlayers()){
            players[i] = p;
            i++;
        }
        return players;
    }

    private static void shuffleArray(Player[] array) {
        int index;
        Player temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
