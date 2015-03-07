package com.nj.augury.integration.thaumcraft;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ThaumcraftItems{
	public static final ItemStack ingotThaumium = thaumcraft.api.ItemApi.getItem("itemResource", 2);

	public static Item ingotThaumium() {
		final ItemStack ingotThaumium = thaumcraft.api.ItemApi.getItem("itemResource", 2);
		return null;
	}
}
