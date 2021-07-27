package com.kinoko2k.call56nickname;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Call56Listener implements Listener {

    public Call56nickname plugin;

    public Call56Listener(Call56nickname instance) {
        plugin = instance;
    }

    @EventHandler
    public void onPlayerLogin(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        plugin.newPlayer(p);
    }
}