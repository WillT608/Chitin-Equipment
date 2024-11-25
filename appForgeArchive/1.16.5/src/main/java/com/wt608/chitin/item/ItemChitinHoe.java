package com.wt608.chitin.item;

import com.wt608.chitin.material.ToolMaterials;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemGroup;

public class ItemChitinHoe extends HoeItem {
	public ItemChitinHoe() {
		super(ToolMaterials.CHITIN, -3, 0.0f, new Properties().tab(ItemGroup.TAB_TOOLS));
	}
}