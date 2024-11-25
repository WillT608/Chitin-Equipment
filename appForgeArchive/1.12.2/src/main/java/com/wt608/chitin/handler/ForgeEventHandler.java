package com.wt608.chitin.handler;

import com.wt608.chitin.init.Items;
import com.wt608.chitin.init.Recipes;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ForgeEventHandler {
	@SubscribeEvent
	public void onItemRegistry(RegistryEvent.Register<Item> event) {
		Items.register();
		Recipes.register();
	}

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void onModelRegistry(ModelRegistryEvent event) {
		for (Item item : Items.CONTENT) {
			String registryName = item.getRegistryName().toString();
			ModelResourceLocation modelResourceLocation = new ModelResourceLocation(registryName, "inventory");
			ModelLoader.setCustomModelResourceLocation(item, 0, modelResourceLocation);
		}
	}
}