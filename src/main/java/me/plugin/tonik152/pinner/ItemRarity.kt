package me.plugin.tonik152.pinner

enum class ItemRarity {

    COMMON,
    RARE,
    EPIC,
    LEGENDARY,
    OBSCURE

}

fun assing(rarity: ItemRarity) = when (rarity){



        ItemRarity.COMMON -> "Common"
        ItemRarity.RARE -> "Rare"
        ItemRarity.EPIC -> "Epic"
        ItemRarity.LEGENDARY -> "Legendary"
        ItemRarity.OBSCURE -> "Onscure"

}