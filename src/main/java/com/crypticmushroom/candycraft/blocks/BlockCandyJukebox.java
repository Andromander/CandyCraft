package com.crypticmushroom.candycraft.blocks;

import com.crypticmushroom.candycraft.CandyCraft;
import com.crypticmushroom.candycraft.misc.ModelRegisterCallback;
import net.minecraft.block.BlockJukebox;
import net.minecraft.block.SoundType;

public class BlockCandyJukebox extends BlockJukebox implements ModelRegisterCallback {

    public BlockCandyJukebox() {
        setSoundType(SoundType.WOOD);
        setCreativeTab(CandyCraft.getCandyTab());
    }
}
