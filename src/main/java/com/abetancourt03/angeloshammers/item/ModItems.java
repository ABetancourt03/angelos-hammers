package com.abetancourt03.angeloshammers.item;

import com.abetancourt03.angeloshammers.AngelosHammers;
import com.abetancourt03.angeloshammers.item.custom.HammerItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item WODDEN_HAMMER = registerItem("wooden_hammer",
            new HammerItem(ToolMaterials.WOOD,
                    new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(
                            ToolMaterials.WOOD, 1, -3
                    ))));

    public static final Item STONE_HAMMER = registerItem("stone_hammer",
            new HammerItem(ToolMaterials.STONE,
                    new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(
                            ToolMaterials.STONE, 1, -3
                    ))));

    public static final Item GOLDEN_HAMMER = registerItem("golden_hammer",
            new HammerItem(ToolMaterials.GOLD,
                    new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(
                            ToolMaterials.GOLD, 1, -3
                    ))));

    public static final Item IRON_HAMMER = registerItem("iron_hammer",
            new HammerItem(ToolMaterials.IRON,
                    new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(
                            ToolMaterials.IRON, 1, -3
                    ))));

    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            new HammerItem(ToolMaterials.DIAMOND,
                    new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(
                            ToolMaterials.DIAMOND, 1, -3
                    ))));

    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",
            new HammerItem(ToolMaterials.NETHERITE,
                    new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(
                            ToolMaterials.NETHERITE, 1, -3
                    ))));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AngelosHammers.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AngelosHammers.LOGGER.info("Registering Mod Items for " + AngelosHammers.MOD_ID);
    }
}
