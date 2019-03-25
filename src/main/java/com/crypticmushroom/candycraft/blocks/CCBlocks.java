package com.crypticmushroom.candycraft.blocks;

import com.crypticmushroom.candycraft.CandyCraft;
import com.crypticmushroom.candycraft.blocks.misc.CandyStepSound;
import com.crypticmushroom.candycraft.blocks.tileentity.*;
import com.crypticmushroom.candycraft.client.CCSoundEvents;
import com.crypticmushroom.candycraft.misc.ModelRegisterCallback;
import com.crypticmushroom.candycraft.world.generator.WorldGenCandyTrees;
import com.google.common.collect.ImmutableList;
import net.minecraft.block.*;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;

@GameRegistry.ObjectHolder(CandyCraft.MODID)
@Mod.EventBusSubscriber(modid = CandyCraft.MODID)
public class CCBlocks {
    // StepSound
    public static final CandyStepSound SOUND_JELLY_FOOTSTEP = new CandyStepSound(CCSoundEvents.SOUND_JELLY, 0.7F, 0.6F);

    /**
     * Blocks
     */
    // /Nature
    // Normal
    public static final Block pudding = new BlockPudding().setTranslationKey("pudding").setHardness(0.6F);
    public static final Block flour = new BlockCandyBase(Material.GROUND, SoundType.CLOTH).setTranslationKey("flour").setHardness(0.6F);
    public static final Block marshmallowLog = new BlockCandyLog().setTranslationKey("marshmallow_log").setHardness(2.0F);
    public static final Block marshmallowLogDark = new BlockCandyLog().setTranslationKey("marshmallow_log_dark").setHardness(2.0F);
    public static final Block marshmallowLogLight = new BlockCandyLog().setTranslationKey("marshmallow_log_light").setHardness(2.0F);
    public static final Block candyLeave = new BlockCandyLeave(() -> Item.getItemFromBlock(CCBlocks.candySapling)).setTranslationKey("candy_leaves").setHardness(0.2F).setLightOpacity(1);
    public static final Block candyLeaveDark = new BlockCandyLeave(() -> Item.getItemFromBlock(CCBlocks.candySaplingDark)).setTranslationKey("candy_leaves_dark").setHardness(0.2F).setLightOpacity(1);
    public static final Block candyLeaveLight = new BlockCandyLeave(() -> Item.getItemFromBlock(CCBlocks.candySaplingLight)).setTranslationKey("candy_leaves_light").setHardness(0.2F).setLightOpacity(1);
    public static final Block candyLeaveCherry = new BlockCandyLeave(() -> Item.getItemFromBlock(CCBlocks.candySaplingCherry)).setTranslationKey("candy_leaves_cherry").setHardness(0.2F).setLightOpacity(1);
    public static final Block candyLeaveEnchant = new BlockCandyLeave(() -> Item.getItemFromBlock(CCBlocks.candySapling)).setTranslationKey("candy_leave_white").setHardness(0.2F).setLightOpacity(1);
    public static final Block candySapling = new BlockCandySapling(() -> new WorldGenCandyTrees(true, 4, CCBlocks.candyLeave, CCBlocks.marshmallowLog, false)).setCreativeTab(CandyCraft.getCandyTab()).setTranslationKey("candy_sapling").setHardness(0.0F);
    public static final Block candySaplingDark = new BlockCandySapling(() -> new WorldGenCandyTrees(true, 4, CCBlocks.candyLeaveDark, CCBlocks.marshmallowLogDark, false)).setCreativeTab(CandyCraft.getCandyTab()).setTranslationKey("candy_sapling_dark").setHardness(0.0F);
    public static final Block candySaplingLight = new BlockCandySapling(() -> new WorldGenCandyTrees(true, 4, CCBlocks.candyLeaveLight, CCBlocks.marshmallowLogLight, false)).setCreativeTab(CandyCraft.getCandyTab()).setTranslationKey("candy_sapling_light").setHardness(0.0F);
    public static final Block candySaplingCherry = new BlockCandySapling(() -> new WorldGenCandyTrees(true, 4, CCBlocks.candyLeaveCherry, CCBlocks.marshmallowLog, false)).setCreativeTab(CandyCraft.getCandyTab()).setTranslationKey("candy_sapling_cherry").setHardness(0.0F);
    public static final Block tallCandyGrassPink = (BlockBush)new BlockTallCandyGrass().setTranslationKey("sweet_grass_pink").setHardness(0.0F);
    public static final Block tallCandyGrassPale = (BlockBush)new BlockTallCandyGrass().setTranslationKey("sweet_grass_pale").setHardness(0.0F);
    public static final Block tallCandyGrassYellow = (BlockBush)new BlockTallCandyGrass().setTranslationKey("sweet_grass_yellow").setHardness(0.0F);
    public static final Block tallCandyGrassRed  = (BlockBush)new BlockTallCandyGrass().setTranslationKey("sweet_grass_red").setHardness(0.0F);
    public static final Block grenadine = new BlockCandyLiquid(Material.WATER).setTranslationKey("grenadine");
    public static final Block marshmallowSlice = new BlockCandyWaterLily().setHardness(0.0F).setTranslationKey("marshmallow_slice");
    public static final Block marshmallowFlowerBlock = new BlockCandyWaterLily().setHardness(0.0F).setTranslationKey("marshmallow_flower_block");
    public static final Block pinkSeaweed = new BlockSeaweed(true).setTranslationKey("rope_licorice");
    public static final Block greenSeaweed = new BlockSeaweed(false).setTranslationKey("mint");
    public static final Block bananaSeaweed = new BlockSeaweed(false).setTranslationKey("banana_seaweed");
    public static final Block fraiseTagadaFlower = new BlockCandyFlower().setHardness(0.0F).setTranslationKey("fraise_tagada_flower");
    public static final Block poisonousFlower = new BlockCandyFlower().setHardness(0.0F).setTranslationKey("acid_mint_flower");
    public static final Block sugarEssenceFlower = new BlockCandyFlower().setHardness(0.0F).setTranslationKey("sugar_essence_flower");
    public static final Block cherryBlock = new BlockCherry(Material.WOOD, SoundType.PLANT).setLightOpacity(1).setHardness(0.2F).setTranslationKey("cherry_block");
    // Harvest
    public static final Block candySoil = new BlockCandyFarmland().setTranslationKey("candy_farmland").setHardness(0.6F);
    public static final Block lollipopPlant = new BlockLollipopPlant().setHardness(0.0F).setResistance(0.0F).setTranslationKey("lollipop_plant");
    public static final Block lollipopBlock = new BlockLollipop().setHardness(0.0F).setResistance(0.0F).setTranslationKey("lollipop_block");
    public static final Block dragibusCrops = new BlockDragibus().setTranslationKey("dragibus_crops");
    // Ores
    public static final Block honeyOre = new BlockHoneyOre(Material.ROCK).setHardness(3.0F).setResistance(5.0F).setTranslationKey("honey_ore");
    public static final Block licoriceOre = new BlockCandyBase(Material.ROCK, SoundType.STONE).setHardness(3.0F).setResistance(5.0F).setTranslationKey("licorice_ore");
    public static final Block jellyOre = new BlockCandyBase(Material.ROCK, SoundType.STONE).setHardness(3.0F).setResistance(5.0F).setTranslationKey("jelly_ore");
    public static final Block nougatOre = new BlockNougatOre(Material.ROCK).setHardness(3.0F).setResistance(5.0F).setTranslationKey("nougat_ore");
    public static final Block PEZOre = new BlockCandyBase(Material.ROCK, SoundType.STONE).setHardness(1.0F).setTranslationKey("pez_ore").setHardness(3.0F).setResistance(5.0F);
    // WorldGen
    public static final Block chocolateStone = new BlockChocolateStone().setHardness(1.5F).setResistance(10.0F).setTranslationKey("chocolate_stone");
    public static final Block chocolateCobbleStone = new BlockCandyBase(Material.ROCK, SoundType.STONE).setHardness(2.0F).setResistance(10.0F).setTranslationKey("chocolate_cobblestone");
    public static final Block chewingGumBlock = new BlockChewingGum(Material.CLOTH).setHardness(1.0F).setTranslationKey("chewing_gum_block");
    public static final Block chewingGumPuddle = new BlockChewingGumPlate(Material.PLANTS).setHardness(1.0F).setTranslationKey("chewing_gum_puddle");
    public static final Block cottonCandyWeb = new BlockCandyWeb().setTranslationKey("cotton_candy_web");
    // /Nature End

    // /Decoratives
    // Wooden
    public static final Block marshmallowPlanks = new BlockCandyBase(Material.WOOD, SoundType.WOOD).setTranslationKey("marshmallow_planks").setHardness(3.0F).setResistance(5.0F);
    public static final Block marshmallowPlanksDark = new BlockCandyBase(Material.WOOD, SoundType.WOOD).setTranslationKey("marshmallow_planks_dark").setHardness(3.0F).setResistance(5.0F);
    public static final Block marshmallowPlanksLight = new BlockCandyBase(Material.WOOD, SoundType.WOOD).setTranslationKey("marshmallow_planks_light").setHardness(3.0F).setResistance(5.0F);
    public static final Block marshmallowFence = new BlockCandyFence(Material.WOOD, MapColor.PINK, 3.0F, 5.0F).setTranslationKey("marshmallow_fence");
    public static final Block marshmallowStairs = new BlockCandyStairs(marshmallowPlanks.getDefaultState(), SoundType.WOOD).setTranslationKey("marshmallow_stairs").setHardness(3.0F).setResistance(5.0F);
    public static final Block marshmallowStairsDark = new BlockCandyStairs(marshmallowPlanksDark.getDefaultState(), SoundType.WOOD).setTranslationKey("dark_marshmallow_stairs").setHardness(3.0F).setResistance(5.0F);
    public static final Block marshmallowStairsLight = new BlockCandyStairs(marshmallowPlanksLight.getDefaultState(), SoundType.WOOD).setTranslationKey("light_marshmallow_stairs").setHardness(3.0F).setResistance(5.0F);
    public static final BlockSlab marshmallowSlab = (BlockSlab) new BlockCandyStep(Material.WOOD, false, SoundType.WOOD).setTranslationKey("marshmallow_slab").setHardness(3.0F).setResistance(5.0F);
    public static final BlockSlab marshmallowDoubleSlab = (BlockSlab) new BlockCandyStep(Material.WOOD, true, SoundType.WOOD).setTranslationKey("marshmallow_double_slab").setHardness(3.0F).setResistance(5.0F);
    public static final BlockSlab marshmallowSlabDark = (BlockSlab) new BlockCandyStep(Material.WOOD, false, SoundType.WOOD).setTranslationKey("dark_marshmallow_slab").setHardness(3.0F).setResistance(5.0F);
    public static final BlockSlab marshmallowDoubleSlabDark = (BlockSlab) new BlockCandyStep(Material.WOOD, true, SoundType.WOOD).setTranslationKey("dark_marshmallow_double_slab").setHardness(3.0F).setResistance(5.0F);
    public static final BlockSlab marshmallowSlabLight = (BlockSlab) new BlockCandyStep(Material.WOOD, false, SoundType.WOOD).setTranslationKey("light_marshmallow_slab").setHardness(3.0F).setResistance(5.0F);
    public static final BlockSlab marshmallowDoubleSlabLight = (BlockSlab) new BlockCandyStep(Material.WOOD, true, SoundType.WOOD).setTranslationKey("light_marshmallow_double_slab").setHardness(3.0F).setResistance(5.0F);
    public static final Block marshmallowLadder = new BlockCandyLadder().setHardness(2.5F).setTranslationKey("marshmallow_ladder");
    public static final Block marshmallowDoor = new BlockCandyDoor(Material.WOOD).setHardness(2.5F).setTranslationKey("marshmallow_door");
    public static final Block marshmallowChest = new BlockCandyChest(BlockChest.Type.BASIC).setHardness(0.0F).setTranslationKey("marshmallow_chest").setHardness(2.5F);
    public static final Block marshmallowTrapdoor = new BlockCandyTrapDoor(Material.WOOD).setTranslationKey("marshmallow_trapdoor").setHardness(2.5F);
    // Chocolate
    public static final Block chocolateStairs = new BlockCandyStairs(chocolateStone.getDefaultState(), SoundType.STONE).setHardness(1.5F).setResistance(10.0F).setTranslationKey("chocolate_stone_stairs");
    public static final BlockSlab chocolateSlab = (BlockSlab) new BlockCandyStep(Material.ROCK, false, SoundType.STONE).setHardness(1.5F).setResistance(10.0F).setTranslationKey("chocolate_stone_slab");
    public static final BlockSlab chocolateDoubleSlab = (BlockSlab) new BlockCandyStep(Material.ROCK, true, SoundType.STONE).setHardness(1.5F).setResistance(10.0F).setTranslationKey("chocolate_stone_double_slab");
    public static final Block chocolateCobbleStairs = new BlockCandyStairs(chocolateCobbleStone.getDefaultState(), SoundType.STONE).setHardness(2.0F).setResistance(10.0F).setTranslationKey("chocolate_cobblestone_stairs");
    public static final BlockSlab chocolateCobbleSlab = (BlockSlab) new BlockCandyStep(Material.ROCK, false, SoundType.STONE).setHardness(2.0F).setResistance(10.0F).setTranslationKey("chocolate_cobblestone_slab");
    public static final BlockSlab chocolateCobbleDoubleSlab = (BlockSlab) new BlockCandyStep(Material.ROCK, true, SoundType.STONE).setHardness(2.0F).setResistance(10.0F).setTranslationKey("chocolate_cobblestone_double_slab");
    public static final Block chocolateCobbleWall = new BlockCandyWall(chocolateCobbleStone, SoundType.STONE).setHardness(2.0F).setResistance(10.0F).setTranslationKey("chocolate_cobblestone_wall");

    // Licorice
    public static final Block licoriceBrick = new BlockCandyBase(Material.ROCK, SoundType.STONE).setHardness(3.0F).setResistance(5.0F).setTranslationKey("licorice_brick");
    public static final Block licoriceBrickStairs = new BlockCandyStairs(licoriceBrick.getDefaultState(), SoundType.STONE).setHardness(3.0F).setResistance(5.0F).setTranslationKey("licorice_brick_stairs");
    public static final BlockSlab licoriceSlab = (BlockSlab) new BlockCandyStep(Material.ROCK, false, SoundType.STONE).setTranslationKey("licorice_brick_slab").setHardness(3.0F).setResistance(5.0F);
    public static final BlockSlab licoriceDoubleSlab = (BlockSlab) new BlockCandyStep(Material.ROCK, true, SoundType.STONE).setTranslationKey("licorice_brick_double_slab").setHardness(3.0F).setResistance(5.0F);
    public static final Block licoriceBlock = new BlockCandyBase(Material.IRON, SoundType.METAL).setHardness(5.0F).setResistance(10.0F).setTranslationKey("licorice_block");
    // Candy Cane
    public static final Block candyCaneBlock = new BlockCandyCane(Material.WOOD, SoundType.WOOD).setHardness(1.0F).setResistance(2.0F).setTranslationKey("candy_cane_block");
    public static final Block candyCaneFence = new BlockCandyFence(Material.WOOD, MapColor.RED, 1.0F, 2.0F).setTranslationKey("candy_cane_fence");
    public static final Block candyCaneWall = new BlockCandyWall(candyCaneFence, SoundType.WOOD).setHardness(1.0F).setResistance(2.0F).setTranslationKey("candy_cane_wall");
    public static final Block candyCaneStairs = new BlockCandyStairs(candyCaneBlock.getDefaultState(), SoundType.WOOD).setHardness(1.0F).setResistance(2.0F).setTranslationKey("candy_cane_stairs");
    public static final BlockSlab candyCaneSlab = (BlockSlab) new BlockCandyStep(Material.WOOD, false, SoundType.STONE).setTranslationKey("candy_cane_slab").setHardness(1.0F).setResistance(2.0F);
    public static final BlockSlab candyCaneDoubleSlab = (BlockSlab) new BlockCandyStep(Material.WOOD, true, SoundType.STONE).setTranslationKey("candy_cane_double_slab").setHardness(1.0F).setResistance(2.0F);
    // Honey
    public static final Block honeyBlock = new BlockCandyBase(Material.ROCK, SoundType.STONE).setHardness(2.0F).setTranslationKey("honeycomb_block");
    public static final Block honeyTorch = new BlockCandyTorch().setLightLevel(0.9375F).setHardness(0.0F).setTranslationKey("honey_torch");
    public static final Block honeyLamp = new BlockCandyBase(Material.IRON, SoundType.GLASS).setHardness(1.0F).setLightLevel(1.0F).setTranslationKey("honey_lamp");
    // Ice Cream
    public static final Block strawberryIceCream = new BlockCandyBase(Material.SAND, SoundType.SNOW).setHardness(1.0F).setTranslationKey("strawberry_ice_cream");
    public static final Block mintIceCream = new BlockCandyBase(Material.SAND, SoundType.SNOW).setHardness(1.0F).setTranslationKey("mint_ice_cream");
    public static final Block blueberryIceCream = new BlockCandyBase(Material.SAND, SoundType.SNOW).setHardness(1.0F).setTranslationKey("blueberry_ice_cream");
    public static final Block iceCream = new BlockCandyBase(Material.SAND, SoundType.SNOW).setHardness(1.0F).setTranslationKey("ice_cream");

    public static final Block strawberryIceCreamStairs = new BlockCandyStairs(strawberryIceCream.getDefaultState(), SoundType.SNOW).setTranslationKey("strawberry_ice_cream_stairs").setHardness(1.0F);
    public static final Block mintIceCreamStairs = new BlockCandyStairs(mintIceCream.getDefaultState(), SoundType.SNOW).setTranslationKey("mint_ice_cream_stairs").setHardness(1.0F);
    public static final Block blueberryIceCreamStairs = new BlockCandyStairs(blueberryIceCream.getDefaultState(), SoundType.SNOW).setTranslationKey("blueberry_ice_cream_stairs").setHardness(1.0F);
    public static final Block iceCreamStairs = new BlockCandyStairs(iceCream.getDefaultState(), SoundType.SNOW).setTranslationKey("ice_cream_stairs").setHardness(1.0F);
    public static final BlockSlab strawberryIceCreamSlab = (BlockSlab) new BlockCandyStep(Material.SAND, false, SoundType.SNOW).setTranslationKey("strawberry_ice_cream_slab").setHardness(1.0F);
    public static final BlockSlab strawberryIceCreamDoubleSlab = (BlockSlab) new BlockCandyStep(Material.SAND, true, SoundType.SNOW).setTranslationKey("strawberry_ice_cream_double_slab").setHardness(1.0F);
    public static final BlockSlab mintIceCreamSlab = (BlockSlab) new BlockCandyStep(Material.SAND, false, SoundType.SNOW).setTranslationKey("mint_ice_cream_slab").setHardness(1.0F);
    public static final BlockSlab mintIceCreamDoubleSlab = (BlockSlab) new BlockCandyStep(Material.SAND, true,SoundType.SNOW).setTranslationKey("mint_ice_cream_double_slab").setHardness(1.0F);
    public static final BlockSlab blueberryIceCreamSlab = (BlockSlab) new BlockCandyStep(Material.SAND, false, SoundType.SNOW).setTranslationKey("blueberry_ice_cream_slab").setHardness(1.0F);
    public static final BlockSlab blueberryIceCreamDoubleSlab = (BlockSlab) new BlockCandyStep(Material.SAND, true, SoundType.SNOW).setTranslationKey("blueberry_ice_cream_double_slab").setHardness(1.0F);
    public static final BlockSlab iceCreamSlab = (BlockSlab) new BlockCandyStep(Material.SAND, false, SoundType.SNOW).setTranslationKey("ice_cream_slab").setHardness(1.0F);
    public static final BlockSlab iceCreamDoubleSlab = (BlockSlab) new BlockCandyStep(Material.SAND, true, SoundType.SNOW).setTranslationKey("ice_cream_double_slab").setHardness(1.0F);
    // Caramel
    public static final Block caramelBlock = new BlockCandyBase(Material.IRON, SoundType.METAL).setHardness(2.0F).setResistance(2000.0F).setTranslationKey("caramel_block");
    public static final Block caramelGlass0 = new BlockCandyGlass(Material.GLASS).setLightOpacity(0).setHardness(0.3F).setTranslationKey("caramel_glass");
    public static final Block caramelGlass1 = new BlockCandyGlass(Material.GLASS).setLightOpacity(0).setHardness(0.5F).setTranslationKey("caramel_glass_round");
    public static final Block caramelGlass2 = new BlockCandyGlass(Material.GLASS).setLightOpacity(0).setHardness(0.7F).setTranslationKey("caramel_glass_diamond");
    public static final Block caramelPane0 = new BlockCandyGlassPane(Material.GLASS, false).setHardness(0.3F).setTranslationKey("caramel_pane");
    public static final Block caramelPane1 = new BlockCandyGlassPane(Material.GLASS, false).setHardness(0.5F).setTranslationKey("caramel_pane_round");
    public static final Block caramelPane2 = new BlockCandyGlassPane(Material.GLASS, false).setHardness(0.7F).setTranslationKey("caramel_pane_diamond");
    public static final Block caramelBrick = new BlockCandyBase(Material.IRON, SoundType.METAL).setHardness(2.0F).setResistance(2000.0F).setTranslationKey("caramel_brick");
    public static final Block caramelBrickStairs = new BlockCandyStairs(caramelBrick.getDefaultState(), SoundType.METAL).setHardness(2.0F).setResistance(2000.0F).setTranslationKey("caramel_brick_stairs");
    public static final BlockSlab caramelSlab = (BlockSlab) new BlockCandyStep(Material.IRON, false, SoundType.METAL).setTranslationKey("caramel_brick_slab").setHardness(2.0F).setResistance(2000.0F);
    public static final BlockSlab caramelDoubleSlab = (BlockSlab) new BlockCandyStep(Material.IRON, true, SoundType.METAL).setTranslationKey("caramel_brick_double_slab").setHardness(2.0F).setResistance(2000.0F);

    // Cotton Candy
    public static final Block cottonCandyBlock = new BlockCandyBase(Material.CLOTH, SoundType.CLOTH).setTranslationKey("cotton_candy_block").setHardness(0.6F);
    public static final Block cottonCandyStairs = new BlockCandyStairs(cottonCandyBlock.getDefaultState(), SoundType.CLOTH).setHardness(0.6F).setTranslationKey("cotton_candy_stairs");
    public static final BlockSlab cottonCandySlab = (BlockSlab) new BlockCandyStep(Material.CLOTH, false, SoundType.CLOTH).setTranslationKey("cotton_candy_slab").setHardness(3.0F).setResistance(5.0F);
    public static final BlockSlab cottonCandyDoubleSlab = (BlockSlab) new BlockCandyStep(Material.CLOTH, true, SoundType.CLOTH).setTranslationKey("cotton_candy_double_slab").setHardness(3.0F).setResistance(5.0F);
    public static final Block cottonCandyBedBlock = new BlockCandyBed().setHardness(0.2F).setTranslationKey("cotton_candy_bed_block");
    // Seaweeds
    public static final Block mintBlock = new BlockCandyBase(Material.CLOTH, SoundType.PLANT).setHardness(1.0F).setTranslationKey("mint_block");
    public static final Block bananaBlock = new BlockCandyBase(Material.CLOTH, SoundType.PLANT).setHardness(1.0F).setTranslationKey("banana_block");
    public static final Block raspberryBlock = new BlockCandyBase(Material.CLOTH, SoundType.PLANT).setHardness(1.0F).setTranslationKey("raspberry_block");
    // Others
    public static final Block pezBlock = new BlockCandyBase(Material.IRON, SoundType.METAL).setHardness(5.0F).setResistance(10.0F).setTranslationKey("pez_block");
    public static final Block nougatBlock = new BlockCandyBase(Material.IRON, SoundType.METAL).setHardness(1.0F).setTranslationKey("nougat_block");
    public static final Block nougatHead = new BlockNougatHead().setHardness(1.0F).setTranslationKey("nougat_head");
    // /Decorative End

    // /Misc
    // TileEntity
    public static final Block sugarFactory = new BlockSugarFactory(Material.IRON, false).setHardness(2.0F).setResistance(5.0F).setTranslationKey("sugar_factory");
    public static final Block advancedSugarFactory = new BlockSugarFactory(Material.IRON, true).setHardness(2.0F).setResistance(5.0F).setTranslationKey("advanced_sugar_factory");
    public static final Block licoriceFurnace = new BlockCandyFurnace(false).setHardness(5.0F).setResistance(10.0F).setTranslationKey("licorice_furnace");
    public static final Block licoriceFurnaceOn = new BlockCandyFurnace(true).setLightLevel(0.875F).setHardness(5.0F).setResistance(10.0F).setTranslationKey("licorice_furnace_on");
    public static final Block blockTeleporter = new BlockTeleporter(Material.ROCK).setHardness(3.0F).setResistance(2000.0F).setTranslationKey("block_teleporter");
    public static final Block alchemyTable = new BlockAlchemyTable().setHardness(1.0F).setTranslationKey("alchemy_table");
    public static final Block cottonCandyJukebox = new BlockCandyJukebox().setTranslationKey("cotton_candy_jukebox");
    // Other
    public static final Block marshmallowWorkbench = new BlockCandyWorkbench().setHardness(2.5F).setTranslationKey("marshmallow_workbench");

    public static final Block trampojelly = new BlockJelly(2.0D).setHardness(3.0F).setResistance(2000.0F).setTranslationKey("trampojelly");
    public static final Block redTrampojelly = new BlockJelly(4.0D).setHardness(3.0F).setResistance(2000.0F).setTranslationKey("red_trampojelly");
    public static final Block yellowTrampojelly = new BlockJelly(1.0D).setHardness(3.0F).setResistance(2000.0F).setTranslationKey("yellow_trampojelly");
    public static final Block jellyShockAbsorber = new BlockJelly(-1.0D).setHardness(3.0F).setResistance(2000.0F).setTranslationKey("jelly_shock_absorber");
    public static final Block purpleJellyJump = new BlockJelly(2.1D).setLightLevel(0.8F).setHardness(3.0F).setResistance(2000.0F).setTranslationKey("purple_trampojelly");
    public static final Block sugarBlock = new BlockSugar(Material.SAND).setHardness(0.3F).setTranslationKey("sugar_block");
    public static final Block candyPortal = new BlockCandyPortal().setHardness(-1.0F).setLightLevel(0.75F).setTranslationKey("candy_portal");
    public static final Block jellySentryKeyHole = new BlockKeyHole(Material.ROCK, 0).setBlockUnbreakable().setResistance(6000000.0F).setTranslationKey("jelly_sentry_key_hole");
    public static final Block jellyBossKeyHole = new BlockKeyHole(Material.ROCK, 1).setBlockUnbreakable().setResistance(6000000.0F).setTranslationKey("jelly_boss_key_hole");
    public static final Block suguardSentryKeyHole = new BlockKeyHole(Material.ROCK, 2).setBlockUnbreakable().setResistance(6000000.0F).setTranslationKey("suguard_sentry_key_hole");
    public static final Block suguardBossKeyHole = new BlockKeyHole(Material.ROCK, 3).setBlockUnbreakable().setResistance(6000000.0F).setTranslationKey("suguard_boss_key_hole");
    public static final Block jawBreakerBlock = new BlockCandyBase(Material.ROCK, SoundType.STONE).setBlockUnbreakable().setResistance(6000000.0F).setTranslationKey("jaw_breaker_block");
    public static final Block jawBreakerLight = new BlockCandyBase(Material.ROCK, SoundType.STONE).setLightLevel(0.7F).setBlockUnbreakable().setResistance(6000000.0F).setTranslationKey("jaw_breaker_light");
    public static final Block cranberrySpikes = new BlockSpikes(2).setTranslationKey("cranberry_spikes");
    public static final Block sugarSpikes = new BlockSpikes(4).setTranslationKey("sugar_spikes");
    public static final Block dragonEggBlock = new BlockEgg().setHardness(3.0F).setResistance(15.0F).setTranslationKey("dragon_egg_block");
    public static final Block beetleEggBlock = new BlockEgg().setHardness(3.0F).setResistance(15.0F).setTranslationKey("beetle_egg_block");
    public static final Block grenadineBlock = new BlockGrenadine(Material.GLASS).setHardness(1.0F).setTranslationKey("grenadine_block");
    // /Misc End

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e) {
        BlockRegistryHelper registry = new BlockRegistryHelper(e.getRegistry());

        registry.register(pudding);
        registry.register(flour);
        registry.register(marshmallowPlanks);
        registry.register(marshmallowPlanksDark);
        registry.register(marshmallowPlanksLight);
        registry.register(marshmallowLog);
        registry.register(marshmallowLogDark);
        registry.register(marshmallowLogLight);
        registry.register(candyLeave);
        registry.register(candyLeaveDark);
        registry.register(candyLeaveLight);
        registry.register(candyLeaveCherry);
        registry.register(candyLeaveEnchant);
        registry.register(candySapling);
        registry.register(candySaplingDark);
        registry.register(candySaplingLight);
        registry.register(candySaplingCherry);
        registry.register(candySoil);
        registry.register(tallCandyGrassPink);
        registry.register(tallCandyGrassPale);
        registry.register(tallCandyGrassYellow);
        registry.register(tallCandyGrassRed);
        registry.register(licoriceOre);
        registry.register(marshmallowFence);
        registry.register(marshmallowStairs);
        registry.register(marshmallowStairsDark);
        registry.register(marshmallowStairsLight);
        registry.register(marshmallowSlab);
        registry.register(marshmallowDoubleSlab);
        registry.register(marshmallowSlabDark);
        registry.register(marshmallowDoubleSlabDark);
        registry.register(marshmallowSlabLight);
        registry.register(marshmallowDoubleSlabLight);
        registry.register(marshmallowTrapdoor);
        registry.register(licoriceBrick);
        registry.register(licoriceBrickStairs);
        registry.register(licoriceSlab);
        registry.register(licoriceDoubleSlab);
        registry.register(licoriceBlock);
        registry.register(candyCaneBlock);
        registry.register(candyCaneFence);
        registry.register(candyCaneWall);
        registry.register(candyCaneStairs);
        registry.register(candyCaneSlab);
        registry.register(candyCaneDoubleSlab);
        registry.register(jellyOre);
        registry.register(trampojelly);
        registry.register(redTrampojelly);
        registry.register(yellowTrampojelly);
        registry.register(jellyShockAbsorber);
        registry.register(lollipopBlock);
        registry.register(caramelBlock);
        registry.register(caramelBrick);
        registry.register(caramelBrickStairs);
        registry.register(caramelSlab);
        registry.register(caramelDoubleSlab);
        registry.register(sugarFactory);
        registry.register(advancedSugarFactory);
        registry.register(licoriceFurnace);
        registry.register(licoriceFurnaceOn);
        registry.register(candyPortal);
        registry.register(sugarBlock);
        registry.register(dragibusCrops);
        registry.register(lollipopPlant);
        registry.register(chocolateStone);
        registry.register(chocolateStairs);
        registry.register(chocolateSlab);
        registry.register(chocolateDoubleSlab);
        registry.register(chocolateCobbleStone);
        registry.register(chocolateCobbleStairs);
        registry.register(chocolateCobbleSlab);
        registry.register(chocolateCobbleDoubleSlab);
        registry.register(chocolateCobbleWall);
        registry.register(pinkSeaweed);
        registry.register(greenSeaweed);
        registry.register(bananaSeaweed);
        registry.register(marshmallowWorkbench);
        registry.register(marshmallowLadder);
        registry.register(marshmallowDoor);
        registry.register(fraiseTagadaFlower);
        registry.register(poisonousFlower);
        registry.register(sugarEssenceFlower);
        registry.register(marshmallowChest);
        registry.register(honeyOre);
        registry.register(honeyTorch);
        registry.register(honeyBlock);
        registry.register(honeyLamp);
        registry.register(PEZOre);
        registry.register(pezBlock);
        registry.register(grenadine);
        registry.register(purpleJellyJump);
        registry.register(cottonCandyBlock);
        registry.register(cottonCandyStairs);
        registry.register(cottonCandySlab);
        registry.register(cottonCandyDoubleSlab);
        registry.register(cottonCandyBedBlock);
        registry.register(cottonCandyJukebox);
        registry.register(cranberrySpikes);
        registry.register(sugarSpikes);
        registry.register(mintBlock);
        registry.register(raspberryBlock);
        registry.register(bananaBlock);
        registry.register(grenadineBlock);
        registry.register(blockTeleporter);
        registry.register(marshmallowSlice);
        registry.register(marshmallowFlowerBlock);
        registry.register(caramelGlass0);
        registry.register(caramelGlass1);
        registry.register(caramelGlass2);
        registry.register(caramelPane0);
        registry.register(caramelPane1);
        registry.register(caramelPane2);
        registry.register(cottonCandyWeb);
        registry.register(cherryBlock);
        registry.register(nougatOre);
        registry.register(nougatBlock);
        registry.register(nougatHead);
        registry.register(chewingGumBlock);
        registry.register(chewingGumPuddle);
        registry.register(alchemyTable);
        registry.register(strawberryIceCream);
        registry.register(mintIceCream);
        registry.register(blueberryIceCream);
        registry.register(iceCream);
        registry.register(strawberryIceCreamStairs);
        registry.register(mintIceCreamStairs);
        registry.register(blueberryIceCreamStairs);
        registry.register(iceCreamStairs);
        registry.register(strawberryIceCreamSlab);
        registry.register(strawberryIceCreamDoubleSlab);
        registry.register(mintIceCreamSlab);
        registry.register(mintIceCreamDoubleSlab);
        registry.register(blueberryIceCreamSlab);
        registry.register(blueberryIceCreamDoubleSlab);
        registry.register(iceCreamSlab);
        registry.register(iceCreamDoubleSlab);
        registry.register(dragonEggBlock);
        registry.register(beetleEggBlock);
        registry.register(jellySentryKeyHole);
        registry.register(jellyBossKeyHole);
        registry.register(suguardSentryKeyHole);
        registry.register(suguardBossKeyHole);
        registry.register(jawBreakerBlock);
        registry.register(jawBreakerLight);

        GameRegistry.registerTileEntity(TileEntityCandyChest.class, new ResourceLocation(CandyCraft.MODID, "candychest"));
        GameRegistry.registerTileEntity(TileEntityTeleporter.class, new ResourceLocation(CandyCraft.MODID, "teleporterblock"));
        GameRegistry.registerTileEntity(TileEntitySugarFactory.class, new ResourceLocation(CandyCraft.MODID, "sugarfactory"));
        GameRegistry.registerTileEntity(TileEntityLicoriceFurnace.class, new ResourceLocation(CandyCraft.MODID, "licoricefurnace"));
        GameRegistry.registerTileEntity(TileEntityAlchemy.class, new ResourceLocation(CandyCraft.MODID, "alchemytable"));
        GameRegistry.registerTileEntity(TileEntityEgg.class, new ResourceLocation(CandyCraft.MODID, "hatchingegg"));

        doMiningLevel();
    }

    public static void doMiningLevel() {
        licoriceOre.setHarvestLevel("pickaxe", 1);
        PEZOre.setHarvestLevel("pickaxe", 3);
        honeyOre.setHarvestLevel("pickaxe", 0);
        chocolateStone.setHarvestLevel("pickaxe", 0);
        chocolateCobbleStone.setHarvestLevel("pickaxe", 0);
        licoriceFurnace.setHarvestLevel("pickaxe", 0);
        jellyOre.setHarvestLevel("pickaxe", 2);
        nougatOre.setHarvestLevel("pickaxe", 2);
        pudding.setHarvestLevel("shovel", 0);
        flour.setHarvestLevel("shovel", 0);
    }

    public static List<ModelRegisterCallback> getBlockModels() {
        return ImmutableList.copyOf(BlockRegistryHelper.blockModels);
    }

    public static class BlockRegistryHelper {
        private final IForgeRegistry<Block> registry;

        private static List<ModelRegisterCallback> blockModels = new ArrayList<>();

        BlockRegistryHelper(IForgeRegistry<Block> registry) {
            this.registry = registry;
        }

        private void register(Block block) {
            if (block instanceof ModelRegisterCallback) {
                blockModels.add((ModelRegisterCallback) block);
            }
            registry.register(block);
        }
    }
}
