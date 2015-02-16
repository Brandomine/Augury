package com.nj.augury.gui;

import org.lwjgl.opengl.GL11;

import com.nj.augury.references.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class GUIBookWorldGeneration extends GuiScreen{
	int guiWidth = 240;
	int guiHeight = 167;
	GuiButton button1;
	
	@Override
	public void drawScreen(int x, int y, float ticks){
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		GL11.glColor4f(1, 1, 1, 1);
		drawDefaultBackground();
		mc.renderEngine.bindTexture(new ResourceLocation(Reference.MODID, "textures/gui/Gui.png"));
		drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);;
		fontRendererObj.drawString("World Generation", guiX + 5, guiY + 3, 0xFF0F37);
		fontRendererObj.drawString("The world contains many aspects which can ", guiX + 5, guiY + 13, 0x000000);
		fontRendererObj.drawString("be harvested by exploring! Exploration is", guiX + 5, guiY + 23, 0x000000);
		fontRendererObj.drawString("key to starting off as a mage. ", guiX + 5, guiY + 33, 0x000000);
		fontRendererObj.drawString("To progress, you may want to find some", guiX + 5, guiY + 43, 0x000000);
		fontRendererObj.drawString("of the following aspect plants!", guiX + 5, guiY + 53, 0x000000);
		fontRendererObj.drawString("Fire", guiX + 5, guiY + 63, 0xFF3F00);
		fontRendererObj.drawString("Water", guiX + 5, guiY + 73, 0x305DFF);
		fontRendererObj.drawString("Earth", guiX + 5, guiY + 83, 0x006511);
		fontRendererObj.drawString("Air", guiX + 5, guiY + 93, 0xBCB300);
		fontRendererObj.drawString("Order", guiX + 5, guiY + 103, 0x7F7F7F);
		fontRendererObj.drawString("Entropy", guiX + 5, guiY + 113, 0x616163);
		super.drawScreen(x, y, ticks);
	}
	@Override
	public void initGui(){
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		buttonList.clear();
		buttonList.add(button1 = new GuiButton(0, guiX + 10, guiY + 137, 40, 20, "Back"));
		super.initGui();
	}
	@Override
	protected void actionPerformed(GuiButton button) {
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		switch(button.id){
		case 0:
			Minecraft.getMinecraft().displayGuiScreen(new GUIBookMenu());
			return;
		case 1:
			
			return;
		case 2:
			
			return;
		
		}
	super.actionPerformed(button);
	}
}
