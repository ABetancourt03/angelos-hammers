package com.abetancourt03.angeloshammers;

import com.abetancourt03.angeloshammers.item.ModItemGroups;
import com.abetancourt03.angeloshammers.item.ModItems;
import com.abetancourt03.angeloshammers.util.HammerUsageEvent;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AngelosHammers implements ModInitializer {
	public static final String MOD_ID = "angeloshammers";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());
	}
}