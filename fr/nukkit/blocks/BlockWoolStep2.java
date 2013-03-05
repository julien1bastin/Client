package fr.nukkit.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.BlockHalfSlab;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

/**
 * Wool step class number 2 (8/16)
 * @author Mathieu Bour (Dierka)
 * @version 1.0
 * @since 2.0R0.1
 */
public class BlockWoolStep2 extends BlockHalfSlab
{
    public static final String[] woolType = new String[] { "lightGray", "cyan", "purple", "blue", "brown", "green", "red", "black" };

    public BlockWoolStep2(int par1, boolean par2)
    {
        super(par1, par2, Material.wood);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    @Override
    public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
        switch (par2 & 7)
        {
	    	case 1:
	    		return 209;
	    	case 2:
	    		return 193;
	    	case 3:
	    		return 177;
	    	case 4:
	    		return 161;
	    	case 5:
	    		return 145;
	    	case 6:
	    		return 129;
	    	case 7:
	    		return 113;
	    	default:
	    		return 225;
        }
    }
    
    @Override
    public int getBlockTextureFromSide(int par1)
    {
        return this.getBlockTextureFromSideAndMetadata(par1, 0);
    }
    
    @Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Block.woolSingleSlab2.blockID;
    }
    
    @Override
    protected ItemStack createStackedBlock(int par1)
    {
        return new ItemStack(Block.woolSingleSlab2.blockID, 2, par1 & 7);
    }
    
    @Override
    public String getFullSlabName(int par1)
    {
        if (par1 < 0 || par1 >= woolType.length)
        {
            par1 = 0;
        }

        return super.getBlockName() + "." + woolType[par1];
    }
    
    @Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        if (par1 != Block.woolDoubleSlab2.blockID)
        {
            for (int var4 = 0; var4 < 8; ++var4)
            {
                par3List.add(new ItemStack(par1, 1, var4));
            }
        }
    }
}
