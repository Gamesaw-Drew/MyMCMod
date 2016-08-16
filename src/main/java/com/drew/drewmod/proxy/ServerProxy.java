package com.drew.drewmod.proxy;

import com.drew.drewmod.reg.CreateBlocks;
import com.drew.drewmod.reg.CreateItems;

public class ServerProxy extends CommonProxy
{

	@Override
	public void initmainproxystuff()
	{
		
	}
	
	@Override
	public void registerRenderers()
	{
	}
	
	@Override
	public void createBlocks()
	{
		CreateBlocks.createBlocks();
	}
	
	@Override
	public void createItems()
	{
		CreateItems.createItems();
	}
	
}
