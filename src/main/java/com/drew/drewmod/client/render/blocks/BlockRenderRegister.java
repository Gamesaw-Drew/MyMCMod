package com.drew.drewmod.client.render.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.drew.drewmod.DrewMod;
import com.drew.drewmod.reg.CreateBlocks;

public class BlockRenderRegister
{
	public static void registerBlockRenderer()
	{
		reg(CreateBlocks.chrisMachine);
	}

	public static void reg(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation("DrewMod:" + block.getUnlocalizedName().substring(5),"inventory"));

	}

}
