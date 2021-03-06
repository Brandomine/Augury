package com.nj.augury.gui;

import org.lwjgl.opengl.GL11;

import com.nj.augury.references.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class GUIBookAspects extends GuiScreen{
	int guiWidth = 240;
	int guiHeight = 167;
	GuiButton button1;
	GuiButton button2;
	
	@Override
	public void drawScreen(int x, int y, float ticks){
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		GL11.glColor4f(1, 1, 1, 1);
		drawDefaultBackground();
		mc.renderEngine.bindTexture(new ResourceLocation(Reference.MODID, "textures/gui/Gui.png"));
		drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);;
		fontRendererObj.drawString("Aspects Description", guiX + 5, guiY + 3, 0xFF0F37);
		fontRendererObj.drawString("Aspects are base of getting all 42 sub", guiX + 5, guiY + 13, 0x000000);
		fontRendererObj.drawString("aspects. Aspects are used to craft wands,", guiX + 5, guiY + 23, 0x000000);
		fontRendererObj.drawString("blocks, and many other things. Click below", guiX + 5, guiY + 33, 0x000000);
		fontRendererObj.drawString("on aspects to see how they are made!", guiX + 5, guiY + 43, 0x000000);
		super.drawScreen(x, y, ticks);
	}
	@Override
	public void initGui(){
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		buttonList.clear();
		buttonList.add(button1 = new GuiButton(0, guiX + 10, guiY + 137, 40, 20, "Back"));
		buttonList.add(button2 = new GuiButton(1, guiX + 55, guiY + 137, 110, 20, "Aspects"));
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
			Minecraft.getMinecraft().displayGuiScreen(new GUIBookAspects2());
			return;
		}
	super.actionPerformed(button);
	}
	
}
