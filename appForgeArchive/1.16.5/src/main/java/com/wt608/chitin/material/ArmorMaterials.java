package com.wt608.chitin.material;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import static com.wt608.chitin.init.Items.CHITIN_SHELL;

public enum ArmorMaterials implements IArmorMaterial {

	CHITIN("chitin", 9, new int[] { 2, 3, 2, 2 }, 15,
			SoundEvents.ARMOR_EQUIP_LEATHER, 0.2f, 0.0f, Ingredient.of(CHITIN_SHELL.get()));

	private static final int[] DURABILITY_FOR_SLOT = new int[]{13, 15, 16, 11};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] defenseForSlot;
	private final int enchantmentValue;
	private final SoundEvent equipSound;
	private final float toughness;
	private final Ingredient repairIngredient;
	private final float knockbackResistance;

	ArmorMaterials(String name, int durabilityMultiplier, int[] defenseForSlot, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Ingredient repairIngredient) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.defenseForSlot = defenseForSlot;
		this.enchantmentValue = enchantmentValue;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = repairIngredient;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlotType equipmentSlotType) {
		return defenseForSlot[equipmentSlotType.getIndex()];
	}

	@Override
	public int getDurabilityForSlot(EquipmentSlotType equipmentSlotType) {
		return DURABILITY_FOR_SLOT[equipmentSlotType.getIndex()] * durabilityMultiplier;
	}

	@Override
	public int getEnchantmentValue() {
		return enchantmentValue;
	}

	@Override
	public SoundEvent getEquipSound() {
		return equipSound;
	}

	@Override
	public float getKnockbackResistance() {
		return knockbackResistance;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return repairIngredient;
	}

	@Override
	public float getToughness() {
		return toughness;
	}
}