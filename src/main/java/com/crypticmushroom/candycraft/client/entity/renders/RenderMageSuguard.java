package com.crypticmushroom.candycraft.client.entity.renders;

import com.crypticmushroom.candycraft.client.entity.layers.LayersuguardHeldItem;
import com.crypticmushroom.candycraft.client.entity.models.Modelsuguard;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderMagesuguard extends RenderLiving {
    private static final ResourceLocation texture = new ResourceLocation("candycraftmod:textures/entity/suguardeMage.png");

    public RenderMagesuguard(RenderManager rm) {
        super(rm, new Modelsuguard(), 0.5F);
        shadowSize = 0.5f;
        addLayer(new LayersuguardHeldItem(this));
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return RenderMagesuguard.texture;
    }
}
