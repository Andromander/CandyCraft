package com.crypticmushroom.candycraft.blocks;

import net.minecraft.block.BlockLog;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockCandyLog extends BlockLog {
    public static final PropertyEnum properties = PropertyEnum.create("metadata", BlockCandyLog.EnumType.class);

    public BlockCandyLog() {
        setDefaultState(blockState.getBaseState().withProperty(properties, BlockCandyLog.EnumType.TYPE0).withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.Y));
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        IBlockState iblockstate = getDefaultState().withProperty(properties, BlockCandyLog.EnumType.byMetadata((meta & 3) % 4));

        switch (meta & 12) {
            case 0:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Y);
                break;
            case 4:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.X);
                break;
            case 8:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Z);
                break;
            default:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.NONE);
        }

        return iblockstate;
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        byte b0 = 0;
        int i = b0 | ((BlockCandyLog.EnumType) state.getValue(properties)).getMeta();

        switch (BlockCandyLog.SwitchEnumAxis.switchEnum[state.getValue(LOG_AXIS).ordinal()]) {
            case 1:
                i |= 4;
                break;
            case 2:
                i |= 8;
                break;
            case 3:
                i |= 12;
        }

        return i;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, properties, LOG_AXIS);
    }


    @Override
    public int damageDropped(IBlockState state) {
        return ((BlockCandyLog.EnumType) state.getValue(properties)).getMeta();
    }

    @Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
        items.add(new ItemStack(this, 1, 0));
        items.add(new ItemStack(this, 1, 1));
        items.add(new ItemStack(this, 1, 2));
    }

    @Override
    public SoundType getSoundType(IBlockState state, World world, BlockPos pos, @Nullable Entity entity) {
        return SoundType.WOOD;
    }

    public enum EnumType implements IStringSerializable {
        TYPE0(0, "0"), TYPE1(1, "1"), TYPE2(2, "2");

        private static final BlockCandyLog.EnumType[] enumList = new BlockCandyLog.EnumType[values().length];

        static {
            BlockCandyLog.EnumType[] var0 = values();

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

        public static BlockCandyLog.EnumType getState(int meta) {
            if (meta < 0 || meta >= enumList.length) {
                meta = 0;
            }

            return enumList[meta];
        }

        public static BlockCandyLog.EnumType byMetadata(int meta) {
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

    static final class SwitchEnumAxis {
        static final int[] switchEnum = new int[BlockLog.EnumAxis.values().length];

        static {
            try {
                switchEnum[BlockLog.EnumAxis.X.ordinal()] = 1;
            } catch (NoSuchFieldError ignored) { }

            try {
                switchEnum[BlockLog.EnumAxis.Z.ordinal()] = 2;
            } catch (NoSuchFieldError ignored) { }

            try {
                switchEnum[BlockLog.EnumAxis.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError ignored) { }
        }
    }
}
