package com.crypticmushroom.candycraft.blocks;

import com.crypticmushroom.candycraft.world.generator.WorldGenCandyTrees;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class BlockCandySapling extends BlockCandyBush implements IGrowable {
    public static final PropertyEnum TYPE_PROP = PropertyEnum.create("metadata", BlockCandySapling.EnumType.class);
    public static final PropertyInteger STAGE_PROP = PropertyInteger.create("stage", 0, 1);

    protected static final AxisAlignedBB SAPLING_AABB = new AxisAlignedBB(0.1F, 0.0F, 0.1F, 0.9F, 0.8F, 0.9F);

    public BlockCandySapling() {
        setDefaultState(blockState.getBaseState().withProperty(TYPE_PROP, BlockCandySapling.EnumType.TYPE0).withProperty(STAGE_PROP, 0));
    }

    public void generateTree(World thisWorld, BlockPos pos, IBlockState state, Random par5Random) {
        int l = getMetaFromState(state) & 3;
        Object object;
        int i1 = 0;
        int j1 = 0;

        if (l == 0) {
            object = new WorldGenCandyTrees(true, l);
        } else if (l == 1) {
            object = new WorldGenCandyTrees(true, l);
        } else if (l == 2) {
            object = new WorldGenCandyTrees(true, l);
        } else {
            object = new WorldGenCandyTrees(true, l);
        }

        thisWorld.setBlockToAir(new BlockPos(pos.getX(), pos.getY(), pos.getZ()));

        if (!((WorldGenerator) object).generate(thisWorld, par5Random, new BlockPos(pos.getX() + i1, pos.getY(), pos.getZ() + j1))) {
            thisWorld.setBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ()), state, 4);
        }
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (!worldIn.isRemote) {
            super.updateTick(worldIn, pos, state, rand);

            if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0) {
                grow(worldIn, rand, pos, state);
            }
        }
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return SAPLING_AABB;
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((BlockCandySapling.EnumType) state.getValue(TYPE_PROP)).getMeta();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(TYPE_PROP, BlockCandySapling.EnumType.getState(meta & 7)).withProperty(STAGE_PROP, (meta & 8) >> 3);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        byte b0 = 0;
        int i = b0 | ((BlockCandySapling.EnumType) state.getValue(TYPE_PROP)).getMeta();
        i |= state.getValue(STAGE_PROP) << 3;
        return i;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, TYPE_PROP, STAGE_PROP);
    }

    @Override
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        return worldIn.rand.nextFloat() < 0.45D;
    }

    @Override
    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        if (state.getValue(STAGE_PROP) == 0) {
            worldIn.setBlockState(pos, state.cycleProperty(STAGE_PROP), 4);
        } else {
            generateTree(worldIn, pos, state, rand);
        }
    }

    @Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
        items.add(new ItemStack(this, 1, 0));
        items.add(new ItemStack(this, 1, 1));
        items.add(new ItemStack(this, 1, 2));
        items.add(new ItemStack(this, 1, 3));
    }

    public enum EnumType implements IStringSerializable {
        TYPE0(0, "0"), TYPE1(1, "1"), TYPE2(2, "2"), TYPE3(3, "3");
        private static final BlockCandySapling.EnumType[] enumList = new BlockCandySapling.EnumType[values().length];

        static {
            BlockCandySapling.EnumType[] var0 = values();

            for (EnumType var3 : var0) {
                enumList[var3.getMeta()] = var3;
            }
        }

        private final int meta;
        private final String name;

        EnumType(int m, String n) {
            meta = m;
            name = n;
        }

        public static BlockCandySapling.EnumType getState(int meta) {
            if (meta < 0 || meta >= enumList.length) {
                meta = 0;
            }

            return enumList[meta];
        }

        public int getMeta() {
            return meta;
        }

        @Override
        public String toString() {
            return name;
        }

        @Override
        public String getName() {
            return name;
        }
    }
}
