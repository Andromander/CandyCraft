package com.crypticmushroom.candycraft.blocks;

import com.crypticmushroom.candycraft.misc.ModelRegisterCallback;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class BlockCandyLeaveBase extends BlockLeaves implements ModelRegisterCallback {
    @Override
    @SideOnly(Side.CLIENT)
    public boolean isOpaqueCube(IBlockState state) {
        setGraphicsLevel(Minecraft.getMinecraft().gameSettings.fancyGraphics);
        return !leavesFancy;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer() {
        setGraphicsLevel(Minecraft.getMinecraft().gameSettings.fancyGraphics);
        return leavesFancy ? BlockRenderLayer.CUTOUT_MIPPED : BlockRenderLayer.SOLID;
    }
}
