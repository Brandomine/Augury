package com.nj.augury.init;

import com.nj.augury.block.BlockTest;
import com.nj.augury.block.BlockWrapper;
import com.nj.augury.references.Names;
import com.nj.augury.references.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class ModBlocks {
	//public static final BlockWapper codeName = new ClassName();
	public static final BlockWrapper testBlock = new BlockTest();

    public static void init()
    {
        //GameRegistry.registerBlock(codeName, Names.Blocks.blockname);
    	GameRegistry.registerBlock(testBlock, Names.Blocks.TEST_BLOCK);
    }
}
