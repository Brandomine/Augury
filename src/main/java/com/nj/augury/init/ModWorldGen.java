package com.nj.augury.init;

import com.nj.augury.world.WorldGeneratorFire;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModWorldGen {
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
	}
	
	public static void init(){
	
		registerWorldGen(new WorldGeneratorFire(), 1);
		
	}
	
	

}
