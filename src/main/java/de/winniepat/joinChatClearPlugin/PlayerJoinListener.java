package de.winniepat.joinChatClearPlugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        new BukkitRunnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    player.sendMessage("");
                }
                player.sendMessage("§e" + player.getName() + " joined the game");
            }
        }.runTaskLater(JoinChatClearPlugin.getInstance(), 20L);

    }
}
