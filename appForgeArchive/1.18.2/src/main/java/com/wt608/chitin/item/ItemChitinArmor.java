package com.wt608.chitin.item;

import com.wt608.chitin.material.ArmorMaterials;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ItemChitinArmor extends ArmorItem {
	public ItemChitinArmor(EquipmentSlot equipmentSlot) {
		super(ArmorMaterials.CHITIN, equipmentSlot, new Properties().tab(CreativeModeTab.TAB_COMBAT));
	}

	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity, EquipmentSlot equipmentSlot, String layer) {
		return "chitin:textures/models/armor/chitin_layer_" + (equipmentSlot == EquipmentSlot.LEGS ? 2 : 1) + ".png";
	}
}