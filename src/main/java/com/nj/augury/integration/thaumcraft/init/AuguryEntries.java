package com.nj.augury.integration.thaumcraft.init;

import net.minecraft.item.ItemStack;

import com.nj.augury.init.ModItems;
import com.nj.augury.integration.thaumcraft.helpers.ResearchHelper;
import com.nj.augury.references.Reference;

import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;

public class AuguryEntries {
	public static void init(){
		ResearchItem research;
		String[] text;
		AspectList aspect;
		aspect = new AspectList();
		
		aspect.add(Aspect.ENTROPY, 15);
		aspect.add(Aspect.ELDRITCH, 5);
		aspect.add(Aspect.MAGIC, 5);
		aspect.add(Aspect.MOTION, 15);
		
		text = new String[]{"1"};
		research = new ResearchHelper(aspect, AuguryEntries.Augury, aspect, 1, 2, 2, new ItemStack(ModItems.aspectFrost)).setParents(Reference.MODID).setSecondary().registerResearchItem();
		research.setPages(new ResearchPage(text[0]), new ResearchPage());
		aspect = new AspectList();
	}
}
