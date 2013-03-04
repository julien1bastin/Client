package fr.nukkit.blocks;

import net.minecraft.src.Block;
import net.minecraft.src.Material;

public abstract class BlockFurnitureAbstract extends Block
{
	protected BlockFurnitureAbstract(int id, int textureIndex, Material material)
	{
		super(id, textureIndex, material);
		this.setStepSound(Block.soundWoodFootstep);
	}

	public boolean isOpaqueCube()
	{
		return false;
	}
	
	public boolean renderAsNormalBlock()
	{
		return false;
	}
}
