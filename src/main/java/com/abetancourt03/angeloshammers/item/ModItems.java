package com.abetancourt03.angeloshammers.item;

import com.abetancourt03.angeloshammers.AngelosHammers;
import com.abetancourt03.angeloshammers.item.custom.HammerItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item WODDEN_HAMMER = registerItem("wooden_hammer",
            new HammerItem(1, -3, ToolMaterials.WOOD,
                    BlockTags.PICKAXE_MINEABLE,
                    new FabricItemSettings()));

    public static final Item STONE_HAMMER = registerItem("stone_hammer",
            new HammerItem(1, -3, ToolMaterials.STONE,
                    BlockTags.PICKAXE_MINEABLE,
                    new FabricItemSettings()));

    public static final Item GOLDEN_HAMMER = registerItem("golden_hammer",
            new HammerItem(1, -3, ToolMaterials.GOLD,
                    BlockTags.PICKAXE_MINEABLE,
                    new FabricItemSettings()));

    public static final Item IRON_HAMMER = registerItem("iron_hammer",
            new HammerItem(1, -3, ToolMaterials.IRON,
                    BlockTags.PICKAXE_MINEABLE,
                    new FabricItemSettings()));

    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            new HammerItem(1, -3, ToolMaterials.DIAMOND,
                    BlockTags.PICKAXE_MINEABLE,
                    new FabricItemSettings()));

    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",
            new HammerItem(1, -3, ToolMaterials.NETHERITE,
                    BlockTags.PICKAXE_MINEABLE,
                    new FabricItemSettings()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AngelosHammers.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AngelosHammers.LOGGER.info("Registering Mod Items for " + AngelosHammers.MOD_ID);
    }
}
