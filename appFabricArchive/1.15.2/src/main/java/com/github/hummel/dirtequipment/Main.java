package com.github.hummel.dirtequipment;

import com.github.hummel.dirtequipment.init.Items;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "131829122023";

	@Override
	public void onInitialize() {
		Items.register();
	}
}