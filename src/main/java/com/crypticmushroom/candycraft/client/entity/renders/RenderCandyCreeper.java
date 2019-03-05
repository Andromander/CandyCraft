package com.crypticmushroom.candycraft.client.entity.renders;

import net.minecraft.client.renderer.entity.RenderCreeper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Rendercandy_creeper extends RenderCreeper {
    private static final ResourceLocation texture = new ResourceLocation("candycraftmod:textures/entity/candy_creeper.png");

    public Rendercandy_creeper(RenderManager renderManager) {
        super(renderManager);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityCreeper par1Entity) {
        return Rendercandy_creeper.texture;
    }
}
