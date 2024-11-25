package com.wt608.chitin.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import static com.wt608.chitin.init.Items.chitinShell;

@SuppressWarnings("WeakerAccess")
public class Materials {
	public static final ItemArmor.ArmorMaterial CHITIN_ARMOR;
	public static final Item.ToolMaterial CHITIN_TOOL;

	private Materials() {
	}

	static {
		CHITIN_ARMOR = EnumHelper.addArmorMaterial("chitin", "chitin", 9, new int[]{2, 3, 2, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.2f);
		CHITIN_ARMOR.setRepairItem(new ItemStack(chitinShell));
		CHITIN_TOOL = EnumHelper.addToolMaterial("chitin", 1, 175, 4.0f, 1.0f, 15);
		CHITIN_TOOL.setRepairItem(new ItemStack(chitinShell));
	}
}