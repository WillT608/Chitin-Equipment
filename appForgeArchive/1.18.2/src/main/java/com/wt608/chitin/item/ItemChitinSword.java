package com.wt608.chitin.item;

import com.wt608.chitin.material.ToolMaterials;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.SwordItem;

public class ItemChitinSword extends SwordItem {
	public ItemChitinSword() {
		super(ToolMaterials.CHITIN, 3, -2.4f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}