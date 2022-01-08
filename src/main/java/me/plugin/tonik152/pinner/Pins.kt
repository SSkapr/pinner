package me.plugin.tonik152.pinner

import org.bukkit.Effect
import org.bukkit.entity.Item
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class Pins {


    fun makePins(){

        val LifePin1: Pin = Pin(PotionEffect(PotionEffectType.HEALTH_BOOST,1,1),1, assing(ItemRarity.RARE))
        val LifePin2: Pin = Pin(PotionEffect(PotionEffectType.HEALTH_BOOST,1,2),1, assing(ItemRarity.LEGENDARY))
        val LifePin3: Pin = Pin(PotionEffect(PotionEffectType.HEALTH_BOOST,1,3),1, assing(ItemRarity.OBSCURE))

        val DamagePin1: Pin = Pin(PotionEffect(PotionEffectType.INCREASE_DAMAGE,1,1),1, assing(ItemRarity.RARE))
        val DamagePin2: Pin = Pin(PotionEffect(PotionEffectType.INCREASE_DAMAGE,1,2),1, assing(ItemRarity.LEGENDARY))
        val DamagePin3: Pin = Pin(PotionEffect(PotionEffectType.INCREASE_DAMAGE,1,3),1, assing(ItemRarity.OBSCURE))

    }

}