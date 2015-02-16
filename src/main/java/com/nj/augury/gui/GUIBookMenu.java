package com.nj.augury.gui;

import org.lwjgl.opengl.GL11;

import com.nj.augury.references.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class GUIBookMenu extends GuiScreen{

		int guiWidth = 240;
		int guiHeight = 167;
		int buttonWidth = 25;
		int buttonHeight = 25;
		GuiButton button1;
		GuiButton button2;
		GuiButton button3;
		GuiButton button4;
		
		@Override
		public void drawScreen(int x, int y, float ticks){
			int guiX = (width - guiWidth) / 2;
			int guiY = (height - guiHeight) / 2;
			GL11.glColor4f(1, 1, 1, 1);
			drawDefaultBackground();
			mc.renderEngine.bindTexture(new ResourceLocation(Reference.MODID, "textures/gui/Gui.png"));
			drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);;
			super.drawScreen(x, y, ticks);
		}
		@Override
		public void initGui(){
			int guiX = (width - guiWidth) / 2;
			int guiY = (height - guiHeight) / 2;
			buttonList.clear();
			buttonList.add(button1 = new GuiButton(0, guiX + 10, guiY + 15, 100, 20, "Aspects"));
			buttonList.add(button2 = new GuiButton(1, guiX + 130, guiY + 15, 100, 20, "Wands"));
			buttonList.add(button3 = new GuiButton(2, guiX + 10, guiY + 42, 100, 20, "World Generation"));
			buttonList.add(button4 = new GuiButton(3, guiX + 130, guiY + 42, 100, 20, " Types of Mages"));
			super.initGui();
		}
		@Override
		protected void actionPerformed(GuiButton button) {
			int guiX = (width - guiWidth) / 2;
			int guiY = (height - guiHeight) / 2;
			switch(button.id){
			case 0:
				Minecraft.getMinecraft().displayGuiScreen(new GUIBookAspects());
				return;
			case 1:
				Minecraft.getMinecraft().displayGuiScreen(new GUIBookWands());
				return;
			case 2:
				Minecraft.getMinecraft().displayGuiScreen(new GUIBookWorldGeneration());
				return;
			case 3:
				Minecraft.getMinecraft().displayGuiScreen(new GUIBookMage());
				return;
			}
		super.actionPerformed(button);
		}
}
