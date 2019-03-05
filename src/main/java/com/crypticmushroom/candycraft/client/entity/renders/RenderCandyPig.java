package com.crypticmushroom.candycraft.client.entity.renders;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPig;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCandyPig extends RenderPig {
    private static final ResourceLocation texture = new ResourceLocation("candycraftmod:textures/entity/candy_pig.png");

    public RenderCandyPig(RenderManager renderManager, ModelBase par2ModelBase, float par3) {
        super(renderManager);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityPig par1Entity) {
        return RenderCandyPig.texture;
    }
}
