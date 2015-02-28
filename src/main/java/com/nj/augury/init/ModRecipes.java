package com.nj.augury.init;

import thaumcraft.api.crafting.InfusionRecipe;

import com.nj.augury.api.azanor.thaumcraft.api.ThaumcraftApi;
import com.nj.augury.api.cofh.thermalexpansion.ThermalExpansionHelper;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init(){
		//Tier 1
		ThermalExpansionHelper.addSmelterRecipe(5000, (new ItemStack(ModItems.aspectFire)), (new ItemStack(ModItems.aspectEntropy)), (new ItemStack(ModItems.aspectFrost)), null, 0);
		ThermalExpansionHelper.addSmelterRecipe(5000, (new ItemStack(ModItems.aspectAir)), (new ItemStack(ModItems.aspectFire)), (new ItemStack(ModItems.aspectLight)), null, 0);
		ThermalExpansionHelper.addSmelterRecipe(5000, (new ItemStack(ModItems.aspectAir)), (new ItemStack(ModItems.aspectOrder)), (new ItemStack(ModItems.aspectMotion)), null, 0);
		ThermalExpansionHelper.addSmelterRecipe(5000, (new ItemStack(ModItems.aspectOrder)), (new ItemStack(ModItems.aspectEntropy)), (new ItemStack(ModItems.aspectExchange)), null, 0);
		ThermalExpansionHelper.addSmelterRecipe(5000, (new ItemStack(ModItems.aspectFire)), (new ItemStack(ModItems.aspectOrder)), (new ItemStack(ModItems.aspectEnergy)), null, 0);
		ThermalExpansionHelper.addSmelterRecipe(5000, (new ItemStack(ModItems.aspectAir)), (new ItemStack(ModItems.aspectWater)), (new ItemStack(ModItems.aspectWeather)), null, 0);
		ThermalExpansionHelper.addSmelterRecipe(5000, (new ItemStack(ModItems.aspectAir)), (new ItemStack(ModItems.aspectEntropy)), (new ItemStack(ModItems.aspectVoid)), null, 0);
		ThermalExpansionHelper.addSmelterRecipe(5000, (new ItemStack(ModItems.aspectWater)), (new ItemStack(ModItems.aspectEntropy)), (new ItemStack(ModItems.aspectPoison)), null, 0);
		ThermalExpansionHelper.addSmelterRecipe(5000, (new ItemStack(ModItems.aspectWater)), (new ItemStack(ModItems.aspectEarth)), (new ItemStack(ModItems.aspectLife)), null, 0);
		ThermalExpansionHelper.addSmelterRecipe(5000, (new ItemStack(ModItems.aspectOrder)), (new ItemStack(ModItems.aspectEarth)), (new ItemStack(ModItems.aspectCrystal)), null, 0);
		//Tier 2
		
		//test
	}
}
