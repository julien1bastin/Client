package fr.nukkit.recipes;

import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

/**
 * Nukkit furnace recipes class.
 * @author Mathieu Bour (Dierka)
 * @version 1.0
 * @since 2.0R0.1
 */
public class FurnaceRecipes
{
	public void addFurnaceRecipes(net.minecraft.src.FurnaceRecipes par1FurnaceRecipes)
	{
		par1FurnaceRecipes.addSmelting(Block.obsidian.blockID, new ItemStack(Item.ingotObsidian), 0.5F);
	}
}
