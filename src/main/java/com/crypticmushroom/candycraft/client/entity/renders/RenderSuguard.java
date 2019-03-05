package com.crypticmushroom.candycraft.client.entity.renders;

import com.crypticmushroom.candycraft.client.entity.layers.LayersuguardHeldItem;
import com.crypticmushroom.candycraft.client.entity.models.Modelsuguard;
import com.crypticmushroom.candycraft.items.CCItems;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Rendersuguard extends RenderLiving {
    private static final ResourceLocation suguard = new ResourceLocation("candycraftmod:textures/entity/SuGarde.png");
    private static final ResourceLocation orangesuguard = new ResourceLocation("candycraftmod:textures/entity/suguardeSoldier.png");

    public Rendersuguard(RenderManager rm) {
        super(rm, new Modelsuguard(), 0.5F);
        shadowSize = 0.5f;
        addLayer(new LayersuguardHeldItem(this));
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        EntityLivingBase b = (EntityLivingBase) entity;
        return b.getEquipmentInSlot(0) != null && b.getEquipmentInSlot(0).getItem() == CCItems.dynamite ? Rendersuguard.orangesuguard : Rendersuguard.suguard;
    }
}
