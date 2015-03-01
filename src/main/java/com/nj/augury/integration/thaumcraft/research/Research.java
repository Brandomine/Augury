package com.nj.augury.integration.thaumcraft.research;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;

import com.nj.augury.init.ModItems;
import com.nj.augury.references.Reference;

public class Research {
	
	public static ItemStack wand = null;
	
	public static void init(){
		initCategories();
		initResearch();
	}
	
	public static void initCategories(){
		ResearchCategories.registerCategory(Reference.THAUMIC_TAB, new ResourceLocation(Reference.MODID, "textures/items/aspectEarth.png"), new ResourceLocation("thaumcraft", "textures/gui/gui_researchback.png"));
	}
	
	public static void initResearch(){
		
		new ResearchItem("Introduction", Reference.THAUMIC_TAB, new AspectList(), 0, 0, 0, (new ResourceLocation(Reference.MODID, "textures/items/aspectEarth.png"))).setAutoUnlock().registerResearchItem().setPages(new ResearchPage[] {new ResearchPage("tc.research_page.TEST")}).setAutoUnlock().setStub().setRound().registerResearchItem();
		new ResearchItem("Fire", Reference.THAUMIC_TAB, new AspectList().add(Aspect.FIRE, 50), 0, 2, 0, (new ResourceLocation(Reference.MODID, "textures/items/aspectFire.png"))).registerResearchItem().setPages(new ResearchPage[] {new ResearchPage("tc.research_page.Frost")}).setStub().registerResearchItem().setConcealed().setSecondary().setParents("Introduction");
		new ResearchItem("Earth", Reference.THAUMIC_TAB, new AspectList(), 2, 2, 0, (new ResourceLocation(Reference.MODID, "textures/items/aspectEarth.png"))).registerResearchItem().setPages(new ResearchPage[] {new ResearchPage("tc.research_page.Frost")}).setStub().registerResearchItem().setConcealed().setSecondary().setParents("Introduction");
		new ResearchItem("Water", Reference.THAUMIC_TAB, new AspectList(), -2, 2, 0, (new ResourceLocation(Reference.MODID, "textures/items/aspectWater.png"))).registerResearchItem().setPages(new ResearchPage[] {new ResearchPage("tc.research_page.Frost")}).setStub().registerResearchItem().setConcealed().setSecondary().setParents("Introduction");
		new ResearchItem("Air", Reference.THAUMIC_TAB, new AspectList(), 4, 2, 0, (new ResourceLocation(Reference.MODID, "textures/items/aspectAir.png"))).registerResearchItem().setPages(new ResearchPage[] {new ResearchPage("tc.research_page.Frost")}).setStub().registerResearchItem().setConcealed().setSecondary().setParents("Introduction");
		new ResearchItem("Order", Reference.THAUMIC_TAB, new AspectList(), -4, 2, 0, (new ResourceLocation(Reference.MODID, "textures/items/aspectOrder.png"))).registerResearchItem().setPages(new ResearchPage[] {new ResearchPage("tc.research_page.Frost")}).setStub().registerResearchItem().setConcealed().setSecondary().setParents("Introduction");
		new ResearchItem("Entropy", Reference.THAUMIC_TAB, new AspectList(), 6, 2, 0, (new ResourceLocation(Reference.MODID, "textures/items/aspectEntropy.png"))).registerResearchItem().setPages(new ResearchPage[] {new ResearchPage("tc.research_page.Frost")}).setStub().registerResearchItem().setConcealed().setSecondary().setParents("Introduction");
		

	}
}
