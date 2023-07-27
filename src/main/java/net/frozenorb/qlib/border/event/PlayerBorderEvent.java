package net.frozenorb.qlib.border.event;

import net.frozenorb.qlib.border.Border;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

public class PlayerBorderEvent extends BorderEvent implements Cancellable {

    private final Player player;
    private boolean cancelled = false;

    public PlayerBorderEvent(Border border, Player player) {
        super(border);
        this.player = player;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    public Player getPlayer() {
        return this.player;
    }
}

