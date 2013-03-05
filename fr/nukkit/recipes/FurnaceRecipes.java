package fr.nukkit.recipes;

import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class FurnaceRecipes
{
	public void addFurnaceRecipes(net.minecraft.src.FurnaceRecipes par1FurnaceRecipes)
	{
		par1FurnaceRecipes.addSmelting(Block.obsidian.blockID, new ItemStack(Item.ingotObsidian), 0.5F);
	}
}
