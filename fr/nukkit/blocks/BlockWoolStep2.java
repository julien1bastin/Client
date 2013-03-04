package fr.nukkit.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.BlockHalfSlab;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class BlockWoolStep2 extends BlockHalfSlab
{
	public static final String[] dyeColorNames = new String[] { "white", "orange", "magenta","lightBlue", "yellow", "lime", "pink", "gray" };

	public BlockWoolStep2(int par1, boolean par2)
	{
		super(par1, par2, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

	public int getBlockTextureFromSideAndMetadata(int par1, int par2)
	{
        int metadata = par2 & 7;
        
        switch(metadata)
        {
        	case 0:
        		return 64;
        	case 1:
        		return 210;
        	case 2:
        		return 194;
        	case 3:
        		return 172;
        	case 4:
        		return 156;
        	case 5:
        		return 140;
        	case 6:
        		return 124;
        	case 7:
        		return 108;
        	default:
        		return this.blockIndexInTexture;
        }
	}

	public int getBlockTextureFromSide(int par1)
	{
		return this.getBlockTextureFromSideAndMetadata(par1, 0);
	}

	public int idDropped(int par1, Random par2Random, int par3)
	{
		return Block.woolSingleSlab1.blockID;
	}

	protected ItemStack createStackedBlock(int par1)
	{
		return new ItemStack(Block.woolSingleSlab1.blockID, 2, par1 & 7);
	}

	public String getFullSlabName(int par1)
	{
		if (par1 < 0 || par1 >= dyeColorNames.length)
		{
			par1 = 0;
		}

		return super.getBlockName() + "." + dyeColorNames[par1];
	}

	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
	{
		if (par1 != Block.woolDoubleSlab2.blockID)
		{
			for (int var4 = 0; var4 < 8; ++var4)
			{
				if (var4 != 2)
				{
					par3List.add(new ItemStack(par1, 1, var4));
				}
			}
		}
	}
}
