package fr.nukkit.blocks;

import java.util.List;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.World;

public class BlockChair extends BlockFurnitureAbstract
{
	public BlockChair(int id, int textureIndex, Material material)
	{
		super(id, textureIndex, material);
        this.setBlockBounds(0.2F, 0.0F, 0.2F, 0.8F, 1.0F, 0.8F);
	}
	
	public int getRenderType()
	{
		return 70;
	}
	
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
    {
        int var6 = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, var6);
    }
    
    public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
    {
    	int direction = par1World.getBlockMetadata(par2, par3, par4);
    	
		this.setBlockBounds(0.2F, 0.0F, 0.2F, 0.3F, 0.4F, 0.3F);
        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        this.setBlockBounds(0.2F, 0.0F, 0.7F, 0.3F, 0.4F, 0.8F);
        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        this.setBlockBounds(0.7F, 0.0F, 0.2F, 0.8F, 0.4F, 0.3F);
        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        this.setBlockBounds(0.7F, 0.0F, 0.7F, 0.8F, 0.4F, 0.8F);
        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        this.setBlockBounds(0.2F, 0.4F, 0.2F, 0.8F, 0.5F, 0.8F);
        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);

        if(direction == 0)
        {
	        this.setBlockBounds(0.2F, 0.5F, 0.2F, 0.3F, 1.0F, 0.3F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        	this.setBlockBounds(0.7F, 0.5F, 0.2F, 0.8F, 1.0F, 0.3F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	        this.setBlockBounds(0.3F, 0.65F, 0.225F, 0.7F, 0.70F, 0.275F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	        this.setBlockBounds(0.3F, 0.85F, 0.225F, 0.7F, 0.90F, 0.275F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        }
        else if(direction == 1)
        {
	        this.setBlockBounds(0.7F, 0.5F, 0.2F, 0.8F, 1.0F, 0.3F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        	this.setBlockBounds(0.7F, 0.5F, 0.7F, 0.8F, 1.0F, 0.8F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	        this.setBlockBounds(0.725F, 0.65F, 0.3F, 0.775F, 0.70F, 0.7F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	        this.setBlockBounds(0.725F, 0.85F, 0.3F, 0.775F, 0.90F, 0.7F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        }
        else if(direction == 2)
        {
	        this.setBlockBounds(0.2F, 0.5F, 0.7F, 0.3F, 1.0F, 0.8F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        	this.setBlockBounds(0.7F, 0.5F, 0.7F, 0.8F, 1.0F, 0.8F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	        this.setBlockBounds(0.3F, 0.65F, 0.725F, 0.7F, 0.70F, 0.775F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	        this.setBlockBounds(0.3F, 0.85F, 0.725F, 0.7F, 0.90F, 0.775F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        }
        else if(direction == 3)
	    {
	        this.setBlockBounds(0.2F, 0.5F, 0.2F, 0.3F, 1.0F, 0.3F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	        this.setBlockBounds(0.2F, 0.5F, 0.7F, 0.3F, 1.0F, 0.8F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	        this.setBlockBounds(0.225F, 0.65F, 0.3F, 0.275F, 0.70F, 0.7F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	        this.setBlockBounds(0.225F, 0.85F, 0.3F, 0.275F, 0.90F, 0.7F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	    }
        this.setBlockBounds(0.2F, 0.0F, 0.2F, 0.8F, 1.0F, 0.8F);
    }
}
