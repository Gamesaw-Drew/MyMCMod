package com.drew.drewmod.reg;

import com.drew.drewmod.block.ChrisMachine;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CreateBlocks 
{
	public static Block chrisMachine;
	
    public static void createBlocks() 
    {
    	GameRegistry.registerBlock(chrisMachine = new ChrisMachine("chrisMachine"), "chrisMachine");
    	
    }
    
}
