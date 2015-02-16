package com.nj.augury.world;

import java.util.Random;

import com.nj.augury.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;


import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorFire implements IWorldGenerator{

	public void generate(Random random, int chunkX, int chunkZ, World world,IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16); 
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
			break;
		default:
			;
		}
	}

		
	private void addOre(Block block, Block blockSpawn, Random random, World world, int randPosX, int randPosZ, int minY, int maxY, int minVeinSize, int maxVeinSize, int spawnChance){
		
		for(int i = 0; i < spawnChance; i++){
			int defaultChunkSize = 16;
			
			int xPos = randPosX + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY - minY);
			int zPos = randPosZ + random.nextInt(defaultChunkSize);
			
			new WorldGenMinable(block, (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn).generate(world, random, xPos, yPos, zPos);
			
			
				
		}
		
	}
	

	private void generateEnd(World world, Random random, int chunkX, int chunkZ) {
		
		
	}
	



	
	private void generateSurface(World world, Random random, int chunkX ,int chunkZ) {
		addOre(ModBlocks.oreAspectFire, Blocks.lava, random, world, chunkX, chunkZ, 0, 64, 10, 20, 25);
		
		}
		
	

	private void generateNether(World world, Random random, int chunkX,int chunkZ) {
	}

}
