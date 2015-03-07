package com.nj.augury.integration.thaumcraft.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.nj.augury.init.ModItems;
import com.nj.augury.references.Names;
import com.nj.augury.integration.thaumcraft.ThaumcraftItems;

import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.InfusionRecipe;

public class Recipes {
	public static void init(){
		initRecipes();
	}

	private static void initRecipes() {
		ThaumcraftApi.addInfusionCraftingRecipe(Names.Research.FIRE, (new ItemStack(ModItems.aspectFire)), 50, new AspectList().add(Aspect.FIRE, 6).add(Aspect.MAGIC, 1), (new ItemStack(Items.diamond)), new ItemStack[]{
			new ItemStack(ThaumcraftItems.ingotThaumium())
		});
	}
}
