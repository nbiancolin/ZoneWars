package io.github.nbiancolin.zonewarsmc.InitialStartupThings;

import org.bukkit.scoreboard.Scoreboard;

import static org.bukkit.Bukkit.getScoreboardManager;

public class createTeams {

    public static final Scoreboard score = getScoreboardManager().getNewScoreboard();

    private void loadTeam() {
        createTeam("test");
    }

    private void createTeam(String teamName) {
        Scoreboard board = score;
        if(board.getTeam(teamName) != null)
            board.getTeam(teamName).unregister();
        board.registerNewTeam(teamName);
        board.getTeam(teamName).setCanSeeFriendlyInvisibles(true);
    }
}
