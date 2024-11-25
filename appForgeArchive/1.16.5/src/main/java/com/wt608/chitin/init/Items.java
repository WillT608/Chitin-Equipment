package com.wt608.chitin.init;

import com.wt608.chitin.item.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("WeakerAccess")
public class Items {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "chitin");

	public static final RegistryObject<Item> CHITIN_SHELL = REGISTRY.register("chitin_shell", ItemChitinShell::new);
	public static final RegistryObject<Item> CHITIN_SWORD = REGISTRY.register("chitin_sword", ItemChitinSword::new);

	public static final RegistryObject<Item> CHITIN_HELMET = REGISTRY.register("chitin_helmet", () -> new ItemChitinArmor(EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> CHITIN_CHESTPLATE = REGISTRY.register("chitin_chestplate", () -> new ItemChitinArmor(EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> CHITIN_LEGGINGS = REGISTRY.register("chitin_leggings", () -> new ItemChitinArmor(EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> CHITIN_BOOTS = REGISTRY.register("chitin_boots", () -> new ItemChitinArmor(EquipmentSlotType.FEET));

	public static final RegistryObject<Item> CHITIN_SHOVEL = REGISTRY.register("chitin_shovel", ItemChitinShovel::new);
	public static final RegistryObject<Item> CHITIN_PICKAXE = REGISTRY.register("chitin_pickaxe", ItemChitinPickaxe::new);
	public static final RegistryObject<Item> CHITIN_AXE = REGISTRY.register("chitin_axe", ItemChitinAxe::new);
	public static final RegistryObject<Item> CHITIN_HOE = REGISTRY.register("chitin_hoe", ItemChitinHoe::new);

	private Items() {
	}

	public static void register(IEventBus modEventBus) {
		REGISTRY.register(modEventBus);
	}
}