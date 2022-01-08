package me.plugin.tonik152.pinner

import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.ItemFlag
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.ItemMeta
import org.bukkit.potion.PotionEffect

@Suppress("DEPRECATION")
open class Pin(_name: String,_pinLore:String, _effect: PotionEffect, _level: Int, _rarity: String, _itemInInventory: ItemStack) {

    val name: String = _name
    val pinLore: String = _pinLore
    val effect: PotionEffect = _effect
    val level: Int = _level
    val rarity: String = _rarity
    val block: ItemStack = ItemStack(Material.NAME_TAG)
    val itemInInventory: ItemStack = _itemInInventory


    fun makePin(_name: String ,_pinLore: String, _effect: PotionEffect,_level: Int,_rarity: String,_block: ItemStack): ItemStack{

        val pin = ItemStack(_block)
        val pinMeta: ItemMeta = pin.itemMeta
        pinMeta.setDisplayName(_name)
        pinMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,1,true)
        pinMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS)
        val pinLore = arrayListOf<String>()
        pinLore.add(_pinLore)
        pinMeta.setLore(pinLore)
        pin.setItemMeta(pinMeta)

        return pin
    }



}