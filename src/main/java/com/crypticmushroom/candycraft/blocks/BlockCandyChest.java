package com.crypticmushroom.candycraft.blocks;

import com.crypticmushroom.candycraft.blocks.tileentity.TileEntityCandyChest;
import net.minecraft.block.BlockChest;
import net.minecraft.block.SoundType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCandyChest extends BlockChest {
    public BlockCandyChest(Type type) {
        super(type);
        setSoundType(SoundType.WOOD);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntityCandyChest();
    }
}
