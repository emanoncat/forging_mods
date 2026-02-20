package net.emanon.tutorialmod.event;
import net.emanon.tutorialmod.sound.ModSounds;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.sounds.SoundSource;


public class DeathEventHandler {

    @SubscribeEvent
    public void onPlayerDeath(LivingDeathEvent event) {
        if (event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();

            // 2. Play the custom sound to all nearby players
            var world = player.getCommandSenderWorld();
            world.playSound(null, player.getX(), player.getY(), player.getZ(),
                    ModSounds.REZERO_DEATH.get(),
                    SoundSource.PLAYERS,
                    5.0F, 1.0F);
        }
    }
}