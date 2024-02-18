package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.DTAToolMaterials;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.SwordItem;

public class DTAItemSword extends SwordItem {
	public DTAItemSword() {
		super(DTAToolMaterials.DIRT, 3, -2.4f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}