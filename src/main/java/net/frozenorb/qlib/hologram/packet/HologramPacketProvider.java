package net.frozenorb.qlib.hologram.packet;

import net.frozenorb.qlib.hologram.construct.HologramLine;
import org.bukkit.Location;

public interface HologramPacketProvider {

	HologramPacket getPacketsFor(Location location, HologramLine line);

	//TODO: add more versions
}
