package com.crypticmushroom.candycraft.blocks;

import com.google.common.base.Predicate;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//TODO: BY THE ALMIGHTY ELDRITCH LORDS, CHECK YOUR SHIT! I"M COMING BACK TO THIS
public class BlockCandyLeave2 extends BlockCandyLeaveBase implements IShearable {
    public static final PropertyEnum VARIANT_PROP = PropertyEnum.create("variant", BlockPlanks.EnumType.class, new Predicate() {
        public boolean func_180202_a(BlockPlanks.EnumType p_180202_1_) {
            return p_180202_1_.getMetadata() < 4;
        }

        @Override
        public boolean apply(Object p_apply_1_) {
            return func_180202_a((BlockPlanks.EnumType) p_apply_1_);
        }
    });

    protected BlockCandyLeave2() {
        setDefaultState(blockState.getBaseState().withProperty(VARIANT_PROP, BlockPlanks.EnumType.OAK).withProperty(CHECK_DECAY, Boolean.valueOf(true)).withProperty(DECAYABLE, Boolean.valueOf(true)));
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Items.SUGAR;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(VARIANT_PROP, getWoodType(meta)).withProperty(DECAYABLE, (meta & 4) == 0).withProperty(CHECK_DECAY, (meta & 8) > 0);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        int i = ((BlockPlanks.EnumType) state.getValue(VARIANT_PROP)).getMetadata();
        return i % 4;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, VARIANT_PROP, CHECK_DECAY, DECAYABLE);
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((BlockPlanks.EnumType) state.getValue(VARIANT_PROP)).getMetadata();
    }

    @Override
    protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance) {
    }

    @Override
    protected int getSaplingDropChance(IBlockState state) {
        return state.getValue(VARIANT_PROP) == BlockPlanks.EnumType.JUNGLE ? 40 : super.getSaplingDropChance(state);
    }

    @Override
    public void dropBlockAsItemWithChance(World par1World, BlockPos pos, IBlockState state, float par6, int fortune) {
        if (!par1World.isRemote && this == CCBlocks.candyLeave2) {
            byte var8 = 30;

            if (par1World.rand.nextInt(var8) == 0) {
                Item var9 = getItemDropped(state, par1World.rand, fortune);
                spawnAsEntity(par1World, pos, new ItemStack(var9, 1, damageDropped(state)));
            }
        }
    }

    @Override
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
        ArrayList l = new ArrayList();
        l.add(new ItemStack(world.getBlockState(pos).getBlock(), 1, getMetaFromState(world.getBlockState(pos))));
        return l;
    }


    @Override
    public EnumType getWoodType(int meta) {
        return BlockPlanks.EnumType.byMetadata((meta & 3) % 4);
    }
}
