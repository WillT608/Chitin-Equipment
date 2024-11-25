package com.wt608.chitin.item;

import com.wt608.chitin.material.ToolMaterials;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class ItemChitinSword extends SwordItem {
	public ItemChitinSword() {
		super(ToolMaterials.CHITIN, 3, -2.4f, new Properties().tab(ItemGroup.TAB_COMBAT));
	}
}