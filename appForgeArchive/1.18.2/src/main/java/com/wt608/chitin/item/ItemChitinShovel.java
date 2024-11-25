package com.wt608.chitin.item;

import com.wt608.chitin.material.ToolMaterials;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ShovelItem;

public class ItemChitinShovel extends ShovelItem {
	public ItemChitinShovel() {
		super(ToolMaterials.CHITIN, 1.5f, -3.0f, new Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}