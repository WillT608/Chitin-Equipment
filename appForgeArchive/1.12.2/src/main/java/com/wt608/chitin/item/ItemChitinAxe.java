package com.wt608.chitin.item;

import com.wt608.chitin.init.Materials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemChitinAxe extends ItemAxe {
	public ItemChitinAxe() {
		super(Materials.CHITIN_TOOL, 5.0f, -3.0f);
		setCreativeTab(CreativeTabs.TOOLS);
	}
}