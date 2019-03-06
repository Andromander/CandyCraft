package com.crypticmushroom.candycraft.event;

import com.crypticmushroom.candycraft.client.gui.GuiBoss;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClientTick {
    public static boolean threadFinished = false;
    public static String version = "";
    public static String mcVersion = "";
    public static String words = "";
    @SideOnly(Side.CLIENT)
    public Object bossHealth;
    private boolean isDeclared = false;

    public void onRenderTick(float tick) {
        if (!isDeclared) {
            bossHealth = new GuiBoss();
            isDeclared = true;
        }
        if (Minecraft.getMinecraft().player != null && Minecraft.getMinecraft().currentScreen == null) {
            ((GuiBoss) bossHealth).drawScreen(tick);
        }
    }
}
