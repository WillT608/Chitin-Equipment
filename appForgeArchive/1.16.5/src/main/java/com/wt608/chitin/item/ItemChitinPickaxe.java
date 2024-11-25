package com.wt608.chitin.item;

import com.wt608.chitin.material.ToolMaterials;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;

public class ItemChitinPickaxe extends PickaxeItem {
	public ItemChitinPickaxe() {
		super(ToolMaterials.CHITIN, 1, -2.8f, new Properties().tab(ItemGroup.TAB_TOOLS));
	}
}