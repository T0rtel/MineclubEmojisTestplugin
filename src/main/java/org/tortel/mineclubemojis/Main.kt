package org.tortel.mineclubemojis

import org.tortel.mineclubemojis.Commands.EmojisCommand
import org.tortel.mineclubemojis.Events.OnPlayerChat
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("Started Plugin")
        registerEvents()
    }

    private fun registerEvents() {
        server.pluginManager.registerEvents(OnPlayerChat(), this)

        getCommand("emojis")?.setExecutor(EmojisCommand())
    }
    override fun onDisable() {
        // Plugin shutdown logic
    }
}
