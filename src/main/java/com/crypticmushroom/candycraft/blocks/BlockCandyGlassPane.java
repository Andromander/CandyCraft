package com.crypticmushroom.candycraft.blocks;

import net.minecraft.block.BlockPane;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockCandyGlassPane extends BlockPane {
    public BlockCandyGlassPane(Material mat, boolean shouldBreak) {
        super(mat, shouldBreak);
        setSoundType(SoundType.GLASS);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }
}
