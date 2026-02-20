package net.emanon.tutorialmod.event;

import net.emanon.tutorialmod.TutorialMod;
import net.emanon.tutorialmod.sound.ModSounds;
import net.minecraft.world.entity.npc.Villager;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.sounds.SoundSource;

public class VillagerHurtHandler {

    @SubscribeEvent
    public void onVillagerHurt(LivingHurtEvent event) {
        // Check if the entity being hurt is a villager
        if (event.getEntity() instanceof Villager) {
            Villager villager = (Villager) event.getEntity();

            TutorialMod.LOGGER.info("Villager hurt! Playing custom sound...");

            // Play the custom villager hurt sound
            var world = villager.getCommandSenderWorld();
            world.playSound(null,
                    villager.getX(), villager.getY(), villager.getZ(),
                    ModSounds.VILLAGER_HURT.get(),
                    SoundSource.NEUTRAL,
                    5.0F, 1.0F);
        }
    }
}