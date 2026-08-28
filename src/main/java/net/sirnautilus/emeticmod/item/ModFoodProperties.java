package net.sirnautilus.emeticmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties EMETIC = new FoodProperties.Builder()
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 3), 1.0F)
            .build();
}
