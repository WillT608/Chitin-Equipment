package com.wt608.chitin.item;

import com.wt608.chitin.init.Materials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemChitinSword extends ItemSword {
	public ItemChitinSword() {
		super(Materials.CHITIN_TOOL);
		setCreativeTab(CreativeTabs.COMBAT);
	}
}