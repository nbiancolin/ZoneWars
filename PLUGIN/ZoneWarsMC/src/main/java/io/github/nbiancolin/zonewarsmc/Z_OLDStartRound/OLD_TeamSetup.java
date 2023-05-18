package io.github.nbiancolin.zonewarsmc.Z_OLDStartRound;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

import java.util.Random;

import static org.bukkit.Bukkit.*;
import static org.bukkit.scoreboard.Criteria.*;



public class OLD_TeamSetup {

    public static Team[] teams;// = new Team[6];

    static Location[] spawnLocations = new Location[6];
    //fill in these;

    public void createTeams() {
        ScoreboardManager manager = getScoreboardManager();
        Scoreboard board = manager.getNewScoreboard();

        Team team = board.registerNewTeam("test");

        Team greenT = board.registerNewTeam("green");
        Team redT = board.registerNewTeam("red");
        Team blueT = board.registerNewTeam("blue");
        Team orangeT = board.registerNewTeam("orange");
        Team yellowT = board.registerNewTeam("yellow");
        Team magentaT = board.registerNewTeam("magentaT");

        teams = new Team[]{greenT, redT, blueT, orangeT, yellowT, magentaT}; //public?

        greenT.setPrefix(ChatColor.GREEN + "Green"); //could make into loop but who gives a shit at this point
        redT.setPrefix(ChatColor.RED + "Red");
        blueT.setPrefix(ChatColor.BLUE + "Blue");
        orangeT.setPrefix(ChatColor.getByChar("ff9102")+ "Orange");
        //orangeT.setPrefix(ChatColor.MAGIC + "Green");
        yellowT.setPrefix(ChatColor.YELLOW + "Yellow");
        magentaT.setPrefix(ChatColor.LIGHT_PURPLE + "Magenta");

    }

    public void resetKills() {
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

    public void randomizeSpecificTeams(Player[] players){
        shuffleArray(players);
        for(int i = 0; i < players.length; i++){
            teams[i].addEntry(players[i].getName());
            System.out.println("[MCZW] " + players[i].getName() + " has been added to" + teams[i].getDisplayName());
        }

    }

    public void randomizeAllOnline(){
        int num = getOnlinePlayers().size();
        Player[] players = new Player[num];
        int i = 0;
        for(Player p : getServer().getOnlinePlayers()){
            players[i] = p;
            i++;
        }
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
