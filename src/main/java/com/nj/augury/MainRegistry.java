package com.nj.augury;

import com.nj.augury.init.ModApiHelper;
import com.nj.augury.init.ModBlocks;
import com.nj.augury.init.ModItems;
import com.nj.augury.init.ModRecipes;
import com.nj.augury.init.ModWorldGen;
import com.nj.augury.integration.thaumcraft.recipes.Recipes;
import com.nj.augury.integration.thaumcraft.research.Research;
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
		ModWorldGen.init();
		ModApiHelper.init();
	}
	
    @EventHandler
    public void init(FMLInitializationEvent event){
    	ModRecipes.init();
    	Recipes.init();
    }
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent event){
    	Research.init();
    }
}
