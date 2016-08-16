package com.drew.drewmod.reg;

import com.drew.drewmod.DrewMod;
import com.drew.drewmod.items.*;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;

public class CreateItems
{
	
	public static Item chipmunkcard;
	public static Item Gtx970;
	public static Item KappaFish;
	public static Item oberlordSword;
	public static Item oberlordPick;
	public static Item oberlordAxe;
	
	public static final Item.ToolMaterial oberlordToolMaterial = EnumHelper.addToolMaterial("oberlordToolMaterial", 5, 16542, 20.0F, 16.0F, 30);

	
    public static void createItems() 
    {
    	chipmunkcard = new ChipmunkCard().setUnlocalizedName("chipmunkcard").setCreativeTab(DrewMod.tabLoto);
    	GameRegistry.registerItem(chipmunkcard, chipmunkcard.getUnlocalizedName().substring(5));

    	Gtx970 = new Gtx970().setUnlocalizedName("Gtx970").setCreativeTab(DrewMod.tabDrew);
    	GameRegistry.registerItem(Gtx970, Gtx970.getUnlocalizedName().substring(5));
    	
    	KappaFish = new ItemFood(20, 1.0F, true).setUnlocalizedName("kappaFish").setCreativeTab(DrewMod.tabDrew);
    	GameRegistry.registerItem(KappaFish, KappaFish.getUnlocalizedName().substring(5));
    	
		oberlordSword = new ItemOberlordSword(oberlordToolMaterial, 5.0F).setUnlocalizedName("OberlordSword").setCreativeTab(DrewMod.tabLoto);
		GameRegistry.registerItem(oberlordSword, oberlordSword.getUnlocalizedName().substring(5));
		
		oberlordAxe = new ItemOberlordAxe(oberlordToolMaterial).setUnlocalizedName("OberlordAxe").setCreativeTab(DrewMod.tabLoto);
		GameRegistry.registerItem(oberlordAxe, oberlordAxe.getUnlocalizedName().substring(5));
	
	/*	For some reason ITEMPICKAXE is protected, ty mojang
	oberlordPick = new ItemPickaxe(oberlordToolMaterial).setUnlocalizedName("OberlordPick").setCreativeTab(DrewMod.tabLoto)
	GameRegistry.registerItem(oberlordPick, oberlordPick.getUnlocalizedName().substring(5));
	*/
    }
    
}
