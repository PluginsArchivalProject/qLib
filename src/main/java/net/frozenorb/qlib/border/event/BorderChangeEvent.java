package net.frozenorb.qlib.border.event;

import net.frozenorb.qlib.cuboid.Cuboid;
import net.frozenorb.qlib.border.Border;
import net.frozenorb.qlib.border.BorderTask;

public class BorderChangeEvent extends BorderEvent {

    private int previousSize;
    private final Cuboid previousBounds;
    private final BorderTask.BorderAction action;

    public BorderChangeEvent(Border border, int previousSize, Cuboid previousBounds, BorderTask.BorderAction action) {
        super(border);
        this.previousBounds = previousBounds;
        this.action = action;
    }

    public int getPreviousSize() {
        return this.previousSize;
    }

    public Cuboid getPreviousBounds() {
        return this.previousBounds;
    }

    public BorderTask.BorderAction getAction() {
        return this.action;
    }
}

