package com.crypticmushroom.candycraft.misc;

import com.crypticmushroom.candycraft.CandyCraft;
import com.crypticmushroom.candycraft.blocks.CCBlocks;
import com.crypticmushroom.candycraft.blocks.tileentity.AlchemyRecipes;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static net.minecraftforge.oredict.OreDictionary.*;

@Mod.EventBusSubscriber(modid = CandyCraft.MODID)
public class CCRecipes {

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        new AlchemyRecipes();

        registerOre("planksMarshmallow", new ItemStack(CCBlocks.marshmallowPlanks, 1));
        registerOre("planksMarshmallow", new ItemStack(CCBlocks.marshmallowPlanksDark, 1));
        registerOre("planksMarshmallow", new ItemStack(CCBlocks.marshmallowPlanksLight, 1));
    }
}
