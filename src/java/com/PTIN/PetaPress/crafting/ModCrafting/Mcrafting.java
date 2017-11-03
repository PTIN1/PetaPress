package com.PTIN.PetaPress.crafting.ModCrafting;

import com.PTIN.PetaPress.block.ModBlocks;
import com.PTIN.PetaPress.item.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public final class Mcrafting {

	public static final void init(){
		GameRegistry.addRecipe(new ItemStack(ModBlocks.peteriumBlock), new Object[] {"###", "###", "###", '#', ModItems.peteriumIngot});
		
		//Untested recipes!!!
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.peteriumIngot, 9), ModBlocks.peteriumBlock);
	}
}
