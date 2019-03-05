package com.crypticmushroom.candycraft.client.entity.renders;

import com.crypticmushroom.candycraft.client.entity.layers.Layerwaffle_sheep;
import com.crypticmushroom.candycraft.entity.EntityWaffleSheep;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Renderwaffle_sheep extends RenderLiving {
    private static final ResourceLocation shearedSheepTextures = new ResourceLocation("candycraftmod:textures/entity/sheepCandy0.png");
    private static final ResourceLocation shearedSheepTextures2 = new ResourceLocation("candycraftmod:textures/entity/sheepCandy1.png");

    public Renderwaffle_sheep(RenderManager rm, ModelBase par1ModelBase, ModelBase par2ModelBase, float par3) {
        super(rm, par1ModelBase, par3);
        addLayer(new Layerwaffle_sheep(this));
    }

    protected ResourceLocation getEntityTexture(EntityWaffleSheep par1EntitySheep) {
        return par1EntitySheep.hurtTime > 0 ? shearedSheepTextures2 : shearedSheepTextures;
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity) {
        return this.getEntityTexture((EntityWaffleSheep) par1Entity);
    }
}
