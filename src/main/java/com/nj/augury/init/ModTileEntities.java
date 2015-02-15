package com.nj.augury.init;

import com.nj.augury.multiblock.MultiblockAlter1;
import com.nj.augury.references.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.tileentity.TileEntity;

public class ModTileEntities extends TileEntity{
	public static void mainRegistry(){
		init();
	}
	
	public static void init(){
		GameRegistry.registerTileEntity(MultiblockAlter1.class, Reference.MODID);
	}
}
