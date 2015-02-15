package com.nj.augury.init;

import com.nj.augury.item.ItemAspectAir;
import com.nj.augury.item.ItemAspectEarth;
import com.nj.augury.item.ItemAspectEntropy;
import com.nj.augury.item.ItemAspectFire;
import com.nj.augury.item.ItemAspectOrder;
import com.nj.augury.item.ItemAspectWater;
import com.nj.augury.item.ItemWrapper;
import com.nj.augury.references.Names;
import com.nj.augury.references.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class ModItems {
	//public static final ItemWrapper codeName = new className();
	//Base Aspects
	public static final ItemWrapper aspectAir = new ItemAspectAir();
	public static final ItemWrapper aspectFire = new ItemAspectFire();
	public static final ItemWrapper aspectEntropy = new ItemAspectEntropy();
	public static final ItemWrapper aspectWater = new ItemAspectWater();
	public static final ItemWrapper aspectOrder = new ItemAspectOrder();
	public static final ItemWrapper aspectEarth = new ItemAspectEarth();

    public static void init()
    {
        //GameRegistry.registerItem(codeName, Names.Items.ItemName);
    	//Base Aspects
    	GameRegistry.registerItem(aspectAir, Names.Items.ASPECT_AIR);
    	GameRegistry.registerItem(aspectFire, Names.Items.ASPECT_FIRE);
    	GameRegistry.registerItem(aspectEntropy, Names.Items.ASPECT_ENTROPY);
    	GameRegistry.registerItem(aspectWater, Names.Items.ASPECT_WATER);
    	GameRegistry.registerItem(aspectOrder, Names.Items.ASPECT_ORDER);
    	GameRegistry.registerItem(aspectEarth, Names.Items.ASPECT_EARTH);
    }
}
