package com.PTIN.PetaPress.crafting.ModCrafting;

import com.PTIN.PetaPress.block.ModBlocks;
import com.PTIN.PetaPress.item.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public final class Mcrafting {

	public static final void init(){
		//GameRegistry.addRecipe(new ItemStack(ModBlocks.peteriumBlock), new Object[] {"###", "###", "###", '#', ModItems.peteriumIngot});
		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.peteriumIngot, 9), ModBlocks.peteriumBlock);
		
		//Compressed Block Crafting [Untested yet!]
			//Compressed Iron
			//GameRegistry.addRecipe(new ItemStack(ModBlocks.compressedIronBlock), new Object[] {"###", "###", "###", '#', ModItems.peteriumIngot});//Use Iron Block!!!
			GameRegistry.addRecipe(new ItemStack(ModBlocks.doubleCompressedIronBlock), new Object[] {"###", "###", "###", '#', ModBlocks.compressedIronBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.tripleCompressedIronBlock), new Object[] {"###", "###", "###", '#', ModBlocks.doubleCompressedIronBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.quadrupleCompressedIronBlock), new Object[] {"###", "###", "###", '#', ModBlocks.tripleCompressedIronBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.quintupleCompressedIronBlock), new Object[] {"###", "###", "###", '#', ModBlocks.quadrupleCompressedIronBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.sextupleCompressedIronBlock), new Object[] {"###", "###", "###", '#', ModBlocks.quintupleCompressedIronBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.septupleCompressedIronBlock), new Object[] {"###", "###", "###", '#', ModBlocks.sextupleCompressedIronBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.octupleCompressedIronBlock), new Object[] {"###", "###", "###", '#', ModBlocks.septupleCompressedIronBlock});
		
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.peteriumIngot, 9), ModBlocks.compressedIronBlock); //Change peterium to Iron Block!!!
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedIronBlock, 9), ModBlocks.doubleCompressedIronBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.doubleCompressedIronBlock, 9), ModBlocks.tripleCompressedIronBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.tripleCompressedIronBlock, 9), ModBlocks.quadrupleCompressedIronBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.quadrupleCompressedIronBlock, 9), ModBlocks.quintupleCompressedIronBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.quintupleCompressedIronBlock, 9), ModBlocks.sextupleCompressedIronBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.sextupleCompressedIronBlock, 9), ModBlocks.septupleCompressedIronBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.septupleCompressedIronBlock, 9), ModBlocks.octupleCompressedIronBlock);
		
		
			//Compressed Coal [replace Gold with coal!!!!]
			//GameRegistry.addRecipe(new ItemStack(ModBlocks.compressedCoalBlock), new Object[] {"###", "###", "###", '#', ModItems.peteriumIngot});//Use Iron Block!!!
			GameRegistry.addRecipe(new ItemStack(ModBlocks.doubleCompressedCoalBlock), new Object[] {"###", "###", "###", '#', ModBlocks.compressedCoalBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.tripleCompressedCoalBlock), new Object[] {"###", "###", "###", '#', ModBlocks.doubleCompressedCoalBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.quadrupleCompressedCoalBlock), new Object[] {"###", "###", "###", '#', ModBlocks.tripleCompressedCoalBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.quintupleCompressedCoalBlock), new Object[] {"###", "###", "###", '#', ModBlocks.quadrupleCompressedCoalBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.sextupleCompressedCoalBlock), new Object[] {"###", "###", "###", '#', ModBlocks.quintupleCompressedCoalBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.septupleCompressedCoalBlock), new Object[] {"###", "###", "###", '#', ModBlocks.sextupleCompressedCoalBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.octupleCompressedCoalBlock), new Object[] {"###", "###", "###", '#', ModBlocks.septupleCompressedCoalBlock});
		
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.peteriumIngot, 9), ModBlocks.compressedIronBlock); //Change peterium to Iron Block!!!
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedCoalBlock, 9), ModBlocks.doubleCompressedCoalBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.doubleCompressedCoalBlock, 9), ModBlocks.tripleCompressedCoalBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.tripleCompressedCoalBlock, 9), ModBlocks.quadrupleCompressedCoalBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.quadrupleCompressedCoalBlock, 9), ModBlocks.quintupleCompressedCoalBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.quintupleCompressedCoalBlock, 9), ModBlocks.sextupleCompressedCoalBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.sextupleCompressedCoalBlock, 9), ModBlocks.septupleCompressedCoalBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.septupleCompressedCoalBlock, 9), ModBlocks.octupleCompressedCoalBlock);
			
			
			//Compressed Gold
			//GameRegistry.addRecipe(new ItemStack(ModBlocks.compressedGoldBlock), new Object[] {"###", "###", "###", '#', ModItems.peteriumIngot});//Use Iron Block!!!
			GameRegistry.addRecipe(new ItemStack(ModBlocks.doubleCompressedGoldBlock), new Object[] {"###", "###", "###", '#', ModBlocks.compressedGoldBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.tripleCompressedGoldBlock), new Object[] {"###", "###", "###", '#', ModBlocks.doubleCompressedGoldBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.quadrupleCompressedGoldBlock), new Object[] {"###", "###", "###", '#', ModBlocks.tripleCompressedGoldBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.quintupleCompressedGoldBlock), new Object[] {"###", "###", "###", '#', ModBlocks.quadrupleCompressedGoldBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.sextupleCompressedGoldBlock), new Object[] {"###", "###", "###", '#', ModBlocks.quintupleCompressedGoldBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.septupleCompressedGoldBlock), new Object[] {"###", "###", "###", '#', ModBlocks.sextupleCompressedGoldBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.octupleCompressedGoldBlock), new Object[] {"###", "###", "###", '#', ModBlocks.septupleCompressedGoldBlock});
			
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.peteriumIngot, 9), ModBlocks.compressedIronBlock); //Change peterium to Iron Block!!!
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedGoldBlock, 9), ModBlocks.doubleCompressedGoldBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.doubleCompressedGoldBlock, 9), ModBlocks.tripleCompressedGoldBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.tripleCompressedGoldBlock, 9), ModBlocks.quadrupleCompressedGoldBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.quadrupleCompressedGoldBlock, 9), ModBlocks.quintupleCompressedGoldBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.quintupleCompressedGoldBlock, 9), ModBlocks.sextupleCompressedGoldBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.sextupleCompressedGoldBlock, 9), ModBlocks.septupleCompressedGoldBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.septupleCompressedGoldBlock, 9), ModBlocks.octupleCompressedGoldBlock);
			
			
			//Compressed Diamond
			//GameRegistry.addRecipe(new ItemStack(ModBlocks.compressedDiamondBlock), new Object[] {"###", "###", "###", '#', ModItems.peteriumIngot});//Use Diamond Block!!!
			GameRegistry.addRecipe(new ItemStack(ModBlocks.doubleCompressedDiamondBlock), new Object[] {"###", "###", "###", '#', ModBlocks.compressedDiamondBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.tripleCompressedDiamondBlock), new Object[] {"###", "###", "###", '#', ModBlocks.doubleCompressedDiamondBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.quadrupleCompressedDiamondBlock), new Object[] {"###", "###", "###", '#', ModBlocks.tripleCompressedDiamondBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.quintupleCompressedDiamondBlock), new Object[] {"###", "###", "###", '#', ModBlocks.quadrupleCompressedDiamondBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.sextupleCompressedDiamondBlock), new Object[] {"###", "###", "###", '#', ModBlocks.quintupleCompressedDiamondBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.septupleCompressedDiamondBlock), new Object[] {"###", "###", "###", '#', ModBlocks.sextupleCompressedDiamondBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.octupleCompressedDiamondBlock), new Object[] {"###", "###", "###", '#', ModBlocks.septupleCompressedDiamondBlock});
			
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.peteriumIngot, 9), ModBlocks.compressedDiamondBlock); //Change peterium to Iron Block!!!
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedDiamondBlock, 9), ModBlocks.doubleCompressedDiamondBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.doubleCompressedDiamondBlock, 9), ModBlocks.tripleCompressedDiamondBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.tripleCompressedDiamondBlock, 9), ModBlocks.quadrupleCompressedDiamondBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.quadrupleCompressedDiamondBlock, 9), ModBlocks.quintupleCompressedDiamondBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.quintupleCompressedDiamondBlock, 9), ModBlocks.sextupleCompressedDiamondBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.sextupleCompressedDiamondBlock, 9), ModBlocks.septupleCompressedDiamondBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.septupleCompressedDiamondBlock, 9), ModBlocks.octupleCompressedDiamondBlock);
			
			
			//Compressed Emerald
			//GameRegistry.addRecipe(new ItemStack(ModBlocks.compressedEmeraldBlock), new Object[] {"###", "###", "###", '#', ModItems.peteriumIngot});//Use Iron Block!!!
			GameRegistry.addRecipe(new ItemStack(ModBlocks.doubleCompressedEmeraldBlock), new Object[] {"###", "###", "###", '#', ModBlocks.compressedEmeraldBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.tripleCompressedEmeraldBlock), new Object[] {"###", "###", "###", '#', ModBlocks.doubleCompressedEmeraldBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.quadrupleCompressedEmeraldBlock), new Object[] {"###", "###", "###", '#', ModBlocks.tripleCompressedEmeraldBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.quintupleCompressedEmeraldBlock), new Object[] {"###", "###", "###", '#', ModBlocks.quadrupleCompressedEmeraldBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.sextupleCompressedEmeraldBlock), new Object[] {"###", "###", "###", '#', ModBlocks.quintupleCompressedEmeraldBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.septupleCompressedEmeraldBlock), new Object[] {"###", "###", "###", '#', ModBlocks.sextupleCompressedEmeraldBlock});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.octupleCompressedEmeraldBlock), new Object[] {"###", "###", "###", '#', ModBlocks.septupleCompressedEmeraldBlock});
			
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.peteriumIngot, 9), ModBlocks.compressedEmeraldBlock); //Change peterium to Iron Block!!!
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedEmeraldBlock, 9), ModBlocks.doubleCompressedEmeraldBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.doubleCompressedEmeraldBlock, 9), ModBlocks.tripleCompressedEmeraldBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.tripleCompressedEmeraldBlock, 9), ModBlocks.quadrupleCompressedEmeraldBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.quadrupleCompressedEmeraldBlock, 9), ModBlocks.quintupleCompressedEmeraldBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.quintupleCompressedEmeraldBlock, 9), ModBlocks.sextupleCompressedEmeraldBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.sextupleCompressedEmeraldBlock, 9), ModBlocks.septupleCompressedEmeraldBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.septupleCompressedEmeraldBlock, 9), ModBlocks.octupleCompressedEmeraldBlock);
			
			
			
		//Peta Strange Blocks
			//Everythingium
			GameRegistry.addRecipe(new ItemStack(ModItems.everthingiumParticle), new Object[] {"IGD", "CPE", "   ", 'P', ModBlocks.peteriumBlock, 'C', ModBlocks.octupleCompressedCoalBlock, 'I', ModBlocks.octupleCompressedIronBlock, 'G', ModBlocks.octupleCompressedGoldBlock, 'D', ModBlocks.octupleCompressedDiamondBlock, 'E', ModBlocks.octupleCompressedEmeraldBlock});
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
