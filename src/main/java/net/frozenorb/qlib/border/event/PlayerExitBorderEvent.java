package net.frozenorb.qlib.border.event;

import net.frozenorb.qlib.border.Border;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class PlayerExitBorderEvent extends PlayerBorderEvent {

    private final Location from;
    private final Location to;

    public PlayerExitBorderEvent(Border border, Player player, Location from, Location to) {
        super(border, player);
        this.from = from;
        this.to = to;
    }

    public Location getFrom() {
        return this.from;
    }

    public Location getTo() {
        return this.to;
    }
}

