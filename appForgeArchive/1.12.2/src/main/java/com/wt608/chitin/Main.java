package com.wt608.chitin;

import com.wt608.chitin.handler.ForgeEventHandler;
import com.wt608.chitin.handler.LootEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventBus;

@Mod(modid = "chitin", useMetadata = true)
public class Main {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "111229022024";

	public Main() {
		EventBus forgeEventBus = MinecraftForge.EVENT_BUS;
		ForgeEventHandler forgeEventHandler = new ForgeEventHandler();
		LootEventHandler lootEventHandler = new LootEventHandler();
		forgeEventBus.register(forgeEventHandler);
		forgeEventBus.register(lootEventHandler);
	}
}