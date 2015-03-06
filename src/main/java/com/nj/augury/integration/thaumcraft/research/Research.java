package com.nj.augury.integration.thaumcraft.research;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Chat;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent.Tick;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.ThaumcraftApiHelper;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;

import com.nj.augury.api.cofh.thermalexpansion.ThermalExpansionHelper;
import com.nj.augury.init.ModItems;
import com.nj.augury.references.Reference;
import com.nj.augury.utility.LogHelper;

import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;

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
		new ResearchItem("Aspects", Reference.THAUMIC_TAB, new AspectList().add(Aspect.FIRE, 50).add(Aspect.AIR, 50).add(Aspect.ENTROPY, 50).add(Aspect.WATER, 50).add(Aspect.ORDER, 50).add(Aspect.EARTH, 50), 0, 2, 0, (new ResourceLocation(Reference.MODID, "textures/items/aspectFire.png"))).registerResearchItem().setPages(new ResearchPage[] {new ResearchPage("tc.research_page.Aspects")}).setStub().registerResearchItem().setConcealed().setSecondary().setParents("Introduction");
		new ResearchItem("Fire", Reference.THAUMIC_TAB, new AspectList().add(Aspect.FIRE, 25), 0, 4, 0, new ResourceLocation(Reference.MODNAME, "textures/items/aspectFire.png")).registerResearchItem().setStub().setSecondary().setParents("Aspects").setConcealed().setPages(new ResearchPage[] {new InfusionRecipe(ThaumcraftApi.getInfusionRecipe(null))});
		new ResearchItem("Water", Reference.THAUMIC_TAB, new AspectList().add(Aspect.WATER, 25), 0, 4, 0, new ResourceLocation(Reference.MODNAME, "textures/items/aspectWater.png")).registerResearchItem().setStub().setSecondary().setParents("Aspects").setConcealed().setPages(new ResearchPage[] {new ResearchPage("tc.research_page.Water")});
		new ResearchItem("Entropy", Reference.THAUMIC_TAB, new AspectList().add(Aspect.ENTROPY, 25), 0, 4, 0, new ResourceLocation(Reference.MODNAME, "textures/items/aspectEntropy.png")).registerResearchItem().setStub().setSecondary().setParents("Aspects").setConcealed().setPages(new ResearchPage[] {new ResearchPage("tc.research_page.Entropy")});
		new ResearchItem("Air", Reference.THAUMIC_TAB, new AspectList().add(Aspect.AIR, 25), 0, 4, 0, new ResourceLocation(Reference.MODNAME, "textures/items/aspectAir.png")).registerResearchItem().setStub().setSecondary().setParents("Aspects").setConcealed().setPages(new ResearchPage[] {new ResearchPage("tc.research_page.TEST")});
		new ResearchItem("Order", Reference.THAUMIC_TAB, new AspectList().add(Aspect.ORDER, 25), 0, 4, 0, new ResourceLocation(Reference.MODNAME, "textures/items/aspectOrder.png")).registerResearchItem().setStub().setSecondary().setParents("Aspects").setConcealed().setPages(new ResearchPage[] {new ResearchPage("tc.research_page.TEST")});
		new ResearchItem("Earth", Reference.THAUMIC_TAB, new AspectList().add(Aspect.EARTH, 25), 0, 4, 0, new ResourceLocation(Reference.MODNAME, "textures/items/aspectEarth.png")).registerResearchItem().setStub().setSecondary().setParents("Aspects").setConcealed().setPages(new ResearchPage[] {new ResearchPage("tc.research_page.TEST")});
		}
}

