package net.frozenorb.qlib.autoreboot.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import net.frozenorb.qlib.autoreboot.AutoRebootHandler;
import net.frozenorb.qlib.autoreboot.SilentAutoRebootHandler;
import net.frozenorb.qlib.command.Command;
import net.frozenorb.qlib.command.Param;
import net.frozenorb.qlib.util.TimeUtils;

import java.util.concurrent.TimeUnit;

public class SilentAutoRebootCommand {

    @Command(names={"sreboot"}, permission="server.reboot")
    public static void reboot(CommandSender sender, @Param(name="time") String unparsedTime) {
            unparsedTime = unparsedTime.toLowerCase();
            int time = TimeUtils.parseTime(unparsedTime);
            SilentAutoRebootHandler.rebootServer(time, TimeUnit.SECONDS);
            sender.sendMessage(ChatColor.YELLOW + "Started auto reboot.");
    }

    @Command(names={"sreboot cancel"}, permission="server.reboot")
    public static void rebootCancel(CommandSender sender) {
        if (!SilentAutoRebootHandler.isRebooting()) {
            sender.sendMessage(ChatColor.RED + "No reboot has been scheduled.");
        } else {
            AutoRebootHandler.cancelReboot();
        }
    }

}

