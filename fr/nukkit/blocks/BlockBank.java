package fr.nukkit.blocks;

import java.util.List;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.World;

/**
 * Nukkit bank block class.
 * @author Mathieu Bour (Dierka)
 * @version 1.0
 * @since 2.0R0.1
 */
public class BlockBank extends BlockFurnitureAbstract
{
	public BlockBank(int id, int textureIndex, Material material)
	{
		super(id, textureIndex, material);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
	}

	@Override
	public int getRenderType()
	{
		return 72;
	}
	
	@Override
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
    {
        int var6 = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, var6);
    }
    
	@Override
    public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
    {
    	int direction = par1World.getBlockMetadata(par2, par3, par4);
    	
    	if(direction % 2 == 0)
		{
			this.setBlockBounds(0.1F, 0.0F, 0.3F, 0.2F, 0.4F, 0.4F);
			super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
			this.setBlockBounds(0.8F, 0.0F, 0.3F, 0.9F, 0.4F, 0.4F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
			this.setBlockBounds(0.1F, 0.0F, 0.6F, 0.2F, 0.4F, 0.7F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
			this.setBlockBounds(0.8F, 0.0F, 0.6F, 0.9F, 0.4F, 0.7F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	        this.setBlockBounds(0.0F, 0.4F, 0.2F, 1.0F, 0.5F, 0.8F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
		}
		else
		{
			this.setBlockBounds(0.3F, 0.0F, 0.1F, 0.4F, 0.4F, 0.2F);
			super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
			this.setBlockBounds(0.3F, 0.0F, 0.8F, 0.4F, 0.4F, 0.9F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
			this.setBlockBounds(0.6F, 0.0F, 0.1F, 0.7F, 0.4F, 0.2F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
			this.setBlockBounds(0.6F, 0.0F, 0.8F, 0.7F, 0.4F, 0.9F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	        this.setBlockBounds(0.2F, 0.4F, 0.0F, 0.8F, 0.5F, 1.0F);
	        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
		}
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    }
}
