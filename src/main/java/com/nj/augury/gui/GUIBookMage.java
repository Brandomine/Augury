package com.nj.augury.gui;

import org.lwjgl.opengl.GL11;

import com.nj.augury.references.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class GUIBookMage extends GuiScreen{
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
		fontRendererObj.drawString("Mages", guiX + 5, guiY + 3, 0xFF0F37);
		fontRendererObj.drawString("You can be any of the six mages!", guiX + 5, guiY + 13, 0x000000);
		fontRendererObj.drawString("The mages are based off of the 6 main", guiX + 5, guiY + 23, 0x000000);
		fontRendererObj.drawString("aspects. There is no difference inbetween", guiX + 5, guiY + 33, 0x000000);
		fontRendererObj.drawString("each one but there is different things to", guiX + 5, guiY + 43, 0x000000);
		fontRendererObj.drawString("get by progressing each mage tier. To", guiX + 5, guiY + 53, 0x000000);
		fontRendererObj.drawString("make progress in the mage tier, unlock its", guiX + 5, guiY + 63, 0x000000);
		fontRendererObj.drawString("wand and right click to see its effect!", guiX + 5, guiY + 73, 0x000000);
		fontRendererObj.drawString("Please beware that you are using part of its", guiX + 5, guiY + 83, 0x000000);
		fontRendererObj.drawString("charge and can be recharged either", guiX + 5, guiY + 93, 0x000000);
		fontRendererObj.drawString("combining it with its corresponding ", guiX + 5, guiY + 103, 0x000000);
		fontRendererObj.drawString("aspect or by putting it in the repairer ", guiX + 5, guiY + 113, 0x000000);
		fontRendererObj.drawString("and let it be charged by any aspect!", guiX + 5, guiY + 123, 0x000000);
		
		
		super.drawScreen(x, y, ticks);
	}
	@Override
	public void initGui(){
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		buttonList.clear();
		buttonList.add(button1 = new GuiButton(0, guiX + 10, guiY + 137, 40, 20, "Back"));
		buttonList.add(button2 = new GuiButton(1, guiX + 55, guiY + 137, 60, 20, "Next Page"));
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
			Minecraft.getMinecraft().displayGuiScreen(new GUIBookMage2());
			return;
		case 2:
			
			return;
		
		}
	super.actionPerformed(button);
	}
}	
