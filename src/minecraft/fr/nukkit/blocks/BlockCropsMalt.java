package fr.nukkit.blocks;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.BlockFlower;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

/**
 * Nukkit malt crops block.
 * @author Mathieu Bour (Dierka)
 * @version 1.0
 * @since 2.0R0.1
 */
public class BlockCropsMalt extends BlockFlower
{
    public BlockCropsMalt(int par1, int par2)
    {
        super(par1, par2);
        this.blockIndexInTexture = par2;
        this.setTickRandomly(true);
        float var3 = 0.5F;
        this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.25F, 0.5F + var3);
        this.setCreativeTab((CreativeTabs)null);
        this.setHardness(0.0F);
        this.setStepSound(soundGrassFootstep);
        this.disableStats();
        this.setRequiresSelfNotify();
    }
    
    protected int getSeedItem()
    {
        return Item.seedsMalt.itemID;
    }
    
    protected int getCropItem()
    {
        return Item.malt.itemID;
    }
    
    public void fertilize(World par1World, int par2, int par3, int par4)
    {
        par1World.setBlockMetadataWithNotify(par2, par3, par4, 7);
    }
    
    private float getGrowthRate(World par1World, int par2, int par3, int par4)
    {
        float var5 = 1.0F;
        int var6 = par1World.getBlockId(par2, par3, par4 - 1);
        int var7 = par1World.getBlockId(par2, par3, par4 + 1);
        int var8 = par1World.getBlockId(par2 - 1, par3, par4);
        int var9 = par1World.getBlockId(par2 + 1, par3, par4);
        int var10 = par1World.getBlockId(par2 - 1, par3, par4 - 1);
        int var11 = par1World.getBlockId(par2 + 1, par3, par4 - 1);
        int var12 = par1World.getBlockId(par2 + 1, par3, par4 + 1);
        int var13 = par1World.getBlockId(par2 - 1, par3, par4 + 1);
        boolean var14 = var8 == this.blockID || var9 == this.blockID;
        boolean var15 = var6 == this.blockID || var7 == this.blockID;
        boolean var16 = var10 == this.blockID || var11 == this.blockID || var12 == this.blockID || var13 == this.blockID;

        for (int var17 = par2 - 1; var17 <= par2 + 1; ++var17)
        {
            for (int var18 = par4 - 1; var18 <= par4 + 1; ++var18)
            {
                int var19 = par1World.getBlockId(var17, par3 - 1, var18);
                float var20 = 0.0F;

                if (var19 == Block.tilledField.blockID)
                {
                    var20 = 1.0F;

                    if (par1World.getBlockMetadata(var17, par3 - 1, var18) > 0)
                    {
                        var20 = 3.0F;
                    }
                }

                if (var17 != par2 || var18 != par4)
                {
                    var20 /= 4.0F;
                }

                var5 += var20;
            }
        }

        if (var16 || var14 && var15)
        {
            var5 /= 2.0F;
        }

        return var5;
    }
    
    
    @Override
    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        return par1 == Block.tilledField.blockID;
    }
    
    @Override
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        super.updateTick(par1World, par2, par3, par4, par5Random);

        if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9)
        {
            int var6 = par1World.getBlockMetadata(par2, par3, par4);

            if (var6 < 7)
            {
                float var7 = this.getGrowthRate(par1World, par2, par3, par4);

                if (par5Random.nextInt((int)(25.0F / var7) + 1) == 0)
                {
                    ++var6;
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, var6);
                }
            }
        }
    }
    
    @Override
    public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
        if (par2 >= 0 && par2 < 5)
        {
            return this.blockIndexInTexture + par2;
        }
        else if (par2 > 4 && par2 < 8)
        {
        	return this.blockIndexInTexture + 11 + par2;
        }
        else
        {
        	return 235;
        }
    }
    
    @Override
    public int getRenderType()
    {
        return 6;
    }
    
    @Override
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, 0);

        if (!par1World.isRemote)
        {
            if (par5 >= 7)
            {
                int var8 = 3 + par7;

                for (int var9 = 0; var9 < var8; ++var9)
                {
                    if (par1World.rand.nextInt(15) <= par5)
                    {
                        this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(this.getSeedItem(), 1, 0));
                    }
                }
            }
        }
    }
    
    @Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return par1 == 7 ? this.getCropItem() : this.getSeedItem();
    }
    
    @Override
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }
    
    @Override
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return this.getSeedItem();
    }
}
