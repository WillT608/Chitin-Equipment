package com.wt608.chitin.item;

import com.wt608.chitin.material.ToolMaterials;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.PickaxeItem;

public class ItemChitinPickaxe extends PickaxeItem {
	public ItemChitinPickaxe() {
		super(ToolMaterials.CHITIN, 1, -2.8f, new Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}