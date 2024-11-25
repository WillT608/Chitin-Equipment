package com.wt608.chitin.item;

import com.wt608.chitin.init.Materials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ItemChitinShovel extends ItemSpade {
	public ItemChitinShovel() {
		super(Materials.CHITIN_TOOL);
		setCreativeTab(CreativeTabs.TOOLS);
	}
}