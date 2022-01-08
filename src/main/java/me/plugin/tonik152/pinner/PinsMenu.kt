package me.plugin.tonik152.pinner

import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.ItemMeta

class PinsMenu: CommandExecutor {


    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        val player = sender as Player


        openPinsMenu(player)

        return true
    }


    fun openPinsMenu(_player: Player){

        if(_player is Player){
            val p =  _player

            val gui: Inventory = Bukkit.createInventory(p, 9,"Your Pins")

            p.openInventory(gui)
        }

    }

}