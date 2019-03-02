package com.crypticmushroom.candycraft.blocks;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;

public class BlockCandyStairs extends BlockStairs {
    public BlockCandyStairs(IBlockState state, SoundType sound) {
        super(state);
        setSoundType(sound);
        useNeighborBrightness = true;
    }
}
