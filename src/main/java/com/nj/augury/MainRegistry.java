package com.nj.augury;

import com.nj.augury.init.ModBlocks;
import com.nj.augury.init.ModItems;
import com.nj.augury.init.ModTileEntities;
import com.nj.augury.init.WorldGens;
import com.nj.augury.proxy.IProxy;
import com.nj.augury.references.Reference;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class MainRegistry
{   
	@Instance(Reference.MODID)
	public static MainRegistry instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event){
		ModBlocks.init();
		ModItems.init();
		ModTileEntities.init();
		WorldGens.init();
	
	}
	
    @EventHandler
    public void init(FMLInitializationEvent event){
    	
    }
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent event){
    	
    }
}
