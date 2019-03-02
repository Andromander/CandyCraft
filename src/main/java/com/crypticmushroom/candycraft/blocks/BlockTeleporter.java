package com.crypticmushroom.candycraft.blocks;

import com.crypticmushroom.candycraft.CandyCraft;
import com.crypticmushroom.candycraft.blocks.tileentity.TileEntityTeleporter;
import com.crypticmushroom.candycraft.world.TeleporterDungeon;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Arrays;
import java.util.Random;

public class BlockTeleporter extends Block implements ITileEntityProvider {
    private static final PropertyEnum PROPERTIES = PropertyEnum.create("metadata", BlockTeleporter.EnumType.class, Arrays.asList(Arrays.copyOf(BlockTeleporter.EnumType.values(), 2)));
    private static final AxisAlignedBB TELEPORTER_AABB = new AxisAlignedBB(0.2F, 0.0F, 0.2F, 0.8F, 0.06F, 0.8F);

    BlockTeleporter(Material material) {
        super(material);
        setSoundType(SoundType.METAL);
    }

    @Override
    @Deprecated
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return TELEPORTER_AABB;
    }

    @Override
    @Deprecated
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    @Deprecated
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public int quantityDropped(Random par1Random) {
        return 0;
    }

    @Override
    public boolean canPlaceBlockAt(World par1World, BlockPos pos) {
        return par1World.getBlockState(pos.down()).isOpaqueCube();
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        TileEntityTeleporter tileentityportal = (TileEntityTeleporter) worldIn.getTileEntity(pos);
        if (!worldIn.isRemote && playerIn.getRidingEntity() == null && playerIn.getControllingPassenger() == null && playerIn instanceof EntityPlayerMP && tileentityportal.generated) {
            EntityPlayerMP mp_player = (EntityPlayerMP) playerIn;
            playerIn.setPositionAndUpdate(tileentityportal.x, tileentityportal.y, tileentityportal.z);
            if (worldIn.provider.getDimension() != CandyCraft.getDungeonDimensionID()) {
                mp_player.server.getPlayerList().transferPlayerToDimension(mp_player, CandyCraft.getDungeonDimensionID(), new TeleporterDungeon(mp_player.server.getWorld(CandyCraft.getDungeonDimensionID()), tileentityportal));
            } else {
                mp_player.server.getPlayerList().transferPlayerToDimension(mp_player, tileentityportal.dim, new TeleporterDungeon(mp_player.server.getWorld(tileentityportal.dim), tileentityportal));
            }
        }
        return true;
    }

    @Override
    @Deprecated
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
        if (!canPlaceBlockAt(worldIn, pos)) {
            worldIn.setBlockToAir(pos);
        }
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {
        return new TileEntityTeleporter();
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((BlockTeleporter.EnumType) state.getValue(PROPERTIES)).getMeta();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(PROPERTIES, BlockTeleporter.EnumType.getState(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((BlockTeleporter.EnumType) state.getValue(PROPERTIES)).getMeta();
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, PROPERTIES);
    }

    /*
    @Override
    @Deprecated
    public ItemStack getItem(World world, BlockPos pos, IBlockState state) {
        return null;
    }*/

    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    public enum EnumType implements IStringSerializable {
        TYPE0(0, "0"), TYPE1(1, "1");

        private static final BlockTeleporter.EnumType[] enumList = new BlockTeleporter.EnumType[values().length];

        static {
            BlockTeleporter.EnumType[] var0 = values();

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

        public static BlockTeleporter.EnumType getState(int meta) {
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
