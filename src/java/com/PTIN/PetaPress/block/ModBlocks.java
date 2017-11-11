package com.PTIN.PetaPress.block;

import com.PTIN.PetaPress.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ModBlocks {

	//Creating objects for blocks
	public static Block peteriumBlock;
	//Compressed resources starts here
	
		//Compressed Iron
		public static Block compressedIronBlock;
		public static Block doubleCompressedIronBlock;
		public static Block tripleCompressedIronBlock;
		public static Block quadrupleCompressedIronBlock;
		public static Block quintupleCompressedIronBlock;
		public static Block sextupleCompressedIronBlock;
		public static Block septupleCompressedIronBlock;
		public static Block octupleCompressedIronBlock;
	
		//Compressed Coal
		public static Block compressedCoalBlock;
		public static Block doubleCompressedCoalBlock;
		public static Block tripleCompressedCoalBlock;
		public static Block quadrupleCompressedCoalBlock;
		public static Block quintupleCompressedCoalBlock;
		public static Block sextupleCompressedCoalBlock;
		public static Block septupleCompressedCoalBlock;
		public static Block octupleCompressedCoalBlock;
		
		//Compressed Gold
		public static Block compressedGoldBlock;
		public static Block doubleCompressedGoldBlock;
		public static Block tripleCompressedGoldBlock;
		public static Block quadrupleCompressedGoldBlock;
		public static Block quintupleCompressedGoldBlock;
		public static Block sextupleCompressedGoldBlock;
		public static Block septupleCompressedGoldBlock;
		public static Block octupleCompressedGoldBlock;
		
		//Compressed Diamond
		public static Block compressedDiamondBlock;
		public static Block doubleCompressedDiamondBlock;
		public static Block tripleCompressedDiamondBlock;
		public static Block quadrupleCompressedDiamondBlock;
		public static Block quintupleCompressedDiamondBlock;
		public static Block sextupleCompressedDiamondBlock;
		public static Block septupleCompressedDiamondBlock;
		public static Block octupleCompressedDiamondBlock;
		
		//Compressed Emerald
		public static Block compressedEmeraldBlock;
		public static Block doubleCompressedEmeraldBlock;
		public static Block tripleCompressedEmeraldBlock;
		public static Block quadrupleCompressedEmeraldBlock;
		public static Block quintupleCompressedEmeraldBlock;
		public static Block sextupleCompressedEmeraldBlock;
		public static Block septupleCompressedEmeraldBlock;
		public static Block octupleCompressedEmeraldBlock;
	
	//Peta strange blocks
	public static Block everythingiumBlock;
		
	//Creating objects for ores
	public static Block peteriumOre;
	
	public static final void init() {
		
		//Manifesting blocks
		//(objName = new BasicBlock("name", material), "name");
		GameRegistry.registerBlock(peteriumBlock = new BasicBlock("peteriumBlock", Material.iron), "peteriumBlock");
		
			//Manifesting Compressed Blocks
				//Compressed Iron Blocks
				GameRegistry.registerBlock(compressedIronBlock = new BasicBlock("compressedIronBlock", Material.iron), "compressedIronBlock");
				GameRegistry.registerBlock(doubleCompressedIronBlock = new BasicBlock("doubleCompressedIronBlock", Material.iron), "doubleCompressedIronBlock");
				GameRegistry.registerBlock(tripleCompressedIronBlock = new BasicBlock("tripleCompressedIronBlock", Material.iron), "tripleCompressedIronBlock");
				GameRegistry.registerBlock(quadrupleCompressedIronBlock = new BasicBlock("quadrupleCompressedIronBlock", Material.iron), "quadrupleCompressedIronBlock");
				GameRegistry.registerBlock(quintupleCompressedIronBlock = new BasicBlock("quintupleCompressedIronBlock", Material.iron), "quintupleCompressedIronBlock");
				GameRegistry.registerBlock(sextupleCompressedIronBlock = new BasicBlock("sextupleCompressedIronBlock", Material.iron), "sextupleCompressedIronBlock");
				GameRegistry.registerBlock(septupleCompressedIronBlock = new BasicBlock("septupleCompressedIronBlock", Material.iron), "septupleCompressedIronBlock");
				GameRegistry.registerBlock(octupleCompressedIronBlock = new BasicBlock("octupleCompressedIronBlock", Material.iron), "octupleCompressedIronBlock");
				
				//Compressed Coal Blocks
				GameRegistry.registerBlock(compressedCoalBlock = new BasicBlock("compressedCoalBlock", Material.iron), "compressedCoalBlock");
				GameRegistry.registerBlock(doubleCompressedCoalBlock = new BasicBlock("doubleCompressedCoalBlock", Material.iron), "doubleCompressedCoalBlock");
				GameRegistry.registerBlock(tripleCompressedCoalBlock = new BasicBlock("tripleCompressedCoalBlock", Material.iron), "tripleCompressedCoalBlock");
				GameRegistry.registerBlock(quadrupleCompressedCoalBlock = new BasicBlock("quadrupleCompressedCoalBlock", Material.iron), "quadrupleCompressedCoalBlock");
				GameRegistry.registerBlock(quintupleCompressedCoalBlock = new BasicBlock("quintupleCompressedCoalBlock", Material.iron), "quintupleCompressedCoalBlock");
				GameRegistry.registerBlock(sextupleCompressedCoalBlock = new BasicBlock("sextupleCompressedCoalBlock", Material.iron), "sextupleCompressedCoalBlock");
				GameRegistry.registerBlock(septupleCompressedCoalBlock = new BasicBlock("septupleCompressedCoalBlock", Material.iron), "septupleCompressedCoalBlock");
				GameRegistry.registerBlock(octupleCompressedCoalBlock = new BasicBlock("octupleCompressedCoalBlock", Material.iron), "octupleCompressedCoalBlock");
				
				//Compressed Gold Block
				GameRegistry.registerBlock(compressedGoldBlock = new BasicBlock("compressedGoldBlock", Material.iron), "compressedGoldBlock");
				GameRegistry.registerBlock(doubleCompressedGoldBlock = new BasicBlock("doubleCompressedGoldBlock", Material.iron), "doubleCompressedGoldBlock");
				GameRegistry.registerBlock(tripleCompressedGoldBlock = new BasicBlock("tripleCompressedGoldBlock", Material.iron), "tripleCompressedGoldBlock");
				GameRegistry.registerBlock(quadrupleCompressedGoldBlock = new BasicBlock("quadrupleCompressedGoldBlock", Material.iron), "quadrupleCompressedGoldBlock");
				GameRegistry.registerBlock(quintupleCompressedGoldBlock = new BasicBlock("quintupleCompressedGoldBlock", Material.iron), "quintupleCompressedGoldBlock");
				GameRegistry.registerBlock(sextupleCompressedGoldBlock = new BasicBlock("sextupleCompressedGoldBlock", Material.iron), "sextupleCompressedGoldBlock");
				GameRegistry.registerBlock(septupleCompressedGoldBlock = new BasicBlock("septupleCompressedGoldBlock", Material.iron), "septupleCompressedGoldBlock");
				GameRegistry.registerBlock(octupleCompressedGoldBlock = new BasicBlock("octupleCompressedGoldBlock", Material.iron), "octupleCompressedGoldBlock");
		
				//Compressed Diamond
				GameRegistry.registerBlock(compressedDiamondBlock = new BasicBlock("compressedDiamondBlock", Material.iron), "compressedDiamondBlock");
				GameRegistry.registerBlock(doubleCompressedDiamondBlock = new BasicBlock("doubleCompressedDiamondBlock", Material.iron), "doubleCompressedDiamondBlock");
				GameRegistry.registerBlock(tripleCompressedDiamondBlock = new BasicBlock("tripleCompressedDiamondBlock", Material.iron), "tripleCompressedDiamondBlock");
				GameRegistry.registerBlock(quadrupleCompressedDiamondBlock = new BasicBlock("quadrupleCompressedDiamondBlock", Material.iron), "quadrupleCompressedDiamondBlock");
				GameRegistry.registerBlock(quintupleCompressedDiamondBlock = new BasicBlock("quintupleCompressedDiamondBlock", Material.iron), "quintupleCompressedDiamondBlock");
				GameRegistry.registerBlock(sextupleCompressedDiamondBlock = new BasicBlock("sextupleCompressedDiamondBlock", Material.iron), "sextupleCompressedDiamondBlock");
				GameRegistry.registerBlock(septupleCompressedDiamondBlock = new BasicBlock("septupleCompressedDiamondBlock", Material.iron), "septupleCompressedDiamondBlock");
				GameRegistry.registerBlock(octupleCompressedDiamondBlock = new BasicBlock("octupleCompressedDiamondBlock", Material.iron), "octupleCompressedDiamondBlock");
				
				//Compressed Emerald
				GameRegistry.registerBlock(compressedEmeraldBlock = new BasicBlock("compressedEmeraldBlock", Material.iron), "compressedEmeraldBlock");
				GameRegistry.registerBlock(doubleCompressedEmeraldBlock = new BasicBlock("doubleCompressedEmeraldBlock", Material.iron), "doubleCompressedEmeraldBlock");
				GameRegistry.registerBlock(tripleCompressedEmeraldBlock = new BasicBlock("tripleCompressedEmeraldBlock", Material.iron), "tripleCompressedEmeraldBlock");
				GameRegistry.registerBlock(quadrupleCompressedEmeraldBlock = new BasicBlock("quadrupleCompressedEmeraldBlock", Material.iron), "quadrupleCompressedEmeraldBlock");
				GameRegistry.registerBlock(quintupleCompressedEmeraldBlock = new BasicBlock("quintupleCompressedEmeraldBlock", Material.iron), "quintupleCompressedEmeraldBlock");
				GameRegistry.registerBlock(sextupleCompressedEmeraldBlock = new BasicBlock("sextupleCompressedEmeraldBlock", Material.iron), "sextupleCompressedEmeraldBlock");
				GameRegistry.registerBlock(septupleCompressedEmeraldBlock = new BasicBlock("septupleCompressedEmeraldBlock", Material.iron), "septupleCompressedEmeraldBlock");
				GameRegistry.registerBlock(octupleCompressedEmeraldBlock = new BasicBlock("octupleCompressedEmeraldBlock", Material.iron), "octupleCompressedEmeraldBlock");
				
				
			//Peta Strange blocks
			GameRegistry.registerBlock(everythingiumBlock = new BasicBlock("everythingiumBlock", Material.iron), "everythingiumBlock");		
				
				
		//Manifesting Ores
		//(objName = new ModBlockOre("name", material, drop, min drop, max drop), "name");
		GameRegistry.registerBlock(peteriumOre = new ModBlockOre("peteriumOre", Material.rock, ModItems.unrefinedPeterium, 1, 1), "peteriumOre");
	}

}



































