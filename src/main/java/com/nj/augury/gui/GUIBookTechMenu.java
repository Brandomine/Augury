package com.nj.augury.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.nj.augury.references.Reference;

public class GUIBookTechMenu extends GuiScreen{
	int guiWidth = 240;
	int guiHeight = 167;
	int buttonWidth = 25;
	int buttonHeight = 25;
	GuiButton button1;
	GuiButton button2;
	GuiButton button3;
	GuiButton button4;
	GuiButton button5;
	GuiButton button6;
	GuiButton button7;
	GuiButton button8;
	GuiButton button9;
	GuiButton button10;
	GuiButton button11;
	GuiButton button12;
	
	@Override
	public void drawScreen(int x, int y, float ticks){
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		GL11.glColor4f(1, 1, 1, 1);
		drawDefaultBackground();
		mc.renderEngine.bindTexture(new ResourceLocation(Reference.MODID, "textures/gui/Gui.png"));
		drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);;
		fontRendererObj.drawString("Tech - Page 1 of 2", guiX + 10, guiY + 123, 0xFF0F37);
		super.drawScreen(x, y, ticks);
	}
	@Override
	public void initGui(){
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		buttonList.clear();
		buttonList.add(button1 = new GuiButton(0, guiX + 10, guiY + 15, 100, 20, "Dimension"));
		buttonList.add(button2 = new GuiButton(1, guiX + 130, guiY + 15, 100, 20, "Boss"));
		buttonList.add(button3 = new GuiButton(2, guiX + 10, guiY + 42, 100, 20, "Tools"));
		buttonList.add(button4 = new GuiButton(3, guiX + 130, guiY + 42, 100, 20, "Ore"));
		buttonList.add(button9 = new GuiButton(8, guiX + 10, guiY + 69, 100, 20, "Machines"));
		buttonList.add(button10 = new GuiButton(9, guiX + 130, guiY + 69, 100, 20, "Storage"));
		buttonList.add(button11 = new GuiButton(10, guiX + 10, guiY + 96, 100, 20, "Magic Augmenting"));
		buttonList.add(button12 = new GuiButton(11, guiX + 130, guiY + 96, 100, 20, "Power Genereation"));
		//continue from button 9 case 8
		//Bottom Control
		buttonList.add(button5 = new GuiButton(4, guiX + 10, guiY + 137, 40, 20, "Back"));
		buttonList.add(button6 = new GuiButton(5, guiX + 55, guiY + 137, 110, 20, "Magic"));
		buttonList.add(button7 = new GuiButton(6, guiX + 170, guiY + 137, 20, 20, "<-"));
		buttonList.add(button8 = new GuiButton(7, guiX + 195, guiY + 137, 20, 20, "->"));
		button5.enabled = false;
		button7.enabled = false;
		button8.enabled = false;
		super.initGui();
	}
	@Override
	protected void actionPerformed(GuiButton button) {
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		switch(button.id){
		case 0:
		
			return;
		case 1:
			
			return;
		case 2:
			
			return;
		case 3:
		
			return;
		case 4:
			
			return;
		case 5:
			Minecraft.getMinecraft().displayGuiScreen(new GUIBookMenu());
			return;
		case 6:
			
			return;
		case 7:
			
			return;
		case 8:
			
			return;
		case 9:
			
			return;
		case 10:
			
			return;
		case 11:
			
			return;
		}
	super.actionPerformed(button);
	}
}
