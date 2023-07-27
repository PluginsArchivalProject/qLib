package net.frozenorb.qlib.scoreboard;

import net.frozenorb.qlib.util.LinkedList;
import org.bukkit.entity.Player;

public interface ScoreGetter {

    void getScores(LinkedList<String> var1, Player var2);

}

