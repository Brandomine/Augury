package com.nj.augury.item;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenIceSpike;

import com.nj.augury.gui.GUIBookMenu;
import com.nj.augury.references.Names;

public class ItemBookAugury extends ItemWrapper{
	public ItemBookAugury(){
		super();
		this.setUnlocalizedName(Names.Items.BOOK_AUGURY);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world,EntityPlayer player) {
		if(!world.isRemote){
			Minecraft.getMinecraft().displayGuiScreen(new GUIBookMenu());
		}
		return super.onItemRightClick(itemstack, world, player);
	}
}
