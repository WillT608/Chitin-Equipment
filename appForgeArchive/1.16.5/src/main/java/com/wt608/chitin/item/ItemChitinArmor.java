package com.wt608.chitin.item;

import com.wt608.chitin.material.ArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemChitinArmor extends ArmorItem {
	public ItemChitinArmor(EquipmentSlotType equipmentSlotType) {
		super(ArmorMaterials.CHITIN, equipmentSlotType, new Properties().tab(ItemGroup.TAB_COMBAT));
	}

	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity, EquipmentSlotType equipmentSlotType, String layer) {
		return "chitin:textures/models/armor/chitin_layer_" + (equipmentSlotType == EquipmentSlotType.LEGS ? 2 : 1) + ".png";
	}
}