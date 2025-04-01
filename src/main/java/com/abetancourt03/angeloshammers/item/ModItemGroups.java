package com.abetancourt03.angeloshammers.item;

import com.abetancourt03.angeloshammers.AngelosHammers;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ANGELOS_HAMMERS_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AngelosHammers.MOD_ID, "items_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.NETHERITE_HAMMER))
                    .displayName(Text.translatable("itemgroup.angeloshammers.items_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.WODDEN_HAMMER);
                        entries.add(ModItems.STONE_HAMMER);
                        entries.add(ModItems.GOLDEN_HAMMER);
                        entries.add(ModItems.IRON_HAMMER);
                        entries.add(ModItems.DIAMOND_HAMMER);
                        entries.add(ModItems.NETHERITE_HAMMER);
                    }).build());

    public static void registerItemGroups() {
        AngelosHammers.LOGGER.info("Registering Item Groups for " + AngelosHammers.MOD_ID);
    }
}
