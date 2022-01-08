package me.plugin.tonik152.pinner

import org.bukkit.plugin.java.JavaPlugin

class Pinner : JavaPlugin() {
    override fun onEnable() {
        logger.info("Enabled")

        getCommand("mypins")!!.setExecutor(PinsMenu())

    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}