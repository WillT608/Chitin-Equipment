package com.wt608.chitin.item;

import com.wt608.chitin.init.Materials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemChitinArmor extends ItemArmor {
	public ItemChitinArmor(EntityEquipmentSlot entityEquipmentSlot) {
		super(Materials.CHITIN_ARMOR, entityEquipmentSlot == EntityEquipmentSlot.LEGS ? 2 : 1, entityEquipmentSlot);
		setCreativeTab(CreativeTabs.COMBAT);
	}

	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity, EntityEquipmentSlot entityEquipmentSlot, String layer) {
		return "chitin:textures/models/armor/chitin_layer_" + (entityEquipmentSlot == EntityEquipmentSlot.LEGS ? 2 : 1) + ".png";
	}
}