package de.winniepat.joinChatClearPlugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class JoinChatClearPlugin extends JavaPlugin {

    private static JoinChatClearPlugin instance;
    public static JoinChatClearPlugin getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        getLogger().info("enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("disabled.");
    }
}
