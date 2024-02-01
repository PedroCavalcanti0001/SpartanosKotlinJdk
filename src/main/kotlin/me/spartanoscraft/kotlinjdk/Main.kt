package me.spartanoscraft.kotlinjdk

import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {

    companion object {
        lateinit var singleton: Main
    }

    override fun onEnable() {
        singleton = this
    }
}