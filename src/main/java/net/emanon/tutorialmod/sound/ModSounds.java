package net.emanon.tutorialmod.sound;

import net.emanon.tutorialmod.TutorialMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {

    // Create a DeferredRegister for SoundEvents
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TutorialMod.MOD_ID);

    // Register your Re:Zero death sound
    public static final RegistryObject<SoundEvent> REZERO_DEATH =
            SOUND_EVENTS.register("rezero_death",
                    () -> SoundEvent.createVariableRangeEvent(
                            ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "rezero_death")
                    )
            );

    public static final RegistryObject<SoundEvent> VILLAGER_HURT =
            SOUND_EVENTS.register("villager_hurt",
                    () -> SoundEvent.createVariableRangeEvent(
                            ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "villager_hurt")
                    )
            );
}

