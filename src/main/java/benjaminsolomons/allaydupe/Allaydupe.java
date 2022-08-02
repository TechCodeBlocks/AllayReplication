package benjaminsolomons.allaydupe;

import org.bukkit.plugin.java.JavaPlugin;

public final class Allaydupe extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Unleash(), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
