package com.nj.augury.creativetab;

import com.nj.augury.references.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab {
	 public static final CreativeTabs AUGURY_TAB = new CreativeTabs(Reference.MODID.toLowerCase())
	    {
	        @Override
	        public Item getTabIconItem()
	        {
	            return null;
	        }
	    };
}
