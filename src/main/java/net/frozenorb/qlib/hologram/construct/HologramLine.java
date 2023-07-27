package net.frozenorb.qlib.hologram.construct;
import lombok.Getter;
import lombok.Setter;
import net.frozenorb.qlib.util.EntityUtils;

public class HologramLine {

	@Getter private final int skullId;
	@Getter private final int horseId;

	@Getter @Setter private String text;

	public HologramLine(String text) {
		this.skullId = EntityUtils.getFakeEntityId();
		this.horseId = EntityUtils.getFakeEntityId();
		this.text = text;
	}

}
