package com.crypticmushroom.candycraft.misc;

import com.crypticmushroom.candycraft.CandyCraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CandyCraft.MODID)
public final class CCSounds {

    public static final SoundEvent NESSIE_IDLE = createEvent("mob.nessie");
    public static final SoundEvent NESSIE_HURT = createEvent("mob.nessiehurt");

    private static SoundEvent createEvent(String sound) {
        ResourceLocation name = new ResourceLocation(CandyCraft.MODID, sound);
        return new SoundEvent(name).setRegistryName(name);
    }

    public static void registerSounds(RegistryEvent.Register<SoundEvent> e) {
        e.getRegistry().register(NESSIE_IDLE);
        e.getRegistry().register(NESSIE_HURT);
    }
}
