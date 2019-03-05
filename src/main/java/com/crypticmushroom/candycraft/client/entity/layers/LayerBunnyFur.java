package com.crypticmushroom.candycraft.client.entity.layers;

import com.crypticmushroom.candycraft.client.entity.renders.RenderBunny;
import com.crypticmushroom.candycraft.entity.EntityBunny;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class LayerBunnyFur implements LayerRenderer {
    private static final ResourceLocation skinTexture = new ResourceLocation("candycraftmod:textures/entity/whiteBunny.png");
    private RenderBunny bunnyRenderer;

    public LayerBunnyFur(RenderBunny bunnyRenderer) {
        this.bunnyRenderer = bunnyRenderer;
    }

    @Override
    public void doRenderLayer(EntityLivingBase entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        if (!entity.isInvisible()) {
            EntityBunny bunny = (EntityBunny) entity;
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GlStateManager.color(bunny.getRed() / 255F, bunny.getGreen() / 255F, bunny.getBlue() / 255F);
            bunnyRenderer.bindTexture(skinTexture);
            bunnyRenderer.getMainModel().render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glEnable(GL11.GL_LIGHTING);
        }
    }

    @Override
    public boolean shouldCombineTextures() {
        return true;
    }
}
