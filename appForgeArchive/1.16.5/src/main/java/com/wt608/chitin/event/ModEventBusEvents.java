package com.wt608.chitin.event;

import com.wt608.chitin.event.loot.ChitinAdditionModifier;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = "chitin", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                               event) {
        event.getRegistry().registerAll(
                new ChitinAdditionModifier.Serializer().setRegistryName(
                        new ResourceLocation("chitin", "chitin_spider"))
        );
    }
}
