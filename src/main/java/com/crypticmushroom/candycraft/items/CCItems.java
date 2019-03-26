package com.crypticmushroom.candycraft.items;

import com.crypticmushroom.candycraft.CandyCraft;
import com.crypticmushroom.candycraft.blocks.CCBlocks;
import com.crypticmushroom.candycraft.misc.ModelRegisterCallback;
import com.google.common.collect.ImmutableList;
import net.minecraft.block.Block;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;

import static com.crypticmushroom.candycraft.blocks.CCBlocks.*;
import static com.crypticmushroom.candycraft.client.CCSoundEvents.*;

@GameRegistry.ObjectHolder(CandyCraft.MODID)
@Mod.EventBusSubscriber(modid = CandyCraft.MODID)
public class CCItems {
    /**
     * Materials
     **/
    private static ToolMaterial licoriceMaterial = EnumHelper.addToolMaterial("Licorice", 1, 175, 4.0F, 1, 8);
    private static ArmorMaterial licoriceArmorMaterial = EnumHelper.addArmorMaterial("Licorice", "licorice", 18, new int[]{1, 5, 4, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
    private static ToolMaterial honeyMaterial = EnumHelper.addToolMaterial("Honey", 3, 400, 7.0F, 2.0F, 18);
    private static ArmorMaterial honeyArmorMaterial = EnumHelper.addArmorMaterial("Honey", "honey", 22, new int[]{2, 7, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
    private static ToolMaterial PEZMaterial = EnumHelper.addToolMaterial("PEZ", 4, 1034, 7.6F, 3.4F, 3);
    private static ArmorMaterial PEZArmorMaterial = EnumHelper.addArmorMaterial("PEZ", "pez", 24, new int[]{4, 9, 7, 4}, 6, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

    private static ArmorMaterial jellyCrownMaterial = EnumHelper.addArmorMaterial("Jelly_Crown", "Jelly_Crown", 0, new int[]{0, 0, 0, 0}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
    private static ArmorMaterial waterMaskMaterial = EnumHelper.addArmorMaterial("Water_Mask", "Armor_Mask", 0, new int[]{0, 0, 0, 0}, 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
    private static ArmorMaterial jellyBootsMaterial = EnumHelper.addArmorMaterial("Jelly_Boots", "Armor_Boots", 0, new int[]{0, 0, 0, 0}, 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
    /**
     * Items
     **/
    // /Materials
    // Marshmallow
    public static final Item marshmallowStick = new ItemCandyBase().setTranslationKey("marshmallow_stick");
    public static final Item marshmallowSword = new ItemCandySword(ToolMaterial.WOOD).setTranslationKey("marshmallow_sword");
    public static final Item marshmallowShovel = new ItemCandyShovel(ToolMaterial.WOOD).setTranslationKey("marshmallow_shovel");
    public static final Item marshmallowPickaxe = new ItemCandyPickaxe(ToolMaterial.WOOD).setTranslationKey("marshmallow_pickaxe");
    public static final Item marshmallowAxe = new ItemCandyAxe(ToolMaterial.WOOD).setTranslationKey("marshmallow_axe");
    public static final Item marshmallowHoe = new ItemCandyHoe(ToolMaterial.WOOD).setTranslationKey("marshmallow_hoe");
    // Licorice
    public static final Item licorice = new ItemFood(6, true).setTranslationKey("licorice");
    public static final Item licoriceSpear = new ItemCandySword(licoriceMaterial).setTranslationKey("licorice_spear");
    public static final Item licoriceSword = new ItemCandySword(licoriceMaterial).setTranslationKey("licorice_sword");
    public static final Item licoriceShovel = new ItemCandyShovel(licoriceMaterial).setTranslationKey("licorice_shovel");
    public static final Item licoricePickAxe = new ItemCandyPickaxe(licoriceMaterial).setTranslationKey("licorice_pickaxe");
    public static final Item licoriceAxe = new ItemCandyAxe(licoriceMaterial).setTranslationKey("licorice_axe");
    public static final Item licoriceHoe = new ItemCandyHoe(licoriceMaterial).setTranslationKey("licorice_hoe");
    public static final Item licoriceHelmet = new ItemCandyArmor(licoriceArmorMaterial, EntityEquipmentSlot.HEAD).setTranslationKey("licorice_helmet");
    public static final Item licoricePlate = new ItemCandyArmor(licoriceArmorMaterial, EntityEquipmentSlot.CHEST).setTranslationKey("licorice_plate");
    public static final Item licoriceLeggings = new ItemCandyArmor(licoriceArmorMaterial, EntityEquipmentSlot.LEGS).setTranslationKey("licorice_leggings");
    public static final Item licoriceBoots = new ItemCandyArmor(licoriceArmorMaterial, EntityEquipmentSlot.FEET).setTranslationKey("licorice_boots");
    // HoneyComb
    public static final Item honeyShard = new ItemCandyBase().setTranslationKey("honey_shard");
    public static final Item honeycomb = new ItemCandyBase().setTranslationKey("honeycomb");
    public static final Item honeyHelmet = new ItemCandyArmor(honeyArmorMaterial, EntityEquipmentSlot.HEAD).setTranslationKey("honey_helmet");
    public static final Item honeyPlate = new ItemCandyArmor(honeyArmorMaterial, EntityEquipmentSlot.CHEST).setTranslationKey("honey_plate");
    public static final Item honeyLeggings = new ItemCandyArmor(honeyArmorMaterial, EntityEquipmentSlot.LEGS).setTranslationKey("honey_leggings");
    public static final Item honeyBoots = new ItemCandyArmor(honeyArmorMaterial, EntityEquipmentSlot.FEET).setTranslationKey("honey_boots");
    public static final Item honeySword = new ItemCandySword(honeyMaterial).setTranslationKey("honey_sword");
    public static final Item honeyShovel = new ItemCandyShovel(honeyMaterial).setTranslationKey("honey_shovel");
    public static final Item honeyPickaxe = new ItemCandyPickaxe(honeyMaterial).setTranslationKey("honey_pickaxe");
    public static final Item honeyAxe = new ItemCandyAxe(honeyMaterial).setTranslationKey("honey_axe");
    public static final Item honeyHoe = new ItemCandyHoe(honeyMaterial).setTranslationKey("honey_hoe");
    public static final Item caramelBow = new ItemCandyBow().setTranslationKey("caramel_bow");
    public static final Item honeyArrow = new ItemCandyBase().setTranslationKey("honey_arrow");
    public static final Item caramelCrossbow = new ItemCandyCrossbow().setTranslationKey("caramel_crossbow");
    public static final Item honeyBolt = new ItemCandyBase().setTranslationKey("honey_bolt");
    // PEZ
    public static final Item pez = new ItemFood(10, false).setPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 60, 0), 0.9F).setAlwaysEdible().setTranslationKey("pez");
    public static final Item pezDust = new ItemCandyBase().setTranslationKey("pez_dust");
    public static final Item pezHelmet = new ItemCandyArmor(PEZArmorMaterial, EntityEquipmentSlot.HEAD).setTranslationKey("pez_helmet");
    public static final Item pezPlate = new ItemCandyArmor(PEZArmorMaterial, EntityEquipmentSlot.CHEST).setTranslationKey("pez_plate");
    public static final Item pezLeggings = new ItemCandyArmor(PEZArmorMaterial, EntityEquipmentSlot.LEGS).setTranslationKey("pez_leggings");
    public static final Item pezBoots = new ItemCandyArmor(PEZArmorMaterial, EntityEquipmentSlot.FEET).setTranslationKey("pezz_boots");
    public static final Item pezSword = new ItemCandySword(PEZMaterial).setTranslationKey("pez_sword");
    public static final Item pezShovel = new ItemCandyShovel(PEZMaterial).setTranslationKey("pez_shovel");
    public static final Item pezPickaxe = new ItemCandyPickaxe(PEZMaterial).setTranslationKey("pez_pickaxe");
    public static final Item pezAxe = new ItemCandyAxe(PEZMaterial).setTranslationKey("pez_axe");
    public static final Item pezHoe = new ItemCandyHoe(PEZMaterial).setTranslationKey("pez_hoe");
    // Gummy
    public static final Item gummy = new ItemFood(4, false).setPotionEffect(new PotionEffect(MobEffects.NAUSEA, 30, 0), 0.9F).setTranslationKey("gummy");
    public static final Item hotGummy = new ItemFood(7, false).setPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 60, 1), 0.9F).setTranslationKey("hot_gummy");
    public static final Item gummy_ball = new ItemGummyBall().setTranslationKey("gummy_ball");
    // Others
    public static final Item candyCane = new ItemFood(4, true).setTranslationKey("candy_cane");
    public static final Item cottonCandy = new ItemFood(3, true).setPotionEffect(new PotionEffect(MobEffects.HASTE, 30, 0), 0.9F).setTranslationKey("cotton_candy");
    public static final Item cranberryScale = new ItemCandyBase().setTranslationKey("cranberry_scale");
    public static final Item sugarCrystal = new ItemCandyBase().setTranslationKey("sugar_crystal");
    public static final Item nougatPowder = new ItemNougatPowder(3, true).setTranslationKey("nougat_powder");
    // /Materials End

    // /StoryBoard
    // Dungeon Keys
    public static final Item orangeKey = new ItemDungeonKey(0).setTranslationKey("jelly_key");
    public static final Item blueKey = new ItemDungeonKey(1).setTranslationKey("suguard_key");
    public static final Item whiteKey = new ItemDungeonKey(2).setTranslationKey("sky_key");
    public static final Item purpleKey = new ItemDungeonKey(3).setTranslationKey("beetle_key");
    // Boss keys
    public static final Item jellySentryKey = new ItemBossKey(0).setTranslationKey("jelly_sentry_key");
    public static final Item jellyBossKey = new ItemBossKey(1).setTranslationKey("jelly_boss_key");
    public static final Item suguardSentryKey = new ItemBossKey(2).setTranslationKey("suguard_sentry_key");
    public static final Item suguardBossKey = new ItemBossKey(3).setTranslationKey("suguard_boss_key");
    // Emblems
    public static final Item honeyEmblem = new ItemEmblem("HoneyEmblem").setTranslationKey("honey_emblem");
    public static final Item jellyEmblem = new ItemEmblem("JellyEmblem").setTranslationKey("jelly_emblem");
    public static final Item suguardEmblem = new ItemEmblem("suguardEmblem").setTranslationKey("suguard_emblem");
    public static final Item cranberryEmblem = new ItemEmblem("CranberryEmblem").setTranslationKey("cranberry_emblem");
    public static final Item gingerbreadEmblem = new ItemEmblem("GingerbreadEmblem").setTranslationKey("gingerbread_emblem");
    public static final Item waterEmblem = new ItemEmblem("WaterEmblem").setTranslationKey("water_emblem");
    public static final Item chewingGumEmblem = new ItemEmblem("ChewingGumEmblem").setTranslationKey("chewing_gum_emblem");
    public static final Item skyEmblem = new ItemEmblem("SkyEmblem").setTranslationKey("sky_emblem");
    // /Storyboard End

    // /Food Purpose
    public static final Item cranberryFish = new ItemFood(2, true).setPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 30, 0), 0.9F).setTranslationKey("cranberry_fish");
    public static final Item cranberryFishCooked = new ItemFood(6, true).setPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 60, 0), 0.9F).setTranslationKey("cranberry_fish_cooked");
    public static final Item waffleNugget = new ItemFood(1, true).setTranslationKey("waffle_nugget");
    public static final Item waffle = new ItemFood(10, true).setTranslationKey("waffle");
    public static final Item lollipop = new ItemLollipop().setTranslationKey("lollipop");
    public static final Item dragibus = new ItemCandySeedFood(1, 0.3F, CCBlocks.dragibusCrops).setTranslationKey("dragibus");
    public static final Item candiedCherry = new ItemFood(3, true).setTranslationKey("candied_cherry");
    public static final Item sugarPill = ((ItemFood)new ItemGrenadineCandy().setTranslationKey("sugar_pill")).setAlwaysEdible();
    // /Food Purpose End

    // /Misc
    // Record
    public static final Item CD1 = new ItemCandyRecord(C1, "C418 - Sweden - Remix Caution & Crisis", "Sweden Remix").setTranslationKey("record_1");
    public static final Item CD2 = new ItemCandyRecord(C2, "Jakim - Every", "Every").setTranslationKey("record_2");
    public static final Item CD3 = new ItemCandyRecord(C3, "Rainbow Bunchie", "Rainbow Bunchie").setTranslationKey("record_3");
    public static final Item CD4 = new ItemCandyRecord(C4, "C418 - Einfallslos", "Einfallslos").setTranslationKey("record_4");
    // Equipment & Tools
    public static final Item fork = new ItemFork().setTranslationKey("fork");
    public static final Item dragibusStick = new ItemDragibusStick().setTranslationKey("dragibus_stick");
    public static final Item jellyCrown = new ItemCandyArmor(jellyCrownMaterial, EntityEquipmentSlot.HEAD).setTranslationKey("jelly_crown");
    public static final Item jellyWand = new ItemJellyWand().setTranslationKey("jelly_wand");
    public static final Item jumpWand = new ItemJumpWand().setTranslationKey("jump_wand");
    public static final Item jellyBoots = new ItemCandyArmor(jellyBootsMaterial, EntityEquipmentSlot.FEET).setTranslationKey("jelly_boots");
    public static final Item waterMask = new ItemCandyArmor(waterMaskMaterial, EntityEquipmentSlot.HEAD).setTranslationKey("water_mask");
    public static final Item dynamite = new ItemDynamite().setTranslationKey("dynamite");
    public static final Item glueDynamite = new ItemDynamite().setTranslationKey("glue_dynamite");
    // Block Placing
    public static final Item lollipopSeeds = new ItemCandySeeds().setTranslationKey("lollipop_seeds");
    public static final Item marshmallowDoor = new ItemCandyDoor(CCBlocks.marshmallowDoor).setTranslationKey("marshmallow_door_item");
    public static final Item cottonCandyBed = new ItemCandyBed().setMaxStackSize(1).setTranslationKey("cotton_candy_bed");
    // Others
    public static final Item marshmallowFlower = new ItemCandyBase().setTranslationKey("marshmallow_flower");
    public static final Item chewingGum = new ItemCandyBase().setTranslationKey("chewing_gum");
    public static final Item chocolateCoin = new ItemFood(2, false).setTranslationKey("chocolate_coin");
    public static final Item wiki = new ItemWiki().setTranslationKey("wiki");

    public static ItemStack caramelBucket;
    public static ItemStack grenadineBucket;

    // Misc End
    public static void loadItemMaterials() {
        licoriceMaterial.setRepairItem(new ItemStack(licorice));
        licoriceArmorMaterial.setRepairItem(new ItemStack(licorice));
        honeyMaterial.setRepairItem(new ItemStack(honeycomb));
        honeyArmorMaterial.setRepairItem(new ItemStack(honeycomb));
        PEZMaterial.setRepairItem(new ItemStack(pez));
        PEZArmorMaterial.setRepairItem(new ItemStack(pez));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> registry) {
        ItemRegistryHelper item = new ItemRegistryHelper(registry.getRegistry());

        item.register(marshmallowStick);
        item.register(marshmallowDoor);
        item.register(cottonCandyBed);
        item.register(fork);
        item.register(dragibus);
        item.register(dragibusStick);
        item.register(lollipopSeeds);
        item.register(lollipop);
        item.register(candyCane);
        item.register(marshmallowSword);
        item.register(marshmallowShovel);
        item.register(marshmallowPickaxe);
        item.register(marshmallowAxe);
        item.register(marshmallowHoe);
        item.register(gummy);
        item.register(hotGummy);
        item.register(cottonCandy);
        item.register(cranberryFish);
        item.register(cranberryFishCooked);
        item.register(gummy_ball);
        item.register(chocolateCoin);
        item.register(licorice);
        item.register(licoriceSpear);
        item.register(licoriceSword);
        item.register(licoriceShovel);
        item.register(licoricePickAxe);
        item.register(licoriceAxe);
        item.register(licoriceHoe);
        item.register(licoriceHelmet);
        item.register(licoricePlate);
        item.register(licoriceLeggings);
        item.register(licoriceBoots);
        item.register(honeyShard);
        item.register(honeycomb);
        item.register(honeySword);
        item.register(honeyShovel);
        item.register(honeyPickaxe);
        item.register(honeyAxe);
        item.register(honeyHoe);
        item.register(honeyHelmet);
        item.register(honeyPlate);
        item.register(honeyLeggings);
        item.register(honeyBoots);
        item.register(pez);
        item.register(pezDust);
        item.register(pezSword);
        item.register(pezShovel);
        item.register(pezPickaxe);
        item.register(pezAxe);
        item.register(pezHoe);
        item.register(pezHelmet);
        item.register(pezPlate);
        item.register(pezLeggings);
        item.register(pezBoots);
        item.register(caramelBow);
        item.register(honeyArrow);
        item.register(caramelCrossbow);
        item.register(honeyBolt);
        item.register(cranberryScale);
        item.register(sugarCrystal);
        item.register(jellyWand);
        item.register(jumpWand);
        item.register(waterMask);
        item.register(jellyCrown);
        item.register(jellyBoots);
        item.register(candiedCherry);
        item.register(waffleNugget);
        item.register(waffle);
        item.register(nougatPowder);
        item.register(dynamite);
        item.register(glueDynamite);
        item.register(chewingGum);
        item.register(marshmallowFlower);
        item.register(sugarPill);
        item.register(honeyEmblem);
        item.register(jellyEmblem);
        item.register(suguardEmblem);
        item.register(cranberryEmblem);
        item.register(gingerbreadEmblem);
        item.register(waterEmblem);
        item.register(chewingGumEmblem);
        item.register(skyEmblem);
        item.register(CD1);
        item.register(CD2);
        item.register(CD3);
        item.register(CD4);
        item.register(orangeKey);
        item.register(blueKey);
        item.register(whiteKey);
        item.register(purpleKey);
        item.register(jellySentryKey);
        item.register(jellyBossKey);
        item.register(suguardSentryKey);
        item.register(suguardBossKey);
        item.register(wiki);


        /* BLOCKS */
        item.registerBlockBasic(pudding);
        item.registerBlockBasic(flour);
        item.registerBlockBasic(marshmallowPlanks);
        item.registerBlockBasic(marshmallowPlanksDark);
        item.registerBlockBasic(marshmallowPlanksLight);
        item.registerBlockBasic(marshmallowLog);
        item.registerBlockBasic(marshmallowLogDark);
        item.registerBlockBasic(marshmallowLogLight);
        item.registerBlockBasic(candyLeave);
        item.registerBlockBasic(candyLeaveDark);
        item.registerBlockBasic(candyLeaveLight);
        item.registerBlockBasic(candyLeaveCherry);
        item.registerBlockBasic(candyLeaveEnchant);
        item.registerBlockBasic(candySapling);
        item.registerBlockBasic(candySaplingDark);
        item.registerBlockBasic(candySaplingLight);
        item.registerBlockBasic(candySaplingCherry);
        item.registerBlockBasic(candySoil);
        item.registerBlockBasic(tallCandyGrassPink);
        item.registerBlockBasic(tallCandyGrassPale);
        item.registerBlockBasic(tallCandyGrassYellow);
        item.registerBlockBasic(tallCandyGrassRed);
        item.registerBlockBasic(licoriceOre);
        item.registerBlockBasic(marshmallowFence);
        item.registerBlockBasic(marshmallowStairs);
        item.registerBlockBasic(marshmallowStairsDark);
        item.registerBlockBasic(marshmallowStairsLight);
        item.registerBlock(new ItemSlab(marshmallowSlab, marshmallowSlab, marshmallowDoubleSlab));
        item.registerBlock(new ItemSlab(marshmallowSlabDark, marshmallowSlabDark, marshmallowDoubleSlabDark));
        item.registerBlock(new ItemSlab(marshmallowSlabLight, marshmallowSlabLight, marshmallowDoubleSlabLight));
        item.registerBlockBasic(marshmallowTrapdoor);
        item.registerBlockBasic(licoriceBrick);
        item.registerBlockBasic(licoriceBrickStairs);
        item.registerBlock(new ItemSlab(licoriceSlab, licoriceSlab, licoriceDoubleSlab));
        item.registerBlockBasic(licoriceBlock);
        item.registerBlockBasic(candyCaneBlock);
        item.registerBlockBasic(candyCaneFence);
        item.registerBlockBasic(candyCaneWall);
        item.registerBlockBasic(candyCaneStairs);
        item.registerBlock(new ItemSlab(candyCaneSlab, candyCaneSlab, candyCaneDoubleSlab));
        item.registerBlockBasic(jellyOre);
        item.registerBlockBasic(trampojelly);
        item.registerBlockBasic(redTrampojelly);
        item.registerBlockBasic(yellowTrampojelly);
        item.registerBlockBasic(jellyShockAbsorber);
        item.registerBlockBasic(lollipopBlock);
        item.registerBlockBasic(caramelBlock);
        item.registerBlockBasic(caramelBrick);
        item.registerBlockBasic(caramelBrickStairs);
        item.registerBlock(new ItemSlab(caramelSlab, caramelSlab, caramelDoubleSlab));
        item.registerBlockBasic(sugarFactory);
        item.registerBlockBasic(advancedSugarFactory);
        item.registerBlockBasic(licoriceFurnace);
        item.registerBlockBasic(licoriceFurnaceOn);
        item.registerBlockBasic(candyPortal);
        item.registerBlockBasic(sugarBlock);
        item.registerBlockBasic(dragibusCrops);
        item.registerBlockBasic(lollipopPlant);
        item.registerBlockBasic(chocolateStone);
        item.registerBlockBasic(chocolateStairs);
        item.registerBlock(new ItemSlab(chocolateSlab, chocolateSlab, chocolateDoubleSlab));
        item.registerBlockBasic(chocolateCobbleStone);
        item.registerBlockBasic(chocolateCobbleStairs);
        item.registerBlock(new ItemSlab(chocolateCobbleSlab, chocolateCobbleSlab, chocolateCobbleDoubleSlab));
        item.registerBlockBasic(chocolateCobbleWall);
        item.registerBlockBasic(pinkSeaweed);
        item.registerBlockBasic(greenSeaweed);
        item.registerBlockBasic(bananaSeaweed);
        item.registerBlockBasic(marshmallowWorkbench);
        item.registerBlockBasic(marshmallowLadder);
        item.registerBlockBasic(CCBlocks.marshmallowDoor);
        item.registerBlockBasic(fraiseTagadaFlower);
        item.registerBlockBasic(poisonousFlower);
        item.registerBlockBasic(sugarEssenceFlower);
        item.registerBlockBasic(marshmallowChest);
        item.registerBlockBasic(honeyOre);
        item.registerBlockBasic(honeyTorch);
        item.registerBlockBasic(honeyBlock);
        item.registerBlockBasic(honeyLamp);
        item.registerBlockBasic(pezOre);
        item.registerBlockBasic(pezBlock);
        item.registerBlockBasic(grenadine);
        item.registerBlockBasic(purpleJellyJump);
        item.registerBlockBasic(cottonCandyBlock);
        item.registerBlockBasic(cottonCandyStairs);
        item.registerBlock(new ItemSlab(cottonCandySlab, cottonCandySlab, cottonCandyDoubleSlab));
        item.registerBlockBasic(cottonCandyBedBlock);
        item.registerBlockBasic(cottonCandyJukebox);
        item.registerBlockBasic(cranberrySpikes);
        item.registerBlockBasic(sugarSpikes);
        item.registerBlockBasic(mintBlock);
        item.registerBlockBasic(raspberryBlock);
        item.registerBlockBasic(bananaBlock);
        item.registerBlockBasic(grenadineBlock);
        item.registerBlockBasic(blockTeleporter);
        item.registerBlockBasic(marshmallowSlice);
        item.registerBlockBasic(marshmallowFlowerBlock);
        item.registerBlockBasic(caramelGlass0);
        item.registerBlockBasic(caramelGlass1);
        item.registerBlockBasic(caramelGlass2);
        item.registerBlockBasic(caramelPane0);
        item.registerBlockBasic(caramelPane1);
        item.registerBlockBasic(caramelPane2);
        item.registerBlockBasic(cottonCandyWeb);
        item.registerBlockBasic(cherryBlock);
        item.registerBlockBasic(nougatOre);
        item.registerBlockBasic(nougatBlock);
        item.registerBlockBasic(nougatHead);
        item.registerBlockBasic(chewingGumBlock);
        item.registerBlockBasic(chewingGumPuddle);
        item.registerBlockBasic(alchemyTable);
        item.registerBlockBasic(strawberryIceCream);
        item.registerBlockBasic(mintIceCream);
        item.registerBlockBasic(blueberryIceCream);
        item.registerBlockBasic(iceCream);
        item.registerBlockBasic(strawberryIceCreamStairs);
        item.registerBlockBasic(mintIceCreamStairs);
        item.registerBlockBasic(blueberryIceCreamStairs);
        item.registerBlockBasic(iceCreamStairs);
        item.registerBlock(new ItemSlab(strawberryIceCreamSlab, strawberryIceCreamSlab, strawberryIceCreamDoubleSlab));
        item.registerBlock(new ItemSlab(mintIceCreamSlab, mintIceCreamSlab, mintIceCreamDoubleSlab));
        item.registerBlock(new ItemSlab(blueberryIceCreamSlab, blueberryIceCreamSlab, blueberryIceCreamDoubleSlab));
        item.registerBlock(new ItemSlab(iceCreamSlab, iceCreamSlab, iceCreamDoubleSlab));
        item.registerBlockBasic(dragonEggBlock);
        item.registerBlockBasic(beetleEggBlock);
        item.registerBlockBasic(jellySentryKeyHole);
        item.registerBlockBasic(jellyBossKeyHole);
        item.registerBlockBasic(suguardSentryKeyHole);
        item.registerBlockBasic(suguardBossKeyHole);
        item.registerBlockBasic(jawBreakerBlock);
        item.registerBlockBasic(jawBreakerLight);
    }

    public static class ItemRegistryHelper {
        private final IForgeRegistry<Item> registry;

        private static List<ModelRegisterCallback> itemModels = new ArrayList<>();

        public static List<ModelRegisterCallback> getItemModels() {
            return ImmutableList.copyOf(itemModels);
        }

        ItemRegistryHelper(IForgeRegistry<Item> registry) {
            this.registry = registry;
        }

        private void register(Item item) {
            item.setRegistryName(CandyCraft.MODID, item.getTranslationKey());

            if (item instanceof ModelRegisterCallback) {
                itemModels.add((ModelRegisterCallback) item);
            }
            registry.register(item);
        }

        private void registerBlockBasic(Block block) {
            register(new ItemBlock(block));
        }

        private void registerBlock(ItemBlock block) {
            block.setRegistryName(block.getBlock().getRegistryName());
            block.setTranslationKey(block.getBlock().getTranslationKey());
            registry.register(block);
        }
    }
}
