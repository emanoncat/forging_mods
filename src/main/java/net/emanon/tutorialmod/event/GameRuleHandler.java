package net.emanon.tutorialmod.event;

import net.emanon.tutorialmod.TutorialMod;
import net.minecraft.world.level.GameRules;
import net.minecraftforge.event.level.LevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.server.level.ServerLevel;

public class GameRuleHandler {

    @SubscribeEvent
    public void onWorldLoad(LevelEvent.Load event) {
        if (event.getLevel() instanceof ServerLevel) {
            ServerLevel world = (ServerLevel) event.getLevel();
            world.getGameRules().getRule(GameRules.RULE_DO_IMMEDIATE_RESPAWN)
                    .set(true, world.getServer());
            TutorialMod.LOGGER.info("Auto-enabled doImmediateRespawn for world");
        }
    }
}