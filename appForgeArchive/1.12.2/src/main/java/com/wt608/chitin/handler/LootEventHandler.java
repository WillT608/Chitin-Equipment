package com.wt608.chitin.handler;

import java.util.Random;

import static com.wt608.chitin.init.Items.chitinShell;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class LootEventHandler {

    @SubscribeEvent
    public void onEvent(LivingDropsEvent event) {

        if (event.getSource().getTrueSource() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.getSource().getTrueSource();
            Random rand = new Random();
            int nextRand = rand.nextInt(3);

            if (event.getEntityLiving() instanceof EntityMob) {

                    if ((event.getEntityLiving() instanceof EntitySpider)) {

                        if (nextRand == 2) {
                            event.getEntityLiving().dropItem(chitinShell, 1);
                        }
                    }
                    else
                    if ((event.getEntityLiving() instanceof EntityCaveSpider)) {

                        if (nextRand == 2) {
                            event.getEntityLiving().dropItem(chitinShell, 1);
                        }
                    }
            }
        }
    }
}