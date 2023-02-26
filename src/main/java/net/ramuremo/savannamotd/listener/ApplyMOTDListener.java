package net.ramuremo.savannamotd.listener;

import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public final class ApplyMOTDListener implements Listener {
    @EventHandler
    public void onProxyPing(ProxyPingEvent event) {
        final ServerPing serverPing = event.getResponse();
        final String description = "§d§lSavanna §bMinecraft Community Server\n           §e§6> §e§lClick to Join! §6§l<           ";
        serverPing.setDescriptionComponent(new ComponentBuilder(description).create()[0]);
        event.setResponse(serverPing);
    }
}
