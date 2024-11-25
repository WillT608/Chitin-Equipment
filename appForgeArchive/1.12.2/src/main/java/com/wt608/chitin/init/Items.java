package com.wt608.chitin.init;

import com.wt608.chitin.item.*;
import com.google.common.base.CaseFormat;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({"WeakerAccess", "PublicField"})
public class Items {
	public static final Collection<Item> CONTENT = new ArrayList<>();

	public static Item chitinShell;
	public static Item chitinSword;

	public static Item chitinHelmet;
	public static Item chitinChestplate;
	public static Item chitinLeggings;
	public static Item chitinBoots;

	public static Item chitinShovel;
	public static Item chitinPickaxe;
	public static Item chitinAxe;
	public static Item chitinHoe;

	private Items() {
	}

	public static void register() {
		chitinShell = new ItemChitinShell();

		chitinSword = new ItemChitinSword();

		chitinHelmet = new ItemChitinArmor(EntityEquipmentSlot.HEAD);
		chitinChestplate = new ItemChitinArmor(EntityEquipmentSlot.CHEST);
		chitinLeggings = new ItemChitinArmor(EntityEquipmentSlot.LEGS);
		chitinBoots = new ItemChitinArmor(EntityEquipmentSlot.FEET);

		chitinShovel = new ItemChitinShovel();
		chitinPickaxe = new ItemChitinPickaxe();
		chitinAxe = new ItemChitinAxe();
		chitinHoe = new ItemChitinHoe();

		register(chitinShell, "chitinShell");

		register(chitinSword, "chitinSword");

		register(chitinHelmet, "chitinHelmet");
		register(chitinChestplate, "chitinChestplate");
		register(chitinLeggings, "chitinLeggings");
		register(chitinBoots, "chitinBoots");

		register(chitinShovel, "chitinShovel");
		register(chitinPickaxe, "chitinPickaxe");
		register(chitinAxe, "chitinAxe");
		register(chitinHoe, "chitinHoe");
	}

	private static void register(Item item, String name) {
		String itemName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
		item.setTranslationKey(itemName);
		item.setRegistryName(itemName);
		ForgeRegistries.ITEMS.register(item);
		CONTENT.add(item);
	}
}