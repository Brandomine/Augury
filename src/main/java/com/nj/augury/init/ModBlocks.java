package com.nj.augury.init;

import com.nj.augury.block.BlockAlterFormer;
import com.nj.augury.block.BlockInfusedAspectBlockAir;
import com.nj.augury.block.BlockInfusedAspectBlockEarth;
import com.nj.augury.block.BlockInfusedAspectBlockEntropy;
import com.nj.augury.block.BlockInfusedAspectBlockFire;
import com.nj.augury.block.BlockInfusedAspectBlockOrder;
import com.nj.augury.block.BlockInfusedAspectBlockWater;
import com.nj.augury.block.BlockWrapper;
import com.nj.augury.block.OreAspectFire;
import com.nj.augury.references.Names;
import com.nj.augury.references.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class ModBlocks {
	//public static final BlockWapper codeName = new ClassName();
	public static final BlockWrapper infusedAspectBlockAir = new BlockInfusedAspectBlockAir();
	public static final BlockWrapper infusedAspectBlockEarth = new BlockInfusedAspectBlockEarth();
	public static final BlockWrapper infusedAspectBlockEntropy = new BlockInfusedAspectBlockEntropy();
	public static final BlockWrapper infusedAspectBlockFire = new BlockInfusedAspectBlockFire();
	public static final BlockWrapper infusedAspectBlockOrder = new BlockInfusedAspectBlockOrder();
	public static final BlockWrapper infusedAspectBlockWater = new BlockInfusedAspectBlockWater();
	public static final BlockWrapper alterFormer = new BlockAlterFormer();
	public static final BlockWrapper oreAspectFire = new OreAspectFire();

    public static void init()
    {
        //GameRegistry.registerBlock(codeName, Names.Blocks.blockname);
    	GameRegistry.registerBlock(infusedAspectBlockAir, Names.Blocks.INFUSED_ASPECT_BLOCK_AIR);
    	GameRegistry.registerBlock(infusedAspectBlockEarth, Names.Blocks.INFUSED_ASPECT_BLOCK_EARTH);
    	GameRegistry.registerBlock(infusedAspectBlockEntropy, Names.Blocks.INFUSED_ASPECT_BLOCK_ENTROPY);
    	GameRegistry.registerBlock(infusedAspectBlockFire, Names.Blocks.INFUSED_ASPECT_BLOCK_FIRE);
    	GameRegistry.registerBlock(infusedAspectBlockOrder, Names.Blocks.INFUSED_ASPECT_BLOCK_ORDER);
    	GameRegistry.registerBlock(infusedAspectBlockWater, Names.Blocks.INFUSED_ASPECT_BLOCK_WATER);
    	GameRegistry.registerBlock(alterFormer, Names.Blocks.ALTERFORMER);
    	GameRegistry.registerBlock(oreAspectFire, Names.Blocks.ORE_ASPECT_FIRE);
    }
}
