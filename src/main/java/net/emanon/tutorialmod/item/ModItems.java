package net.emanon.tutorialmod.item;

import net.emanon.tutorialmod.TutorialMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> DOBBLERITE = ITEMS.register("dobblerite",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(100)                 // Restores half a drumstick
                            .saturationModifier(100f)     // <-- CORRECT method name!
                            .build()
                    )
            ));


}

