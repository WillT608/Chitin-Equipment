package com.wt608.chitin.item;

import com.wt608.chitin.material.ToolMaterials;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemGroup;

public class ItemChitinAxe extends AxeItem {
	public ItemChitinAxe() {
		super(ToolMaterials.CHITIN, 5.0f, -3.0f, new Properties().tab(ItemGroup.TAB_TOOLS));
	}
}