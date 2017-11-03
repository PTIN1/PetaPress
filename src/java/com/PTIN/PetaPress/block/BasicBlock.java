package com.PTIN.PetaPress.block;

import com.PTIN.PetaPress.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BasicBlock extends Block {

	protected BasicBlock(String unlocalizedName ,Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(2.0F);
		this.setResistance(100.0F);
		this.setLightLevel(2.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setStepSound(soundTypeSnow);
		// TODO Auto-generated constructor stub:
	}

}
