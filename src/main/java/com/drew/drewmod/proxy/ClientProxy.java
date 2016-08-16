package com.drew.drewmod.proxy;

import com.drew.drewmod.client.render.blocks.BlockRenderRegister;
import com.drew.drewmod.client.render.items.ItemRenderRegister;
import com.drew.drewmod.reg.CreateBlocks;
import com.drew.drewmod.reg.CreateItems;

public class ClientProxy extends CommonProxy
{
	@Override
	public void initmainproxystuff()
	{
		
	}
	
	@Override
	public void registerRenderers()
	{
		ItemRenderRegister.registerItemRenderer();
		BlockRenderRegister.registerBlockRenderer();
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
