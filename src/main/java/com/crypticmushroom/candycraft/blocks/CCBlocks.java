package com.crypticmushroom.candycraft.blocks;

import com.crypticmushroom.candycraft.CandyCraft;
import com.crypticmushroom.candycraft.blocks.misc.CandyStepSound;
import com.crypticmushroom.candycraft.blocks.tileentity.*;
import com.crypticmushroom.candycraft.client.CCSoundEvents;
import com.crypticmushroom.candycraft.items.*;
import net.minecraft.block.*;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber
public class CCBlocks {
    // StepSound
    public static final CandyStepSound SOUND_JELLY_FOOTSTEP = new CandyStepSound(CCSoundEvents.SOUND_JELLY, 0.7F, 0.6F);

    /**
     * Blocks
     */
    // /Nature
    // Normal
    public static Block pudding;
    public static Block flour;
    public static Block marshmallowLog;
    public static Block candyLeave;
    public static Block candyLeave2;
    public static Block candySapling;
    public static BlockTallCandyGrass tallCandyGrass;
    public static BlockCandyLiquid grenadine;
    public static Block marshmallowSlice;
    public static Block marshmallowFlowerBlock;
    public static Block pinkSeeweed;
    public static Block greenSeeweed;
    public static Block bananaSeaweed;
    public static Block fraiseTagadaFlower;
    public static Block poisonousFlower;
    public static Block sugarEssenceFlower;
    public static Block cherryBlock;
    // Harvest
    public static Block candySoil;
    public static Block lollipopPlant;
    public static Block lollipopBlock;
    public static Block dragibusCrops;
    // Ores
    public static Block honeyOre;
    public static Block licoriceOre;
    public static Block jellyOre;
    public static Block nougatOre;
    public static Block PEZOre;
    // WorldGen
    public static Block chocolateStone;
    public static Block chocolateCobbleStone;
    public static Block chewingGumBlock;
    public static Block chewingGumPuddle;
    public static Block cottonCandyWeb;
    // /Nature End

    // /Decoratives
    // Wooden
    public static Block marshmallowPlanks;
    public static Block marshmallowFence;
    public static Block marshmallowStairs;
    public static Block marshmallowStairs2;
    public static Block marshmallowStairs3;
    public static BlockSlab marshmallowHalfStep;
    public static BlockSlab marshmallowStep;
    public static BlockSlab marshmallowHalfStep2;
    public static BlockSlab marshmallowStep2;
    public static BlockSlab marshmallowHalfStep3;
    public static BlockSlab marshmallowStep3;
    public static Block marshmallowLadder;
    public static Block marshmallowDoor;
    public static BlockCandyChest marshmallowChest;
    public static Block marshmallowTrapdoor;
    // Chocolate
    public static Block chocolateStairs;
    public static BlockSlab chocolateHalfStep;
    public static BlockSlab chocolateStep;
    public static Block chocolateCobbleStairs;
    public static BlockSlab chocolateCobbleHalfStep;
    public static BlockSlab chocolateCobbleStep;
    public static Block chocolateCobbleWall;

    // Licorice
    public static Block licoriceBrick;
    public static Block licoriceBrickStairs;
    public static BlockSlab licoriceHalfStep;
    public static BlockSlab licoriceStep;
    public static Block licoriceBlock;
    // Candy Cane
    public static Block candyCaneBlock;
    public static Block candyCaneFence;
    public static Block candyCaneWall;
    public static Block candyCaneStairs;
    public static BlockSlab candyCaneHalfStep;
    public static BlockSlab candyCaneStep;
    // Honey
    public static Block honeyBlock;
    public static Block honeyTorch;
    public static Block honeyLamp;
    // Ice Cream
    public static Block iceCream;
    public static Block iceCreamStairs0;
    public static Block iceCreamStairs1;
    public static Block iceCreamStairs2;
    public static Block iceCreamStairs3;
    public static BlockSlab iceCreamHalfStep0;
    public static BlockSlab iceCreamStep0;
    public static BlockSlab iceCreamHalfStep1;
    public static BlockSlab iceCreamStep1;
    public static BlockSlab iceCreamHalfStep2;
    public static BlockSlab iceCreamStep2;
    public static BlockSlab iceCreamHalfStep3;
    public static BlockSlab iceCreamStep3;
    // Caramel
    public static Block caramelBlock;
    public static Block caramelGlass0;
    public static Block caramelGlass1;
    public static Block caramelGlass2;
    public static Block caramelPane0;
    public static Block caramelPane1;
    public static Block caramelPane2;
    public static Block caramelBrick;
    public static Block caramelBrickStairs;
    public static BlockSlab caramelHalfStep;
    public static BlockSlab caramelStep;

    // Cotton Candy
    public static Block cottonCandyBlock;
    public static Block cottonCandyStairs;
    public static BlockSlab cottonCandyHalfStep;
    public static BlockSlab cottonCandyStep;
    public static Block cottonCandyBedBlock;
    // Seeweeds
    public static Block mintBlock;
    public static Block bananaBlock;
    public static Block raspberryBlock;
    // Others
    public static Block PEZBlock;
    public static Block nougatBlock;
    public static Block nougatHead;
    // /Decorative End

    // /Misc
    // TileEntity
    public static Block sugarFactory;
    public static Block advancedSugarFactory;
    public static Block sugarFurnace;
    public static Block sugarFurnaceOn;
    public static Block blockTeleporter;
    public static Block alchemyTable;
    public static Block cottonCandyJukebox;
    // Other
    public static Block marshmallowWorkbench;

    public static Block trampojelly;
    public static Block redTrampojelly;
    public static Block yellowTrampojelly;
    public static Block jellyShockAbsorber;
    public static Block purpleJellyJump;
    public static Block sugarBlock;
    public static BlockCandyPortal candyPortal;
    public static Block jellySentryKeyHole;
    public static Block jellyBossKeyHole;
    public static Block suguardSentryKeyHole;
    public static Block suguardBossKeyHole;
    public static Block jawBreakerBlock;
    public static Block jawBreakerLight;
    public static Block cranberrySpikes;
    public static Block sugarSpikes;
    public static Block dragonEggBlock;
    public static Block beetleEggBlock;
    public static Block grenadineBlock;

    // /Misc End

    private static Side currentSide = null;

    public static void loadBlocks() {
        pudding = new BlockPudding().setCreativeTab(CandyCraft.getCandyTab()).setTranslationKey("pudding").setHardness(0.6F);
        flour = new BlockCandyBase(Material.GROUND, SoundType.CLOTH).setCreativeTab(CandyCraft.getCandyTab()).setTranslationKey("flour").setHardness(0.6F);
        marshmallowPlanks = new BlockCandyPlanks(Material.WOOD, SoundType.WOOD).addMetaToCreative(0, 1, 2).setCreativeTab(CandyCraft.getCandyTab()).setTranslationKey("marshmallow_planks").setHardness(3.0F).setResistance(5.0F);
        marshmallowLog = new BlockCandyLog().setCreativeTab(CandyCraft.getCandyTab()).setTranslationKey("marshmallow_log").setHardness(2.0F);
        candyLeave = new BlockCandyLeave().setCreativeTab(CandyCraft.getCandyTab()).setTranslationKey("candy_leave").setHardness(0.2F).setLightOpacity(1);
        candyLeave2 = new BlockCandyLeave2().setCreativeTab(CandyCraft.getCandyTab()).setTranslationKey("candy_leave2").setHardness(0.2F).setLightOpacity(1);
        candySapling = new BlockCandySapling().setCreativeTab(CandyCraft.getCandyTab()).setTranslationKey("candy_sapling").setHardness(0.0F);
        candySoil = new BlockCandyFarmland().setTranslationKey("candy_farmland").setHardness(0.6F);
        tallCandyGrass = (BlockTallCandyGrass) new BlockTallCandyGrass().setTranslationKey("sweet_grass").setCreativeTab(CandyCraft.getCandyTab()).setHardness(0.0F);
        licoriceOre = new BlockCandyBase(Material.ROCK, SoundType.STONE).setCreativeTab(CandyCraft.getCandyTab()).setHardness(3.0F).setResistance(5.0F).setTranslationKey("licorice_ore");
        marshmallowFence = new BlockFence(Material.WOOD, MapColor.PINK).setTranslationKey("marshmallow_fence").setCreativeTab(CandyCraft.getCandyTab()).setHardness(3.0F).setResistance(5.0F);
        marshmallowStairs = new BlockCandyStairs(marshmallowPlanks.getStateFromMeta(0), SoundType.WOOD).setTranslationKey("marshmallow_stairs.0").setCreativeTab(CandyCraft.getCandyTab()).setHardness(3.0F).setResistance(5.0F);
        marshmallowStairs2 = new BlockCandyStairs(marshmallowPlanks.getStateFromMeta(1), SoundType.WOOD).setTranslationKey("marshmallow_stairs.1").setCreativeTab(CandyCraft.getCandyTab()).setHardness(3.0F).setResistance(5.0F);
        marshmallowStairs3 = new BlockCandyStairs(marshmallowPlanks.getStateFromMeta(2), SoundType.WOOD).setTranslationKey("marshmallow_stairs.2").setCreativeTab(CandyCraft.getCandyTab()).setHardness(3.0F).setResistance(5.0F);
        marshmallowHalfStep = (BlockSlab) new BlockCandyStep(Material.WOOD, false, 0, SoundType.WOOD).setTranslationKey("marshmallow_half_step_1").setCreativeTab(CandyCraft.getCandyTab()).setHardness(3.0F).setResistance(5.0F);
        marshmallowStep = (BlockSlab) new BlockCandyStep(Material.WOOD, true, 0, SoundType.WOOD).setTranslationKey("marshmallow_step_1").setHardness(3.0F).setResistance(5.0F);
        marshmallowHalfStep2 = (BlockSlab) new BlockCandyStep(Material.WOOD, false, 4, SoundType.WOOD).setTranslationKey("marshmallow_half_step_2").setCreativeTab(CandyCraft.getCandyTab()).setHardness(3.0F).setResistance(5.0F);
        marshmallowStep2 = (BlockSlab) new BlockCandyStep(Material.WOOD, true, 4, SoundType.WOOD).setTranslationKey("marshmallowStep2").setHardness(3.0F).setResistance(5.0F);
        marshmallowHalfStep3 = (BlockSlab) new BlockCandyStep(Material.WOOD, false, 5, SoundType.WOOD).setTranslationKey("marshmallow_half_step_3").setCreativeTab(CandyCraft.getCandyTab()).setHardness(3.0F).setResistance(5.0F);
        marshmallowStep3 = (BlockSlab) new BlockCandyStep(Material.WOOD, true, 5, SoundType.WOOD).setTranslationKey("marshmallow_step_3").setHardness(3.0F).setResistance(5.0F);
        licoriceBrick = new BlockCandyBase(Material.ROCK, SoundType.STONE).setHardness(3.0F).setResistance(5.0F).setTranslationKey("licorice_brick").setCreativeTab(CandyCraft.getCandyTab());
        licoriceBrickStairs = new BlockCandyStairs(licoriceBrick.getDefaultState(), SoundType.STONE).setHardness(3.0F).setResistance(5.0F).setTranslationKey("licorice_brick_stairs").setCreativeTab(CandyCraft.getCandyTab());
        licoriceHalfStep = (BlockSlab) new BlockCandyStep(Material.ROCK, false, 1, SoundType.STONE).setTranslationKey("licorice_brick_slab").setCreativeTab(CandyCraft.getCandyTab()).setHardness(3.0F).setResistance(5.0F);
        licoriceStep = (BlockSlab) new BlockCandyStep(Material.ROCK, true, 1, SoundType.STONE).setTranslationKey("licorice_brick_double_slab").setHardness(3.0F).setResistance(5.0F);
        licoriceBlock = new BlockCandyBase(Material.IRON, SoundType.METAL).setHardness(5.0F).setResistance(10.0F).setTranslationKey("licorice_block").setCreativeTab(CandyCraft.getCandyTab());
        candyCaneBlock = new BlockCandyCane(Material.WOOD, SoundType.WOOD).setHardness(1.0F).setResistance(2.0F).setTranslationKey("candy_cane_block").setCreativeTab(CandyCraft.getCandyTab());
        candyCaneFence = new BlockFence(Material.WOOD, MapColor.RED).setHardness(1.0F).setResistance(2.0F).setTranslationKey("candy_cane_fence").setCreativeTab(CandyCraft.getCandyTab());
        candyCaneWall = new BlockCandyWall(candyCaneFence, SoundType.WOOD).setHardness(1.0F).setResistance(2.0F).setTranslationKey("candy_cane_wall").setCreativeTab(CandyCraft.getCandyTab());
        candyCaneStairs = new BlockCandyStairs(candyCaneBlock.getDefaultState(), SoundType.WOOD).setHardness(1.0F).setResistance(2.0F).setTranslationKey("candy_cane_stairs").setCreativeTab(CandyCraft.getCandyTab());
        candyCaneHalfStep = (BlockSlab) new BlockCandyStep(Material.WOOD, false, 2, SoundType.STONE).setTranslationKey("candy_cane_half_step").setCreativeTab(CandyCraft.getCandyTab()).setHardness(1.0F).setResistance(2.0F);
        candyCaneStep = (BlockSlab) new BlockCandyStep(Material.WOOD, true, 2, SoundType.STONE).setTranslationKey("candy_cane_step").setHardness(1.0F).setResistance(2.0F);
        jellyOre = new BlockCandyBase(Material.ROCK, SoundType.STONE).setCreativeTab(CandyCraft.getCandyTab()).setHardness(3.0F).setResistance(5.0F).setTranslationKey("jelly_ore");
        trampojelly = new BlockJelly(2.0D).setCreativeTab(CandyCraft.getCandyTab()).setHardness(3.0F).setResistance(2000.0F).setTranslationKey("trampojelly");
        redTrampojelly = new BlockJelly(4.0D).setCreativeTab(CandyCraft.getCandyTab()).setHardness(3.0F).setResistance(2000.0F).setTranslationKey("red_trampojelly");
        yellowTrampojelly = new BlockJelly(1.0D).setCreativeTab(CandyCraft.getCandyTab()).setHardness(3.0F).setResistance(2000.0F).setTranslationKey("yellow_trampojelly");
        jellyShockAbsorber = new BlockJelly(-1.0D).setCreativeTab(CandyCraft.getCandyTab()).setHardness(3.0F).setResistance(2000.0F).setTranslationKey("jelly_shock_absorber");
        lollipopBlock = new BlockLollipop().setCreativeTab(CandyCraft.getCandyTab()).setHardness(0.0F).setResistance(0.0F).setTranslationKey("lollipop_block");
        lollipopPlant = new BlockLollipopPlant().setHardness(0.0F).setResistance(0.0F).setTranslationKey("lollipop_plant");
        caramelBlock = new BlockCandyBase(Material.IRON, SoundType.METAL).setCreativeTab(CandyCraft.getCandyTab()).setHardness(2.0F).setResistance(2000.0F).setTranslationKey("caramel_block");
        sugarFactory = new BlockSugarFactory(Material.IRON, false).setCreativeTab(CandyCraft.getCandyTab()).setHardness(2.0F).setResistance(5.0F).setTranslationKey("sugar_factory");
        sugarFurnace = new BlockCandyFurnace(false).setHardness(5.0F).setResistance(10.0F).setTranslationKey("licorice_furnace").setCreativeTab(CandyCraft.getCandyTab());
        sugarFurnaceOn = new BlockCandyFurnace(true).setLightLevel(0.875F).setHardness(5.0F).setResistance(10.0F).setTranslationKey("licorice_furnace_on");
        candyPortal = (BlockCandyPortal) new BlockCandyPortal().setHardness(-1.0F).setLightLevel(0.75F).setTranslationKey("candy_portal");
        sugarBlock = new BlockSugar(Material.SAND).setCreativeTab(CandyCraft.getCandyTab()).setHardness(0.3F).setTranslationKey("sugar_block");
        chocolateStone = new BlockChocolateStone().setHardness(1.5F).setResistance(10.0F).setTranslationKey("chocolate_stone").setCreativeTab(CandyCraft.getCandyTab());
        chocolateCobbleStone = new BlockCandyBase(Material.ROCK, SoundType.STONE).setHardness(2.0F).setResistance(10.0F).setTranslationKey("chocolate_cobblestone").setCreativeTab(CandyCraft.getCandyTab());
        marshmallowSlice = new BlockCandyWaterLily().setHardness(0.0F).setTranslationKey("marshmallow_slice").setCreativeTab(CandyCraft.getCandyTab());
        dragibusCrops = new BlockDragibus().setTranslationKey("dragibus_crops");
        pinkSeeweed = new BlockSeaweed(true).setTranslationKey("rope_licorice").setCreativeTab(CandyCraft.getCandyTab());
        greenSeeweed = new BlockSeaweed(false).setTranslationKey("mint").setCreativeTab(CandyCraft.getCandyTab());
        marshmallowWorkbench = new BlockCandyWorkbench().setHardness(2.5F).setTranslationKey("marshmallow_workbench").setCreativeTab(CandyCraft.getCandyTab());
        marshmallowLadder = new BlockCandyLadder().setHardness(2.5F).setTranslationKey("marshmallow_ladder").setCreativeTab(CandyCraft.getCandyTab());
        marshmallowDoor = new BlockCandyDoor(Material.WOOD).setHardness(2.5F).setTranslationKey("marshmallow_door");
        fraiseTagadaFlower = new BlockCandyFlower().setHardness(0.0F).setTranslationKey("fraise_tagada_flower").setCreativeTab(CandyCraft.getCandyTab());
        marshmallowChest = (BlockCandyChest) new BlockCandyChest(BlockChest.Type.BASIC).setHardness(0.0F).setTranslationKey("marshmallow_chest").setHardness(2.5F).setCreativeTab(CandyCraft.getCandyTab());
        honeyOre = new BlockHoneyOre(Material.ROCK).setDroppedItem(CCItems.honeyShard).setHardness(3.0F).setResistance(5.0F).setTranslationKey("honey_ore").setCreativeTab(CandyCraft.getCandyTab());
        honeyTorch = new BlockCandyTorch().setLightLevel(0.9375F).setHardness(0.0F).setTranslationKey("honey_torch").setCreativeTab(CandyCraft.getCandyTab());
        honeyBlock = new BlockCandyBase(Material.ROCK, SoundType.STONE).setHardness(2.0F).setTranslationKey("honeycomb_block").setCreativeTab(CandyCraft.getCandyTab());
        honeyLamp = new BlockCandyBase(Material.IRON, SoundType.GLASS).setHardness(1.0F).setLightLevel(1.0F).setTranslationKey("honey_lamp").setCreativeTab(CandyCraft.getCandyTab());
        PEZOre = new BlockCandyBase(Material.ROCK, SoundType.STONE).setHardness(1.0F).setTranslationKey("PEZ_ore").setHardness(3.0F).setResistance(5.0F).setCreativeTab(CandyCraft.getCandyTab());
        PEZBlock = new BlockCandyBase(Material.IRON, SoundType.METAL).setHardness(5.0F).setResistance(10.0F).setTranslationKey("PEZ_block").setCreativeTab(CandyCraft.getCandyTab());
        grenadine = (BlockCandyLiquid) new BlockCandyLiquid(Material.WATER).setTranslationKey("grenadine");
        jawBreakerBlock = new BlockCandyBase(Material.ROCK, SoundType.STONE).setBlockUnbreakable().setResistance(6000000.0F).setTranslationKey("jaw_breaker_block").setCreativeTab(CandyCraft.getCandyTab());
        purpleJellyJump = new BlockJelly(2.1D).setLightLevel(0.8F).setHardness(3.0F).setResistance(2000.0F).setTranslationKey("purple_trampojelly");
        cottonCandyBlock = new BlockCandyBase(Material.CLOTH, SoundType.CLOTH).setCreativeTab(CandyCraft.getCandyTab()).setTranslationKey("cotton_candy_block").setHardness(0.6F);
        jawBreakerLight = new BlockCandyBase(Material.ROCK, SoundType.STONE).setLightLevel(0.7F).setBlockUnbreakable().setResistance(6000000.0F).setTranslationKey("jaw_breaker_light").setCreativeTab(CandyCraft.getCandyTab());
        cranberrySpikes = new BlockSpikes(2).setTranslationKey("cranberry_spikes").setCreativeTab(CandyCraft.getCandyTab());
        cottonCandyStairs = new BlockCandyStairs(cottonCandyBlock.getDefaultState(), SoundType.CLOTH).setHardness(0.6F).setTranslationKey("cotton_candy_stairs").setCreativeTab(CandyCraft.getCandyTab());
        cottonCandyHalfStep = (BlockSlab) new BlockCandyStep(Material.CLOTH, false, 3, SoundType.CLOTH).setTranslationKey("cotton_candy_half_step").setCreativeTab(CandyCraft.getCandyTab()).setHardness(3.0F).setResistance(5.0F);
        cottonCandyStep = (BlockSlab) new BlockCandyStep(Material.CLOTH, true, 3, SoundType.CLOTH).setTranslationKey("cotton_candy_step").setHardness(3.0F).setResistance(5.0F);
        cottonCandyBedBlock = new BlockCandyBed().setHardness(0.2F).setTranslationKey("cotton_candy_bed_block");
        mintBlock = new BlockCandyBase(Material.CLOTH, SoundType.PLANT).setHardness(1.0F).setTranslationKey("mint_block").setCreativeTab(CandyCraft.getCandyTab());
        raspberryBlock = new BlockCandyBase(Material.CLOTH, SoundType.PLANT).setHardness(1.0F).setTranslationKey("raspberry_block").setCreativeTab(CandyCraft.getCandyTab());
        jellySentryKeyHole = new BlockKeyHole(Material.ROCK, 0).setBlockUnbreakable().setResistance(6000000.0F).setTranslationKey("jelly_sentry_key_hole").setCreativeTab(CandyCraft.getCandyTab());
        jellyBossKeyHole = new BlockKeyHole(Material.ROCK, 1).setBlockUnbreakable().setResistance(6000000.0F).setTranslationKey("jelly_boss_key_hole").setCreativeTab(CandyCraft.getCandyTab());
        sugarSpikes = new BlockSpikes(4).setTranslationKey("sugar_spikes").setCreativeTab(CandyCraft.getCandyTab());
        blockTeleporter = new BlockTeleporter(Material.ROCK).setHardness(3.0F).setResistance(2000.0F).setTranslationKey("block_teleporter");
        caramelGlass0 = new BlockCandyGlass(Material.GLASS).setSilkHarvest(true).setDroppedItem(null).setLightOpacity(0).setHardness(0.3F).setTranslationKey("caramel_glass_0").setCreativeTab(CandyCraft.getCandyTab());
        caramelGlass1 = new BlockCandyGlass(Material.GLASS).setSilkHarvest(true).setDroppedItem(null).setLightOpacity(0).setHardness(0.5F).setTranslationKey("caramel_glass_1").setCreativeTab(CandyCraft.getCandyTab());
        caramelGlass2 = new BlockCandyGlass(Material.GLASS).setSilkHarvest(true).setDroppedItem(null).setLightOpacity(0).setHardness(0.7F).setTranslationKey("caramel_glass_2").setCreativeTab(CandyCraft.getCandyTab());
        caramelPane0 = new BlockCandyGlassPane(Material.GLASS, false).setHardness(0.3F).setTranslationKey("caramel_pane_0").setCreativeTab(CandyCraft.getCandyTab());
        caramelPane1 = new BlockCandyGlassPane(Material.GLASS, false).setHardness(0.5F).setTranslationKey("caramel_pane_1").setCreativeTab(CandyCraft.getCandyTab());
        caramelPane2 = new BlockCandyGlassPane(Material.GLASS, false).setHardness(0.7F).setTranslationKey("caramel_pane_2").setCreativeTab(CandyCraft.getCandyTab());
        cottonCandyWeb = new BlockWeb().setLightOpacity(1).setHardness(4.0F).setTranslationKey("cotton_candy_web").setCreativeTab(CandyCraft.getCandyTab());
        cherryBlock = new BlockCherry(Material.WOOD).setLightOpacity(1).setHardness(0.2F).setTranslationKey("cherry_block");
        bananaSeaweed = new BlockSeaweed(false).setTranslationKey("banana_seaweed").setCreativeTab(CandyCraft.getCandyTab());
        nougatOre = new BlockNougatOre(Material.ROCK).setHardness(3.0F).setResistance(5.0F).setTranslationKey("nougat_ore").setCreativeTab(CandyCraft.getCandyTab());
        advancedSugarFactory = new BlockSugarFactory(Material.IRON, true).setCreativeTab(CandyCraft.getCandyTab()).setHardness(2.0F).setResistance(5.0F).setTranslationKey("advanced_sugar_factory");
        poisonousFlower = new BlockCandyFlower().setHardness(0.0F).setTranslationKey("acid_mint_flower").setCreativeTab(CandyCraft.getCandyTab());
        nougatBlock = new BlockCandyBase(Material.IRON, SoundType.METAL).setHardness(1.0F).setTranslationKey("nougat_block").setCreativeTab(CandyCraft.getCandyTab());
        nougatHead = new BlockNougatHead().setHardness(1.0F).setTranslationKey("nougat_head").setCreativeTab(CandyCraft.getCandyTab());
        bananaBlock = new BlockCandyBase(Material.CLOTH, SoundType.PLANT).setHardness(1.0F).setTranslationKey("banana_block").setCreativeTab(CandyCraft.getCandyTab());
        chewingGumBlock = new BlockChewingGum(Material.CLOTH).setHardness(1.0F).setTranslationKey("chewing_gum_block").setCreativeTab(CandyCraft.getCandyTab());
        chewingGumPuddle = new BlockChewingGumPlate(Material.PLANTS).setHardness(1.0F).setTranslationKey("chewing_gum_puddle").setCreativeTab(CandyCraft.getCandyTab());
        alchemyTable = new BlockAlchemyTable(Material.ROCK).setHardness(1.0F).setTranslationKey("alchemy_table").setCreativeTab(CandyCraft.getCandyTab());
        marshmallowFlowerBlock = new BlockCandyWaterLily().setHardness(0.0F).setTranslationKey("marshmallow_flower_block").setCreativeTab(CandyCraft.getCandyTab());
        grenadineBlock = new BlockGrenadine(Material.GLASS).setHardness(1.0F).setTranslationKey("grenadine_block").setCreativeTab(CandyCraft.getCandyTab());
        iceCream = new BlockIceCream(Material.SAND).addMetaToCreative(0, 1, 2, 3).setHardness(1.0F).setTranslationKey("ice_cream").setCreativeTab(CandyCraft.getCandyTab());
        iceCreamStairs0 = new BlockCandyStairs(iceCream.getStateFromMeta(0), SoundType.SNOW).setTranslationKey("ice_cream_stairs.0").setCreativeTab(CandyCraft.getCandyTab()).setHardness(1.0F);
        iceCreamStairs1 = new BlockCandyStairs(iceCream.getStateFromMeta(1), SoundType.SNOW).setTranslationKey("ice_cream_stairs.1").setCreativeTab(CandyCraft.getCandyTab()).setHardness(1.0F);
        iceCreamStairs2 = new BlockCandyStairs(iceCream.getStateFromMeta(2), SoundType.SNOW).setTranslationKey("ice_cream_stairs.2").setCreativeTab(CandyCraft.getCandyTab()).setHardness(1.0F);
        iceCreamStairs3 = new BlockCandyStairs(iceCream.getStateFromMeta(3), SoundType.SNOW).setTranslationKey("ice_cream_stairs.3").setCreativeTab(CandyCraft.getCandyTab()).setHardness(1.0F);
        iceCreamHalfStep0 = (BlockSlab) new BlockCandyStep(Material.SAND, false, 6, SoundType.SNOW).setTranslationKey("ice_cream_half_step_0").setCreativeTab(CandyCraft.getCandyTab()).setHardness(1.0F);
        iceCreamStep0 = (BlockSlab) new BlockCandyStep(Material.SAND, true, 6, SoundType.SNOW).setTranslationKey("ice_cream_step_0").setHardness(1.0F);
        iceCreamHalfStep1 = (BlockSlab) new BlockCandyStep(Material.SAND, false, 7, SoundType.SNOW).setTranslationKey("ice_cream_half_step_1").setCreativeTab(CandyCraft.getCandyTab()).setHardness(1.0F);
        iceCreamStep1 = (BlockSlab) new BlockCandyStep(Material.SAND, true, 7, SoundType.SNOW).setTranslationKey("ice_cream_step_1").setHardness(1.0F);
        iceCreamHalfStep2 = (BlockSlab) new BlockCandyStep(Material.SAND, false, 8, SoundType.SNOW).setTranslationKey("ice_cream_half_step_2").setCreativeTab(CandyCraft.getCandyTab()).setHardness(1.0F);
        iceCreamStep2 = (BlockSlab) new BlockCandyStep(Material.SAND, true, 8, SoundType.SNOW).setTranslationKey("ice_cream_step_2").setHardness(1.0F);
        iceCreamHalfStep3 = (BlockSlab) new BlockCandyStep(Material.SAND, false, 9, SoundType.SNOW).setTranslationKey("ice_cream_half_step_3").setCreativeTab(CandyCraft.getCandyTab()).setHardness(1.0F);
        iceCreamStep3 = (BlockSlab) new BlockCandyStep(Material.SAND, true, 9, SoundType.SNOW).setTranslationKey("ice_cream_step_3").setHardness(1.0F);
        dragonEggBlock = new BlockEgg().setHardness(3.0F).setResistance(15.0F).setTranslationKey("dragon_egg_block").setCreativeTab(CandyCraft.getCandyTab());
        beetleEggBlock = new BlockEgg().setHardness(3.0F).setResistance(15.0F).setTranslationKey("beetle_egg_block").setCreativeTab(CandyCraft.getCandyTab());
        sugarEssenceFlower = new BlockCandyFlower().setHardness(0.0F).setTranslationKey("sugar_essence_flower").setCreativeTab(CandyCraft.getCandyTab());
        caramelBrick = new BlockCandyBase(Material.IRON, SoundType.METAL).setCreativeTab(CandyCraft.getCandyTab()).setHardness(2.0F).setResistance(2000.0F).setTranslationKey("caramel_brick");
        caramelBrickStairs = new BlockCandyStairs(caramelBrick.getDefaultState(), SoundType.METAL).setCreativeTab(CandyCraft.getCandyTab()).setHardness(2.0F).setResistance(2000.0F).setTranslationKey("caramel_brick_stairs");
        caramelHalfStep = (BlockSlab) new BlockCandyStep(Material.IRON, false, 10, SoundType.METAL).setTranslationKey("caramel_brick_slab").setCreativeTab(CandyCraft.getCandyTab()).setHardness(2.0F).setResistance(2000.0F);
        caramelStep = (BlockSlab) new BlockCandyStep(Material.IRON, true, 10, SoundType.METAL).setTranslationKey("caramel_brick_double_slab").setHardness(2.0F).setResistance(2000.0F);
        cottonCandyJukebox = new BlockCandyJukebox().setTranslationKey("cotton_candy_jukebox").setCreativeTab(CandyCraft.getCandyTab());
        chocolateStairs = new BlockCandyStairs(chocolateStone.getDefaultState(), SoundType.STONE).setHardness(1.5F).setResistance(10.0F).setTranslationKey("chocolate_stone_stairs").setCreativeTab(CandyCraft.getCandyTab());
        chocolateHalfStep = (BlockSlab) new BlockCandyStep(Material.ROCK, false, 11, SoundType.STONE).setHardness(1.5F).setResistance(10.0F).setTranslationKey("chocolate_stone_slab").setCreativeTab(CandyCraft.getCandyTab());
        chocolateStep = (BlockSlab) new BlockCandyStep(Material.ROCK, true, 11, SoundType.STONE).setHardness(1.5F).setResistance(10.0F).setTranslationKey("chocolate_stone_double_slab").setCreativeTab(CandyCraft.getCandyTab());
        chocolateCobbleStairs = new BlockCandyStairs(chocolateCobbleStone.getDefaultState(), SoundType.STONE).setHardness(2.0F).setResistance(10.0F).setTranslationKey("chocolate_cobblestone_stairs").setCreativeTab(CandyCraft.getCandyTab());
        chocolateCobbleHalfStep = (BlockSlab) new BlockCandyStep(Material.ROCK, false, 12, SoundType.STONE).setHardness(2.0F).setResistance(10.0F).setTranslationKey("chocolate_cobblestone_slab").setCreativeTab(CandyCraft.getCandyTab());
        chocolateCobbleStep = (BlockSlab) new BlockCandyStep(Material.ROCK, true, 12, SoundType.STONE).setHardness(2.0F).setResistance(10.0F).setTranslationKey("chocolate_cobblestone_double_slab").setCreativeTab(CandyCraft.getCandyTab());
        chocolateCobbleWall = new BlockCandyWall(chocolateCobbleStone, SoundType.STONE).setHardness(2.0F).setResistance(10.0F).setTranslationKey("chocolate_cobblestone_wall").setCreativeTab(CandyCraft.getCandyTab());
        suguardSentryKeyHole = new BlockKeyHole(Material.ROCK, 2).setBlockUnbreakable().setResistance(6000000.0F).setTranslationKey("suguard_sentry_key_hole").setCreativeTab(CandyCraft.getCandyTab());
        suguardBossKeyHole = new BlockKeyHole(Material.ROCK, 3).setBlockUnbreakable().setResistance(6000000.0F).setTranslationKey("suguard_boss_key_hole").setCreativeTab(CandyCraft.getCandyTab());
        marshmallowTrapdoor = new BlockCandyTrapDoor(Material.WOOD).setTranslationKey("marshmallow_trapdoor").setHardness(2.5F).setCreativeTab(CandyCraft.getCandyTab());
    }

    public static void registerBlocks(Side side) {
        currentSide = side;
        registerMultiBlock(pudding, ItemPudding.class, "pudding", 0);
        registerBlock(flour);
        registerMultiBlock(marshmallowPlanks, ItemCandyBlock.class, marshmallowPlanks.getTranslationKey(), 3);
        registerMultiBlock(marshmallowLog, ItemCandyBlock.class, marshmallowLog.getTranslationKey(), 3);
        registerMultiBlock(candyLeave, ItemCandyLeaves.class, candyLeave.getTranslationKey(), 16);
        registerMultiBlock(candyLeave2, ItemCandyLeaves.class, candyLeave2.getTranslationKey(), 16);
        registerMultiBlock(candySapling, ItemCandyBlock.class, candySapling.getTranslationKey(), 4);
        registerBlock(candySoil);
        registerMultiBlock(tallCandyGrass, ItemCandyBlock.class, tallCandyGrass.getTranslationKey(), 4);
        registerBlock(licoriceOre);
        registerBlock(marshmallowFence);
        registerBlock(marshmallowStairs);
        registerBlock(marshmallowStairs2);
        registerBlock(marshmallowStairs3);
        registerMultiBlock(marshmallowHalfStep, ItemCandySlab.class, "marshmallow_slab.0", 2);
        registerMultiBlock(marshmallowStep, ItemCandySlab.class, "marshmallow_double_slab.0", 1);
        registerMultiBlock(marshmallowHalfStep2, ItemCandySlab.class, "marshmallow_slab.1", 2);
        registerMultiBlock(marshmallowStep2, ItemCandySlab.class, "marshmallow_double_slab.1", 1);
        registerMultiBlock(marshmallowHalfStep3, ItemCandySlab.class, "marshmallow_slab.2", 2);
        registerMultiBlock(marshmallowStep3, ItemCandySlab.class, "marshmallow_double_slab.2", 1);
        registerBlock(marshmallowTrapdoor);
        registerBlock(licoriceBrick);
        registerBlock(licoriceBrickStairs);
        registerMultiBlock(licoriceHalfStep, ItemCandySlab.class, "licorice_brick_slab", 2);
        registerMultiBlock(licoriceStep, ItemCandySlab.class, "licorice_brick_double_slab", 1);
        registerBlock(licoriceBlock);
        registerBlock(candyCaneBlock);
        registerBlock(candyCaneFence);
        registerBlock(candyCaneWall);
        registerBlock(candyCaneStairs);
        registerMultiBlock(candyCaneHalfStep, ItemCandySlab.class, "candy_cane_slab", 2);
        registerMultiBlock(candyCaneStep, ItemCandySlab.class, "candy_cane_double_slab", 1);
        registerBlock(jellyOre);
        registerBlock(trampojelly);
        registerBlock(redTrampojelly);
        registerBlock(yellowTrampojelly);
        registerBlock(jellyShockAbsorber);
        registerBlock(lollipopBlock);
        registerBlock(caramelBlock);
        registerBlock(caramelBrick);
        registerBlock(caramelBrickStairs);
        registerMultiBlock(caramelHalfStep, ItemCandySlab.class, "caramel_brick_slab", 2);
        registerMultiBlock(caramelStep, ItemCandySlab.class, "caramel_brick_double_slab", 1);
        registerBlock(sugarFactory);
        registerBlock(advancedSugarFactory);
        registerBlock(sugarFurnace);
        registerBlock(sugarFurnaceOn);
        registerBlock(candyPortal);
        registerBlock(sugarBlock);
        registerBlock(dragibusCrops);
        registerBlock(lollipopPlant);
        registerBlock(chocolateStone);
        registerBlock(chocolateStairs);
        registerMultiBlock(chocolateHalfStep, ItemCandySlab.class, "chocolate_stone_slab", 2);
        registerMultiBlock(chocolateStep, ItemCandySlab.class, "chocolate_stone_double_slab", 1);
        registerBlock(chocolateCobbleStone);
        registerBlock(chocolateCobbleStairs);
        registerMultiBlock(chocolateCobbleHalfStep, ItemCandySlab.class, "chocolate_cobblestone_slab", 2);
        registerMultiBlock(chocolateCobbleStep, ItemCandySlab.class, "chocolate_cobblestone_double_slab", 1);
        registerBlock(chocolateCobbleWall);
        registerBlock(pinkSeeweed);
        registerBlock(greenSeeweed);
        registerBlock(bananaSeaweed);
        registerBlock(marshmallowWorkbench);
        registerBlock(marshmallowLadder);
        registerBlock(marshmallowDoor);
        registerBlock(fraiseTagadaFlower);
        registerBlock(poisonousFlower);
        registerBlock(sugarEssenceFlower);
        registerBlock(marshmallowChest);
        registerBlock(honeyOre);
        registerBlock(honeyTorch);
        registerBlock(honeyBlock);
        registerBlock(honeyLamp);
        registerBlock(PEZOre);
        registerBlock(PEZBlock);
        registerBlock(grenadine);
        registerBlock(purpleJellyJump);
        registerBlock(cottonCandyBlock);
        registerBlock(cottonCandyStairs);
        registerMultiBlock(cottonCandyHalfStep, ItemCandySlab.class, "cotton_candy_slab", 2);
        registerMultiBlock(cottonCandyStep, ItemCandySlab.class, "cotton_candy_double_slab", 1);
        registerBlock(cottonCandyBedBlock);
        registerBlock(cottonCandyJukebox);
        registerBlock(cranberrySpikes);
        registerBlock(sugarSpikes);
        registerBlock(mintBlock);
        registerBlock(raspberryBlock);
        registerBlock(bananaBlock);
        registerBlock(grenadineBlock);
        registerBlock(blockTeleporter);
        registerMultiBlock(marshmallowSlice, ItemCandyWaterLily.class, "marshmallow_slice_block", 0);
        registerMultiBlock(marshmallowFlowerBlock, ItemCandyWaterLily.class, "marshmallow_flower_block", 0);
        registerBlock(caramelGlass0);
        registerBlock(caramelGlass1);
        registerBlock(caramelGlass2);
        registerBlock(caramelPane0);
        registerBlock(caramelPane1);
        registerBlock(caramelPane2);
        registerBlock(cottonCandyWeb);
        registerBlock(cherryBlock);
        registerBlock(nougatOre);
        registerBlock(nougatBlock);
        registerBlock(nougatHead);
        registerBlock(chewingGumBlock);
        registerBlock(chewingGumPuddle);
        registerBlock(alchemyTable);
        registerMultiBlock(iceCream, ItemCandyBlock.class, iceCream.getTranslationKey(), 4);
        registerBlock(iceCreamStairs0);
        registerBlock(iceCreamStairs1);
        registerBlock(iceCreamStairs2);
        registerBlock(iceCreamStairs3);
        registerMultiBlock(iceCreamHalfStep0, ItemCandySlab.class, "ice_cream_slab.0", 2);
        registerMultiBlock(iceCreamStep0, ItemCandySlab.class, "ice_cream_double_slab.0", 1);
        registerMultiBlock(iceCreamHalfStep1, ItemCandySlab.class, "ice_cream_slab.1", 2);
        registerMultiBlock(iceCreamStep1, ItemCandySlab.class, "ice_cream_double_slab.1", 1);
        registerMultiBlock(iceCreamHalfStep2, ItemCandySlab.class, "ice_cream_slab.2", 2);
        registerMultiBlock(iceCreamStep2, ItemCandySlab.class, "ice_cream_double_slab.2", 1);
        registerMultiBlock(iceCreamHalfStep3, ItemCandySlab.class, "ice_cream_slab.3", 2);
        registerMultiBlock(iceCreamStep3, ItemCandySlab.class, "ice_cream_double_slab.3", 1);
        registerBlock(dragonEggBlock);
        registerBlock(beetleEggBlock);
        registerBlock(jellySentryKeyHole);
        registerBlock(jellyBossKeyHole);
        registerBlock(suguardSentryKeyHole);
        registerBlock(suguardBossKeyHole);
        registerBlock(jawBreakerBlock);
        registerBlock(jawBreakerLight);

        GameRegistry.registerTileEntity(TileEntityCandyChest.class, new ResourceLocation(CandyCraft.MODID, "candychest"));
        GameRegistry.registerTileEntity(TileEntityTeleporter.class, new ResourceLocation(CandyCraft.MODID, "teleporterblock"));
        GameRegistry.registerTileEntity(TileEntitySugarFactory.class, new ResourceLocation(CandyCraft.MODID, "sugarfactory"));
        GameRegistry.registerTileEntity(TileEntitySugarFurnace.class, new ResourceLocation(CandyCraft.MODID, "sugarfurnace"));
        GameRegistry.registerTileEntity(TileEntityAlchemy.class, new ResourceLocation(CandyCraft.MODID, "alchemytable"));
        GameRegistry.registerTileEntity(TileEntityEgg.class, new ResourceLocation(CandyCraft.MODID, "hatchingegg"));

        doMiningLevel();
    }

    //TODO: I'm tearing this apart. Just you all watch...
    public static void registerMultiBlock(Block block, Class cl, String name, int metadataAmount) {
        GameRegistry.registerBlock(block, cl, name);
        CandyCraft.getItemList().add(Item.getItemFromBlock(block));
        if (currentSide == Side.CLIENT) {
            if (cl == ItemCandyLeaves.class) {
                String[] metaNames = new String[metadataAmount];
                int realMeta = 0;
                for (int i = 0; i < metaNames.length; i++) {
                    metaNames[i] = "candycraftmod:" + name + "." + realMeta;
                    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), i, new ModelResourceLocation("candycraftmod:" + name + "." + realMeta, "inventory"));
                    realMeta++;
                    if (realMeta > 3) {
                        realMeta = 0;
                    }
                }
                ModelBakery.registerItemVariants(Item.getItemFromBlock(block), metaNames);
            } else if (cl == ItemCandySlab.class) {
                Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation("candycraftmod:" + name, "inventory"));
            } else if (metadataAmount > 0) {
                String[] metaNames = new String[metadataAmount];
                for (int i = 0; i < metaNames.length; i++) {
                    metaNames[i] = "candycraftmod:" + name + "." + i;
                    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), i, new ModelResourceLocation("candycraftmod:" + name + "." + i, "inventory"));
                }
                ModelBakery.addVariantName(Item.getItemFromBlock(block), metaNames);
            } else {
                Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation("candycraftmod:" + name, "inventory"));
            }
        }
    }

    public static void registerBlock(final Block block) {
        CandyCraft.getBlockList().add(block);
        CandyCraft.getItemList().add(Item.getItemFromBlock(block));
    }


    public static void doMiningLevel() {
        licoriceOre.setHarvestLevel("pickaxe", 1);
        PEZOre.setHarvestLevel("pickaxe", 3);
        honeyOre.setHarvestLevel("pickaxe", 0);
        chocolateStone.setHarvestLevel("pickaxe", 0);
        chocolateCobbleStone.setHarvestLevel("pickaxe", 0);
        sugarFurnace.setHarvestLevel("pickaxe", 0);
        jellyOre.setHarvestLevel("pickaxe", 2);
        nougatOre.setHarvestLevel("pickaxe", 2);
        pudding.setHarvestLevel("shovel", 0);
        flour.setHarvestLevel("shovel", 0);
    }

    @SubscribeEvent
    public static void onRegister(RegistryEvent.Register<Block> registry) {
        for (Block block : CandyCraft.getBlockList()) {
            registry.getRegistry().register(block);
        }
    }
}
