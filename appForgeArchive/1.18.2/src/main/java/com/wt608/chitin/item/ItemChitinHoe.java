package com.wt608.chitin.item;

import com.wt608.chitin.material.ToolMaterials;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HoeItem;

public class ItemChitinHoe extends HoeItem {
	public ItemChitinHoe() {
		super(ToolMaterials.CHITIN, -3, 0.0f, new Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}