package com.PTIN.PetaPress.item;

import com.PTIN.PetaPress.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public final class ModItems {

	public static Item peteriumIngot;
	public static Item sancheziumIngot;
	public static Item unrefinedPeterium;
	public static Item sancheziumSword;
	
	//everythingium
	public static Item everthingiumParticle;
	public static Item everthingiumPile;
	public static Item everthingiumShard;
	public static Item everthingiumNugget;
	public static Item everthingiumIngot;
	
	//Materials creation
	public static ToolMaterial SANCHEZIUM = EnumHelper.addToolMaterial("SANCHEZIUM", 7, 1, 15.0F, 0, 0);
	
	public static final void init() {
		peteriumIngot = new Item().setUnlocalizedName("peteriumIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Main.MODID + ":peteriumIngot");
		GameRegistry.registerItem(peteriumIngot, "peteriumIngot");
		
		//everythingium
		everthingiumParticle = new Item().setUnlocalizedName("everthingiumParticle").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Main.MODID + ":everthingiumParticle");
		GameRegistry.registerItem(everthingiumParticle, "everthingiumParticle");
		
		everthingiumPile = new Item().setUnlocalizedName("everthingiumPile").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Main.MODID + ":everthingiumPile");
		GameRegistry.registerItem(everthingiumPile, "everthingiumPile");

		everthingiumShard = new Item().setUnlocalizedName("everthingiumShard").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Main.MODID + ":everthingiumShard");
		GameRegistry.registerItem(everthingiumShard, "everthingiumShard");
		
		everthingiumNugget = new Item().setUnlocalizedName("everthingiumNugget").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Main.MODID + ":everthingiumNugget");
		GameRegistry.registerItem(everthingiumNugget, "everthingiumNugget");
		
		everthingiumIngot = new Item().setUnlocalizedName("everthingiumIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Main.MODID + ":everthingiumIngot");
		GameRegistry.registerItem(everthingiumIngot, "everthingiumIngot");
		
	//Need textures
		unrefinedPeterium = new Item().setUnlocalizedName("unrefinedPeterium").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Main.MODID + ":unrefinedPeterium");
		GameRegistry.registerItem(unrefinedPeterium, "unrefinedPeterium");
		
		sancheziumIngot = new Item().setUnlocalizedName("sancheziumIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Main.MODID + ":sancheziumIngot");
		GameRegistry.registerItem(sancheziumIngot, "sancheziumIngot");
		
		//Swords
		GameRegistry.registerItem(sancheziumSword = new ItemModSwords("sancheziumSword", SANCHEZIUM), "sancheziumSword");
		
	}
	
}
