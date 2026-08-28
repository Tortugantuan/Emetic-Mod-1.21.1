package net.sirnautilus.emeticmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sirnautilus.emeticmod.EmeticMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EmeticMod.MOD_ID) ;

    public static final DeferredItem<Item> EMETIC = ITEMS.register("emetic",
            () -> new Item(new Item.Properties().food(ModFoodProperties.EMETIC).stacksTo(16))) ;

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus) ;
    }
}
