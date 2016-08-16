package com.drew.drewmod.proxy;

import net.minecraftforge.fml.common.network.NetworkRegistry;

import com.drew.drewmod.DrewMod;
import com.drew.drewmod.gui.GuiHandler;



public class CommonProxy
{
	
	public void initmainproxystuff()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(DrewMod.modInstance, new GuiHandler());
	}

	public void registerRenderers()
	{
	}
	
	public void createBlocks()
	{
	}
	
	public void createItems()
	{
	}
	
}
