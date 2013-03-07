package fr.nukkit.recipes;

import net.minecraft.src.CraftingManager;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

/**
 * Nukkit crafting recipes class.
 * @author Mathieu Bour (Dierka)
 * @version 1.0
 * @since 2.0R0.1
 */
public class CraftingRecipes
{
    private String[][] recipePatternsTools = new String[][] {{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
    private Object[][] recipeItemsTools = new Object[][] {
		{ Item.ingotObsidian,   Item.emerald,        Item.ruby,        },
    	{ Item.pickaxeObsidian, Item.pickaxeEmerald, Item.pickaxeRuby, },
    	{ Item.shovelObsidian,  Item.shovelEmerald,  Item.shovelRuby,  },
    	{ Item.axeObsidian,     Item.axeEmerald,     Item.axeRuby,     },
    	{ Item.hoeObsidian,     Item.hoeEmerald,     Item.hoeRuby,     }
    };
	private String[][] recipePatternsArmor = new String[][] { { "XXX", "X X" }, { "X X", "XXX", "XXX" }, { "XXX", "X X", "X X" }, { "X X", "X X" } };
	private Object[][] recipeItemsArmor = new Object[][] {
		{ Item.ingotObsidian,  Item.emerald,       Item.ruby,       },
		{ Item.helmetObsidian, Item.helmetEmerald, Item.helmetRuby, },
		{ Item.plateObsidian,  Item.plateEmerald,  Item.plateRuby,  },
		{ Item.legsObsidian,   Item.legsEmerald,   Item.legsRuby,   },
		{ Item.bootsObsidian,  Item.bootsEmerald,  Item.bootsRuby,  }
	};
	
	public void addRecipes(CraftingManager par1CraftingManager)
	{
		this.addRecipesForTools(par1CraftingManager); // adding tools recipes
		this.addRecipesForArmor(par1CraftingManager); // adding armor recipes
		
		par1CraftingManager.addRecipe(new ItemStack(Block.stairsDirt, 4), new Object[] { "#  ", "## ", "###", '#', Block.dirt });

		for(int metadata = 0, id = Block.stairsWoolWhite.blockID; metadata < 16; metadata++, id++)
			par1CraftingManager.addRecipe(new ItemStack(id, 4, 0), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Block.cloth, 1, metadata) });
		
		for(int metadata = 0; metadata < 8; metadata++)
			par1CraftingManager.addRecipe(new ItemStack(Block.woolSingleSlab1, 6, metadata), new Object[] { "###", '#', new ItemStack(Block.cloth, 1, metadata) }); // first 8 slab recipes
		for(int metadata = 0; metadata < 8; metadata++)
			par1CraftingManager.addRecipe(new ItemStack(Block.woolSingleSlab2, 6, metadata), new Object[] { "###", '#', new ItemStack(Block.cloth, 1, metadata + 8) }); // last 8 slabs recipes
		
		par1CraftingManager.addRecipe(new ItemStack(Block.chair, 4), new Object[] { "  #", "XXX", "# #", '#', Item.stick, 'X', Block.planks });
		par1CraftingManager.addRecipe(new ItemStack(Block.bank, 4), new Object[] { "XXX", "# #", '#', Item.stick, 'X', Block.planks });
		par1CraftingManager.addRecipe(new ItemStack(Block.table, 6), new Object[] { "#", "X", '#', Block.pressurePlatePlanks, 'X', Block.fence });

		par1CraftingManager.addRecipe(new ItemStack(Block.fenceWood, 6), new Object[] { "###", "###", '#', Block.wood });
		par1CraftingManager.addRecipe(new ItemStack(Block.fenceSteel, 6), new Object[] { "###", "###", '#', Block.fenceIron });

		par1CraftingManager.addRecipe(new ItemStack(Block.lantern, 6), new Object[] { "#", "X", '#', Block.redstoneLampIdle, 'X', Block.glass });
		
	}
	
	private void addRecipesForTools(CraftingManager par1CraftingManager)
	{
		for(int var2 = 0; var2 < this.recipeItemsTools[0].length; ++var2)
		{
			Object var3 = this.recipeItemsTools[0][var2];

			for(int var4 = 0; var4 < this.recipeItemsTools.length - 1; ++var4)
			{
				Item var5 = (Item) this.recipeItemsTools[var4 + 1][var2];
				
				par1CraftingManager.addRecipe(new ItemStack(var5), new Object[] { this.recipePatternsTools[var4], 'X', var3, '#', Item.stick });
			}
		}
	}
	
	private void addRecipesForArmor(CraftingManager par1CraftingManager)
	{
		for(int var2 = 0; var2 < this.recipeItemsArmor[0].length; ++var2)
		{
			Object var3 = this.recipeItemsArmor[0][var2];

			for(int var4 = 0; var4 < this.recipeItemsArmor.length - 1; ++var4)
			{
				Item var5 = (Item) this.recipeItemsArmor[var4 + 1][var2];
					par1CraftingManager.addRecipe(new ItemStack(var5), new Object[] { this.recipePatternsArmor[var4], 'X', var3 });
			}
		}
	}
}
