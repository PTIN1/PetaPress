package com.PTIN.PetaPress.block;

import java.util.Random;

import com.PTIN.PetaPress.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModBlockOre extends Block {
	private Item drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;
	

	protected ModBlockOre(String unlocalizedName, Material p_i45394_1_, Item drop, int least_quantity, int most_quantity) {
		super(p_i45394_1_);
	    this.drop = drop;
	    this.meta = meta;
	    this.least_quantity = least_quantity;
	    this.most_quantity = most_quantity;
		this.setBlockName(unlocalizedName);
        this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setStepSound(soundTypeStone);
        this.setHardness(10.0f);
        this.setResistance(20.0f);
        this.setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
	    return this.drop;
	}

	@Override
	public int damageDropped(int metadata) {
	    return this.meta;
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
	    if (this.least_quantity >= this.most_quantity)
	        return this.least_quantity;
	    return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
	}

}
