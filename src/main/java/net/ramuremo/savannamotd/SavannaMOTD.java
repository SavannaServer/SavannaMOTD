package net.ramuremo.savannamotd;

import net.md_5.bungee.api.plugin.Plugin;
import net.ramuremo.savannamotd.listener.ApplyMOTDListener;

public final class SavannaMOTD extends Plugin {

    @Override
    public void onEnable() {
        getProxy().getPluginManager().registerListener(this, new ApplyMOTDListener());
        getLogger().info("The plugin has been enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("The plugin has been disabled.");
    }
}
