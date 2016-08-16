package com.drew.drewmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.Metadata;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import com.drew.drewmod.proxy.CommonProxy;
import com.drew.drewmod.reg.CreateItems;

@Mod(modid = DrewMod.MODID, version = DrewMod.VERSION)
public class DrewMod
{
    public static final String MODID = "DrewMod";
    public static final String VERSION = "1.0";
    
    // TODO: Make server proxy
    @SidedProxy(clientSide = "com.drew.drewmod.proxy.ClientProxy", serverSide = "com.drew.drewmod.proxy.ServerProxy")
    public static CommonProxy proxy;
    
    @Metadata
    public static ModMetadata meta;
    
    @Instance(DrewMod.MODID)
    public static DrewMod modInstance;

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	// items and blocks
    	proxy.createItems();
    	proxy.createBlocks();
    	
    	// Register all the item renderers
    	proxy.registerRenderers(); 
       	
    }
	public static CreativeTabs tabDrew = new CreativeTabs("tabDrew"){
		@Override
		public Item getTabIconItem()
		{
			return new ItemStack(CreateItems.Gtx970).getItem();
		}
		
		
	};
	
	public static CreativeTabs tabLoto = new CreativeTabs("tabLoto")
	{
		@Override
		public Item getTabIconItem()
		{
			return new ItemStack(CreateItems.oberlordSword).getItem();
		}
	};
	
}
