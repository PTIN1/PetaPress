package com.PTIN.PetaPress.block;

import com.PTIN.PetaPress.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ModBlocks {

	//Creating objects for blocks
	public static Block peteriumBlock;
	
	//Creating objects for ores
	public static Block peteriumOre;
	
	public static final void init() {
		
		//Manifesting blocks
		//(objName = new BasicBlock("name", material), "name");
		GameRegistry.registerBlock(peteriumBlock = new BasicBlock("peteriumBlock", Material.iron), "peteriumBlock");
		
		
		//Manifesting Ores
		//(objName = new ModBlockOre("name", material, drop, min drop, max drop), "name");
		GameRegistry.registerBlock(peteriumOre = new ModBlockOre("peteriumOre", Material.rock, ModItems.unrefinedPeterium, 1, 1), "peteriumOre");
	}

}
