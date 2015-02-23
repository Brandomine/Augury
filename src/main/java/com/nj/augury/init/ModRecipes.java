package com.nj.augury.init;

import com.nj.augury.api.ThermalExpansionHelper;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init(){
		ThermalExpansionHelper.addSmelterRecipe(1000, (new ItemStack(ModItems.aspectFire)), (new ItemStack(ModItems.aspectEntropy)), (new ItemStack(ModItems.aspectFrost)), null, 0);;
	}
}
