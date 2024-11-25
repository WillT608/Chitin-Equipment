package com.wt608.chitin.material;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import static com.wt608.chitin.init.Items.CHITIN_SHELL;

public enum ToolMaterials implements IItemTier {
	CHITIN(1, 175, 4.0f, 1.0f, 15, Ingredient.of(CHITIN_SHELL.get()));

	private final int level;
	private final int uses;
	private final float speed;
	private final float attackDamageBonus;
	private final int enchantmentValue;
	private final Ingredient repairIngredient;

	ToolMaterials(int level, int uses, float speed, float attackDamageBonus, int enchantmentValue, Ingredient repairIngredient) {
		this.level = level;
		this.uses = uses;
		this.speed = speed;
		this.attackDamageBonus = attackDamageBonus;
		this.enchantmentValue = enchantmentValue;
		this.repairIngredient = repairIngredient;
	}

	@Override
	public float getAttackDamageBonus() {
		return attackDamageBonus;
	}

	@Override
	public int getEnchantmentValue() {
		return enchantmentValue;
	}

	@Override
	public int getLevel() {
		return level;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return repairIngredient;
	}

	@Override
	public float getSpeed() {
		return speed;
	}

	@Override
	public int getUses() {
		return uses;
	}
}