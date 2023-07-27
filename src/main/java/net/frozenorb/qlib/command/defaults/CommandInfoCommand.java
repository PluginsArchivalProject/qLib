package net.frozenorb.qlib.command.defaults;

import net.frozenorb.qlib.command.ArgumentProcessor;
import net.frozenorb.qlib.command.CommandNode;
import net.frozenorb.qlib.command.Arguments;
import net.frozenorb.qlib.command.Command;
import net.frozenorb.qlib.command.FrozenCommandHandler;
import net.frozenorb.qlib.command.Param;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandInfoCommand {

    @Command(names={"cmdinfo"}, permission= "op", hidden= true)
    public static void commandInfo(CommandSender sender, @Param(name="commands", wildcard=true) String command) {
        CommandNode realNode;
        ArgumentProcessor processor = new ArgumentProcessor();
        String[] args = command.split(" ");
        Arguments arguments = processor.process(args);
        CommandNode node = FrozenCommandHandler.ROOT_NODE.getCommand(arguments.getArguments().get(0));
        if (node != null && (realNode = node.findCommand(arguments)) != null) {
            JavaPlugin plugin = JavaPlugin.getProvidingPlugin(realNode.getOwningClass());
            sender.sendMessage(ChatColor.YELLOW + "Command '" + realNode.getFullLabel() + "' belongs to " + plugin.getName());
            return;
        }
        sender.sendMessage(ChatColor.RED + "Command not found.");
    }

}

