package com.crypticmushroom.candycraft.client;

import com.crypticmushroom.candycraft.CandyCraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CCSoundEvents {
    public static final SoundEvent C1 = new SoundEvent(new ResourceLocation(CandyCraft.MODID, "cd-1")).setRegistryName("cd-1");
    public static final SoundEvent C2 = new SoundEvent(new ResourceLocation(CandyCraft.MODID, "cd-2")).setRegistryName("cd-2");
    public static final SoundEvent C3 = new SoundEvent(new ResourceLocation(CandyCraft.MODID, "cd-3")).setRegistryName("cd-3");
    public static final SoundEvent C4 = new SoundEvent(new ResourceLocation(CandyCraft.MODID, "cd-4")).setRegistryName("cd-4");
    public static final SoundEvent SOUND_JELLY = new SoundEvent(new ResourceLocation(CandyCraft.MODID, "jelly")).setRegistryName("jelly");

    @SubscribeEvent
    public static void onSoundRegister(RegistryEvent.Register<net.minecraft.util.SoundEvent> eventRegister) {
        eventRegister.getRegistry().registerAll(C1, C2, C3, C4);
    }
}
