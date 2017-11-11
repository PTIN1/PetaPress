package com.PTIN.PetaPress.item;

import com.PTIN.PetaPress.Main;

import net.minecraft.item.ItemSword;

public class ItemModSwords extends ItemSword{

	public ItemModSwords(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}

}
