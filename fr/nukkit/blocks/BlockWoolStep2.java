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
    public static final String[] dyeColorNames = new String[] { "gray", "pink", "lime", "yellow", "lightBlue", "magenta", "orange", "white" };
    
    public BlockWoolStep2(int par1, boolean par2)
    {
        super(par1, par2, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
    	if (par2 == 0)
	    {
	        return this.blockIndexInTexture;
	    }
	    else
	    {
	    	par2 += 8;
	        par2 = ~(par2 & 15) ;
	        return 113 + ((par2 & 8) >> 3) + (par2 & 7) * 16;
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
        if (par1 != Block.woolDoubleSlab1.blockID)
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
