package pl.allowsik.apvp;

import org.bukkit.plugin.java.JavaPlugin;
import pl.allowsik.apvp.commands.APvPCommand;

import java.util.Objects;

public final class APvP extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Objects.requireNonNull(getCommand("aping")).setExecutor(new APvPCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
