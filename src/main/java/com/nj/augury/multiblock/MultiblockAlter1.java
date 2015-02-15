package com.nj.augury.multiblock;

import com.nj.augury.init.ModBlocks;
import com.nj.augury.init.ModTileEntities;
import com.nj.augury.utility.DimensionalPattern;
import com.nj.augury.utility.DimensionalPattern.BlockState;
import com.nj.augury.utility.DimensionalPattern.Layer;
import com.nj.augury.utility.DimensionalPattern.Row;
import com.nj.augury.utility.LogHelper;

public class MultiblockAlter1 extends ModTileEntities{
	
	DimensionalPattern dimensionalPattern;
	
	public MultiblockAlter1(){
		//Layer 1
		Row row1 = DimensionalPattern.createRow("3333333");
		Row row2 = DimensionalPattern.createRow("3555553");
		Row row3 = DimensionalPattern.createRow("3511153");
		Row row4 = DimensionalPattern.createRow("3514153");
		Row row5 = DimensionalPattern.createRow("3511153");
		Row row6 = DimensionalPattern.createRow("3555553");
		Row row7 = DimensionalPattern.createRow("3333333");
		//Layer 2
		Row row8 = DimensionalPattern.createRow("6*****6");
		Row row9 = DimensionalPattern.createRow("*55555*");
		Row row10 = DimensionalPattern.createRow("*51115*");
		Row row11 = DimensionalPattern.createRow("*51415*");
		Row row12 = DimensionalPattern.createRow("*51115*");
		Row row13 = DimensionalPattern.createRow("*55555*");
		Row row14 = DimensionalPattern.createRow("6*****6");
		//Layer 3
		Row row15 = DimensionalPattern.createRow("6*****6");
		Row row16 = DimensionalPattern.createRow("*******");
		Row row17 = DimensionalPattern.createRow("**111**");
		Row row18 = DimensionalPattern.createRow("**141**");
		Row row19 = DimensionalPattern.createRow("**111**");
		Row row20 = DimensionalPattern.createRow("*******");
		Row row21 = DimensionalPattern.createRow("6*****6");
		//Layer 4
		Row row22 = DimensionalPattern.createRow("6*****6");
		Row row23 = DimensionalPattern.createRow("*******");
		Row row24 = DimensionalPattern.createRow("*******");
		Row row25 = DimensionalPattern.createRow("***4***");
		Row row26 = DimensionalPattern.createRow("*******");
		Row row27 = DimensionalPattern.createRow("*******");
		Row row28 = DimensionalPattern.createRow("6*****6");
		//Layer 5
		Row row29 = DimensionalPattern.createRow("2*****2");
		Row row30 = DimensionalPattern.createRow("*******");
		Row row31 = DimensionalPattern.createRow("*******");
		Row row32 = DimensionalPattern.createRow("*******");
		Row row33 = DimensionalPattern.createRow("*******");
		Row row34 = DimensionalPattern.createRow("*******");
		Row row35 = DimensionalPattern.createRow("2*****2");
		//Layer 6
		Row row36 = DimensionalPattern.createRow("*******");
		Row row37 = DimensionalPattern.createRow("*******");
		Row row38 = DimensionalPattern.createRow("*******");
		Row row39 = DimensionalPattern.createRow("***7***");
		Row row40 = DimensionalPattern.createRow("*******");
		Row row41 = DimensionalPattern.createRow("*******");
		Row row42 = DimensionalPattern.createRow("*******");
		
		Layer layer1 = DimensionalPattern.createLayer(row1, row2, row3, row4, row5, row6, row7);
		Layer layer2 = DimensionalPattern.createLayer(row8, row9, row10, row11, row12, row13, row14);
		Layer layer3 = DimensionalPattern.createLayer(row15, row16, row17, row18, row19, row20, row21);
		Layer layer4 = DimensionalPattern.createLayer(row22, row23, row24, row25, row26, row27, row28);
		Layer layer5 = DimensionalPattern.createLayer(row29, row30, row31, row32, row33, row34, row35);
		Layer layer6 = DimensionalPattern.createLayer(row36, row37, row38, row39, row40, row41, row42);
		
		BlockState air = DimensionalPattern.createBlockState('1', ModBlocks.infusedAspectBlockAir);
		BlockState earth = DimensionalPattern.createBlockState('2', ModBlocks.infusedAspectBlockEarth);
		BlockState entropy = DimensionalPattern.createBlockState('3', ModBlocks.infusedAspectBlockEntropy);
		BlockState fire = DimensionalPattern.createBlockState('4', ModBlocks.infusedAspectBlockFire);
		BlockState order = DimensionalPattern.createBlockState('5', ModBlocks.infusedAspectBlockOrder);
		BlockState water = DimensionalPattern.createBlockState('6', ModBlocks.infusedAspectBlockWater);
		BlockState alterFormer = DimensionalPattern.createBlockState('7', ModBlocks.alterFormer);
		
		dimensionalPattern = DimensionalPattern.createPattern("altar1", layer1, layer2, layer3, layer4, layer5, layer6, air, earth, entropy, fire, order, water, alterFormer);
	}
	
	public void scanBelow(){
		if(dimensionalPattern.hasFormed(worldObj, xCoord -3, yCoord -5, zCoord -3)){
			LogHelper.info("A Multiblock has Formed");
		}
	}
}
