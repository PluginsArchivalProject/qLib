package net.frozenorb.qlib.deathmessage.listener;

import net.frozenorb.qlib.qLib;
import net.frozenorb.qlib.deathmessage.FrozenDeathMessageHandler;
import net.frozenorb.qlib.deathmessage.damage.UnknownDamage;
import net.frozenorb.qlib.deathmessage.event.CustomPlayerDamageEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public final class DamageListener implements Listener {

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void onEntityDamage(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player) {
            Player player = (Player)event.getEntity();
            CustomPlayerDamageEvent customEvent = new CustomPlayerDamageEvent(event);
            customEvent.setTrackerDamage(new UnknownDamage(player.getUniqueId(), customEvent.getDamage()));
            qLib.getInstance().getServer().getPluginManager().callEvent(customEvent);
            FrozenDeathMessageHandler.addDamage(player, customEvent.getTrackerDamage());
        }
    }

}

