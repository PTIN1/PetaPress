package com.PTIN.PetaPress;

import com.PTIN.PetaPress.block.ModBlocks;
import com.PTIN.PetaPress.crafting.ModCrafting.Mcrafting;
import com.PTIN.PetaPress.item.ModItems;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	ModItems.init();
    	ModBlocks.init();
    }

    public void init(FMLInitializationEvent e) {
    	Mcrafting.init();
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
	
}
