package com.wt608.chitin.event.loot;

import com.google.gson.JsonObject;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.List;

public class ChitinAdditionModifier extends LootModifier {
    private final Item addition;

    protected ChitinAdditionModifier(ILootCondition[] conditionsIn, Item addition) {
        super(conditionsIn);
        this.addition = addition;
    }

    @Nonnull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        // generatedLoot is the loot that would be dropped, if we wouldn't add or replace
        // anything!
        System.out.println("ChitinAdditionModifier: Applying chitin modifier..."); //debug print
        if (context.getRandom().nextFloat() > 0.5f) {
            System.out.println("ChitinAdditionModifier: Adding chitin drop...");
            generatedLoot.add(new ItemStack(addition, 1));
        }
        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<ChitinAdditionModifier> {

        @Override
        public ChitinAdditionModifier read(ResourceLocation name, JsonObject object,
                                           ILootCondition[] conditionsIn) {
            Item addition = ForgeRegistries.ITEMS.getValue(
                    new ResourceLocation(object.get("addition").getAsString()));
            return new ChitinAdditionModifier(conditionsIn, addition);
        }

        @Override
        public JsonObject write(ChitinAdditionModifier instance) {
            JsonObject json = makeConditions(instance.conditions);
            json.addProperty("addition", ForgeRegistries.ITEMS.getKey(instance.addition).toString());
            return json;
        }
    }
}
