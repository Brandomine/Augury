package com.nj.augury.init;

import com.nj.augury.item.ItemAspectAir;
import com.nj.augury.item.ItemAspectAlien;
import com.nj.augury.item.ItemAspectArmor;
import com.nj.augury.item.ItemAspectAura;
import com.nj.augury.item.ItemAspectBeast;
import com.nj.augury.item.ItemAspectCloth;
import com.nj.augury.item.ItemAspectCraft;
import com.nj.augury.item.ItemAspectCrop;
import com.nj.augury.item.ItemAspectCrystal;
import com.nj.augury.item.ItemAspectDarkness;
import com.nj.augury.item.ItemAspectDeath;
import com.nj.augury.item.ItemAspectEarth;
import com.nj.augury.item.ItemAspectEnergy;
import com.nj.augury.item.ItemAspectEntropy;
import com.nj.augury.item.ItemAspectExchange;
import com.nj.augury.item.ItemAspectFire;
import com.nj.augury.item.ItemAspectFlesh;
import com.nj.augury.item.ItemAspectFlight;
import com.nj.augury.item.ItemAspectFrost;
import com.nj.augury.item.ItemAspectGreed;
import com.nj.augury.item.ItemAspectHarvest;
import com.nj.augury.item.ItemAspectHeal;
import com.nj.augury.item.ItemAspectHunger;
import com.nj.augury.item.ItemAspectJourney;
import com.nj.augury.item.ItemAspectLife;
import com.nj.augury.item.ItemAspectLight;
import com.nj.augury.item.ItemAspectMachine;
import com.nj.augury.item.ItemAspectMagic;
import com.nj.augury.item.ItemAspectMan;
import com.nj.augury.item.ItemAspectMetal;
import com.nj.augury.item.ItemAspectMind;
import com.nj.augury.item.ItemAspectMine;
import com.nj.augury.item.ItemAspectMotion;
import com.nj.augury.item.ItemAspectOrder;
import com.nj.augury.item.ItemAspectPlant;
import com.nj.augury.item.ItemAspectPoison;
import com.nj.augury.item.ItemAspectSenses;
import com.nj.augury.item.ItemAspectSlime;
import com.nj.augury.item.ItemAspectSoul;
import com.nj.augury.item.ItemAspectTaint;
import com.nj.augury.item.ItemAspectTool;
import com.nj.augury.item.ItemAspectTrap;
import com.nj.augury.item.ItemAspectTree;
import com.nj.augury.item.ItemAspectUndead;
import com.nj.augury.item.ItemAspectVoid;
import com.nj.augury.item.ItemAspectWater;
import com.nj.augury.item.ItemAspectWeapon;
import com.nj.augury.item.ItemAspectWeather;
import com.nj.augury.item.ItemBookAugury;
import com.nj.augury.item.ItemWrapper;
import com.nj.augury.references.Names;
import com.nj.augury.references.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class ModItems {
	//public static final ItemWrapper codeName = new className();
	//Base Aspects
	public static final ItemWrapper aspectAir = new ItemAspectAir();
	public static final ItemWrapper aspectFire = new ItemAspectFire();
	public static final ItemWrapper aspectEntropy = new ItemAspectEntropy();
	public static final ItemWrapper aspectWater = new ItemAspectWater();
	public static final ItemWrapper aspectOrder = new ItemAspectOrder();
	public static final ItemWrapper aspectEarth = new ItemAspectEarth();
	//Tier 1
	public static final ItemWrapper aspectFrost = new ItemAspectFrost();
	public static final ItemWrapper aspectLight = new ItemAspectLight();
	public static final ItemWrapper aspectMotion = new ItemAspectMotion();
	public static final ItemWrapper aspectExchange = new ItemAspectExchange();
	public static final ItemWrapper aspectEnergy = new ItemAspectEnergy();
	public static final ItemWrapper aspectWeather = new ItemAspectWeather();
	public static final ItemWrapper aspectVoid = new ItemAspectVoid();
	public static final ItemWrapper aspectPoison = new ItemAspectPoison();
	public static final ItemWrapper aspectLife = new ItemAspectLife();
	public static final ItemWrapper aspectCrystal = new ItemAspectCrystal();
	//Tier 2
	public static final ItemWrapper aspectBeast = new ItemAspectBeast();
	public static final ItemWrapper aspectHunger = new ItemAspectHunger();
	public static final ItemWrapper aspectPlant = new ItemAspectPlant();
	public static final ItemWrapper aspectJourney = new ItemAspectJourney();
	public static final ItemWrapper aspectSlime = new ItemAspectSlime();
	public static final ItemWrapper aspectMetal = new ItemAspectMetal();
	public static final ItemWrapper aspectDeath = new ItemAspectDeath();
	public static final ItemWrapper aspectMagic = new ItemAspectMagic();
	public static final ItemWrapper aspectHeal = new ItemAspectHeal();
	public static final ItemWrapper aspectDarkness = new ItemAspectDarkness();
	public static final ItemWrapper aspectTrap = new ItemAspectTrap();
	public static final ItemWrapper aspectFlight = new ItemAspectFlight();
	//Tier 3
	public static final ItemWrapper aspectAlien = new ItemAspectAlien();
	public static final ItemWrapper aspectTree = new ItemAspectTree();
	public static final ItemWrapper aspectAura = new ItemAspectAura();
	public static final ItemWrapper aspectFlesh = new ItemAspectFlesh();
	public static final ItemWrapper aspectUndead = new ItemAspectUndead();
	public static final ItemWrapper aspectSoul = new ItemAspectSoul();
	public static final ItemWrapper aspectTaint = new ItemAspectTaint();
	//Tier 4
	public static final ItemWrapper aspectMind = new ItemAspectMind();
	public static final ItemWrapper aspectSenses = new ItemAspectSenses();
	//Tier 5
	public static final ItemWrapper aspectMan = new ItemAspectMan();
	//Tier 6
	public static final ItemWrapper aspectTool = new ItemAspectTool();
	public static final ItemWrapper aspectGreed = new ItemAspectGreed();
	public static final ItemWrapper aspectCrop = new ItemAspectCrop();
	public static final ItemWrapper aspectMine = new ItemAspectMine();
	//Tier 7
	public static final ItemWrapper aspectCraft = new ItemAspectCraft();
	public static final ItemWrapper aspectMachine = new ItemAspectMachine();
	public static final ItemWrapper aspectHarvest = new ItemAspectHarvest();
	public static final ItemWrapper aspectCloth = new ItemAspectCloth();
	public static final ItemWrapper aspectWeapon = new ItemAspectWeapon();
	public static final ItemWrapper aspectArmor = new ItemAspectArmor();
	//Items
	public static final ItemWrapper bookAugury = new ItemBookAugury();

    public static void init()
    {
        //GameRegistry.registerItem(codeName, Names.Items.ItemName);
    	//Base Aspects
    	GameRegistry.registerItem(aspectAir, Names.Items.ASPECT_AIR);
    	GameRegistry.registerItem(aspectFire, Names.Items.ASPECT_FIRE);
    	GameRegistry.registerItem(aspectEntropy, Names.Items.ASPECT_ENTROPY);
    	GameRegistry.registerItem(aspectWater, Names.Items.ASPECT_WATER);
    	GameRegistry.registerItem(aspectOrder, Names.Items.ASPECT_ORDER);
    	GameRegistry.registerItem(aspectEarth, Names.Items.ASPECT_EARTH);
    	//Tier 1
    	GameRegistry.registerItem(aspectFrost, Names.Items.ASPECT_FROST);
    	GameRegistry.registerItem(aspectLight, Names.Items.ASPECT_LIGHT);
    	GameRegistry.registerItem(aspectMotion, Names.Items.ASPECT_MOTION);
    	GameRegistry.registerItem(aspectExchange, Names.Items.ASPECT_EXCHANGE);
    	GameRegistry.registerItem(aspectEnergy, Names.Items.ASPECT_ENERGY);
    	GameRegistry.registerItem(aspectWeather, Names.Items.ASPECT_WEATHER);
    	GameRegistry.registerItem(aspectVoid, Names.Items.ASPECT_VOID);
    	GameRegistry.registerItem(aspectPoison, Names.Items.ASPECT_POISON);
    	GameRegistry.registerItem(aspectLife, Names.Items.ASPECT_LIFE);
    	GameRegistry.registerItem(aspectCrystal, Names.Items.ASPECT_CRYSTAL);
    	//Tier 2
    	GameRegistry.registerItem(aspectBeast, Names.Items.ASPECT_BEAST);
    	GameRegistry.registerItem(aspectHunger, Names.Items.ASPECT_HUNGER);
    	GameRegistry.registerItem(aspectPlant, Names.Items.ASPECT_PLANT);
    	GameRegistry.registerItem(aspectJourney, Names.Items.ASPECT_JOURNEY);
    	GameRegistry.registerItem(aspectSlime, Names.Items.ASPECT_SLIME);
    	GameRegistry.registerItem(aspectMetal, Names.Items.ASPECT_METAL);
    	GameRegistry.registerItem(aspectDeath, Names.Items.ASPECT_DEATH);
    	GameRegistry.registerItem(aspectMagic, Names.Items.ASPECT_MAGIC);
    	GameRegistry.registerItem(aspectHeal, Names.Items.ASPECT_HEAL);
    	GameRegistry.registerItem(aspectDarkness, Names.Items.ASPECT_DARKNESS);
    	GameRegistry.registerItem(aspectTrap, Names.Items.ASPECT_TRAP);
    	GameRegistry.registerItem(aspectFlight, Names.Items.ASPECT_FLIGHT);
    	//Tier 3
    	GameRegistry.registerItem(aspectAlien, Names.Items.ASPECT_ALIEN);
    	GameRegistry.registerItem(aspectTree, Names.Items.ASPECT_TREE);
    	GameRegistry.registerItem(aspectAura, Names.Items.ASPECT_AURA);
    	GameRegistry.registerItem(aspectFlesh, Names.Items.ASPECT_FLESH);
    	GameRegistry.registerItem(aspectUndead, Names.Items.ASPECT_UNDEAD);
    	GameRegistry.registerItem(aspectSoul, Names.Items.ASPECT_SOUL);
    	GameRegistry.registerItem(aspectTaint, Names.Items.ASPECT_TAINT);
    	//Tier 4
    	GameRegistry.registerItem(aspectMind, Names.Items.ASPECT_MIND);
    	GameRegistry.registerItem(aspectSenses, Names.Items.ASPECT_SENSES);
    	//Tier 5
    	GameRegistry.registerItem(aspectMan, Names.Items.ASPECT_MAN);
    	//Tier 6
    	GameRegistry.registerItem(aspectTool, Names.Items.ASPECT_TOOL);
    	GameRegistry.registerItem(aspectGreed, Names.Items.ASPECT_GREED);
    	GameRegistry.registerItem(aspectCrop, Names.Items.ASPECT_CROP);
    	GameRegistry.registerItem(aspectMine, Names.Items.ASPECT_MINE);
    	//Tier 7
    	GameRegistry.registerItem(aspectCraft, Names.Items.ASPECT_CRAFT);
    	GameRegistry.registerItem(aspectMachine, Names.Items.ASPECT_MACHINE);
    	GameRegistry.registerItem(aspectHarvest, Names.Items.ASPECT_HARVEST);
    	GameRegistry.registerItem(aspectCloth, Names.Items.ASPECT_CLOTH);
    	GameRegistry.registerItem(aspectWeapon, Names.Items.ASPECT_WEAPON);
    	GameRegistry.registerItem(aspectArmor, Names.Items.ASPECT_ARMOR);
    	//Items
    	GameRegistry.registerItem(bookAugury, Names.Items.BOOK_AUGURY);
    }
}
