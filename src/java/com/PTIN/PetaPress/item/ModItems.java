package com.PTIN.PetaPress.item;

import com.PTIN.PetaPress.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class ModItems {

	public static Item peteriumIngot;
	public static Item sancheziumIngot;
	public static Item unrefinedPeterium;
	
	
	public static final void init() {
		peteriumIngot = new Item().setUnlocalizedName("peteriumIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Main.MODID + ":peteriumIngot");
		GameRegistry.registerItem(peteriumIngot, "peteriumIngot");
		
	//Need textures
		unrefinedPeterium = new Item().setUnlocalizedName("unrefinedPeterium").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Main.MODID + ":unrefinedPeterium");
		GameRegistry.registerItem(unrefinedPeterium, "unrefinedPeterium");
		
		sancheziumIngot = new Item().setUnlocalizedName("sancheziumIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Main.MODID + ":sancheziumIngot");
		GameRegistry.registerItem(sancheziumIngot, "sancheziumIngot");
	
	}
	
}
