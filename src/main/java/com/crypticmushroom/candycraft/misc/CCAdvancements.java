package com.crypticmushroom.candycraft.misc;

import com.crypticmushroom.candycraft.blocks.CCBlocks;
import com.crypticmushroom.candycraft.items.CCItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;

public class CCAdvancements {
    public static AchievementPage achievementPage;
    public static Advancement craftSugarBlock;
    public static Advancement enterCandyWorld;
    public static Advancement gettingCandyCaneSugar;
    public static Advancement gettingLicorice;
    public static Advancement dogTaming;
    public static Advancement caramelAch;
    public static Advancement candyCaneFence;
    public static Advancement forkWork;
    public static Advancement dragibusFarm;
    public static Advancement licoriceFurnace;
    public static Advancement craftJelly;
    public static Advancement craftJellyShock;
    public static Advancement craftLicoriceSword;
    public static Advancement killCookieCreeper;
    public static Advancement killsuguard;
    public static Advancement killjelly_queen;
    public static Advancement craftCandyStick;
    public static Advancement lollipopFarm;
    public static Advancement lollipopHeal;
    public static Advancement lollipopCreep;
    public static Advancement craftStick;
    public static Advancement craftSugarFactory;
    public static Advancement craftHoneyComb;
    public static Advancement craftHoneyCombSword;
    public static Advancement killsuguardBoss;
    public static Advancement eatBlock;
    public static Advancement craftCoins;
    public static Advancement openWiki;
    private static ArrayList<Advancement> achievementList = new ArrayList<>();

    public static void init() {
        craftSugarBlock = setAchievement("craftSugarBlock", 0, 0, new ItemStack(CCBlocks.sugarBlock), null, false);
        enterCandyWorld = setAchievement("enterCandyWorld", 2, 0, new ItemStack(CCBlocks.candyPortal), craftSugarBlock, true);
        gettingCandyCaneSugar = setAchievement("gettingCandyCane", 2, -2, new ItemStack(CCItems.candyCane), enterCandyWorld, false);
        gettingLicorice = setAchievement("gettingLicorice", 2, 2, new ItemStack(CCBlocks.licoriceOre), enterCandyWorld, false);
        dogTaming = setAchievement("dogTaming", 2, -4, new ItemStack(Items.BONE), gettingCandyCaneSugar, false);
        caramelAch = setAchievement("getCaramel", 2, -6, new ItemStack(CCItems.caramelBucket), dogTaming, false);
        candyCaneFence = setAchievement("craftCandyCaneFence", 4, -2, new ItemStack(CCBlocks.candyCaneFence), gettingCandyCaneSugar, false);
        forkWork = setAchievement("craftFork", 4, 0, new ItemStack(CCItems.fork), enterCandyWorld, false);
        dragibusFarm = setAchievement("dragibusFarm", 4, 2, new ItemStack(CCItems.dragibus), forkWork, false);
        licoriceFurnace = setAchievement("licoriceFurnaceCraft", 0, 2, new ItemStack(CCBlocks.sugarFurnaceOn, 1), gettingLicorice, false);
        craftJelly = setAchievement("craftJelly", 0, 4, new ItemStack(CCBlocks.trampojelly), licoriceFurnace, false);
        craftJellyShock = setAchievement("craftJellyShockAbsorber", 0, 6, new ItemStack(CCBlocks.jellyShockAbsorber), craftJelly, true);
        craftLicoriceSword = setAchievement("craftLicoriceSword", 2, 4, new ItemStack(CCItems.licoriceSword), gettingLicorice, false);
        killCookieCreeper = setAchievement("killCookieCreeper", 2, 6, new ItemStack(Items.COOKIE), craftLicoriceSword, false);
        killsuguard = setAchievement("killsuguard", 2, 8, new ItemStack(CCItems.licoriceSpear), killCookieCreeper, false);
        killjelly_queen = setAchievement("killjelly_queen", 4, 4, new ItemStack(CCItems.orangeKey), craftLicoriceSword, true);
        craftCandyStick = setAchievement("craftCandyStick", -2, 0, new ItemStack(CCItems.marshmallowStick), enterCandyWorld, false);
        lollipopFarm = setAchievement("lollipopFarm", 6, 2, new ItemStack(CCItems.lollipopSeeds), dragibusFarm, false);
        lollipopHeal = setAchievement("lollipopHeal", 8, 2, new ItemStack(CCItems.lollipop), lollipopFarm, false);
        lollipopCreep = setAchievement("lollipopCreep", 6, 4, new ItemStack(CCItems.lollipop), lollipopFarm, false);
        craftStick = setAchievement("craftStick", -2, -2, new ItemStack(Items.STICK), craftCandyStick, false);
        craftSugarFactory = setAchievement("craftSugarFactory", -2, -4, new ItemStack(CCBlocks.sugarFactory), craftStick, true);
        craftHoneyComb = setAchievement("craftHoneyComb", -2, -6, new ItemStack(CCItems.honeycomb), craftSugarFactory, false);
        craftHoneyCombSword = setAchievement("craftHoneyCombSword", 0, -6, new ItemStack(CCItems.honeySword), craftHoneyComb, false);
        killsuguardBoss = setAchievement("killsuguardBoss", 0, -4, new ItemStack(CCItems.blueKey), craftHoneyCombSword, true);
        eatBlock = setAchievement("eatBlock", 6, 0, new ItemStack(CCBlocks.pudding), forkWork, true);
        craftCoins = setAchievement("craftChocolateCoins", -4, -4, new ItemStack(CCItems.chocolateCoin), craftSugarFactory, false);
        openWiki = setAchievement("openWiki", 0, -2, new ItemStack(CCItems.wiki), null, true);

        Advancement[] array = new Advancement[achievementList.size()];
        achievementList.toArray(array);
        achievementPage = new AchievementPage("\247k||\247r \247cC\247fa\247cn\247fd\247cy\247fC\247cr\247fa\247cf\247ft \247k||\247r", array);
        AchievementPage.registerAchievementPage(achievementPage);
    }

    private static Advancement setAchievement(String balise, int x, int y, ItemStack item, Advancement req, boolean special) {
        Advancement ach = new Advancement("candycraftmod:" + balise, balise, x, y, item, req);
        if (special) {
            ach.setSpecial();
        }
        achievementList.add(ach);
        return ach.registerStat();
    }

    public static void onCraft(ItemStack stack, EntityPlayer player) {
        Item item = stack.getItem();

        if (item == Item.getItemFromBlock(CCBlocks.sugarBlock)) {
            player.addStat(CCAdvancements.craftSugarBlock);
        } else if (item == Item.getItemFromBlock(CCBlocks.candyCaneFence)) {
            player.addStat(CCAdvancements.candyCaneFence);
        } else if (item == CCItems.fork) {
            player.addStat(CCAdvancements.forkWork);
        } else if (item == Item.getItemFromBlock(CCBlocks.sugarFurnace)) {
            player.addStat(CCAdvancements.licoriceFurnace);
        } else if (item == CCItems.licoriceSword) {
            player.addStat(CCAdvancements.craftLicoriceSword);
        } else if (item == CCItems.marshmallowStick) {
            player.addStat(CCAdvancements.craftCandyStick);
        } else if (item == Items.STICK && stack.getCount() == 1) {
            player.addStat(CCAdvancements.craftStick);
        } else if (item == Item.getItemFromBlock(CCBlocks.sugarFactory)) {
            player.addStat(CCAdvancements.craftSugarFactory);
        } else if (item == CCItems.honeySword) {
            player.addStat(CCAdvancements.craftHoneyCombSword);
        }
    }

    public static void onSmelt(ItemStack stack, EntityPlayer player) {
        Item item = stack.getItem();
        if (item == CCItems.licorice) {
            player.addStat(CCAdvancements.gettingLicorice);
        }
        if (item == Item.getItemFromBlock(CCBlocks.trampojelly)) {
            player.addStat(CCAdvancements.craftJelly);
        }
        if (item == Item.getItemFromBlock(CCBlocks.jellyShockAbsorber)) {
            player.addStat(CCAdvancements.craftJellyShock);
        }
    }

    public static void onPickup(EntityItem entityItem, EntityPlayer player) {
        ItemStack itemStack = entityItem.getItem();
        Item item = itemStack.getItem();

        if (item == CCItems.candyCane) {
            player.addStat(CCAdvancements.gettingCandyCaneSugar);
        }
    }
}
