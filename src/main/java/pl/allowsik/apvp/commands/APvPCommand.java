package pl.allowsik.apvp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pl.allowsik.apvp.DuelQueue;

public class APvPCommand implements CommandExecutor {
  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    DuelQueue queue = DuelQueue.getInstance();
    if (queue.isInQueue(sender.getName())) {
      queue.removePlayer(sender.getName());
    } else {
      queue.addPlayer(sender.getName());
    }
    return true;
  }

}
