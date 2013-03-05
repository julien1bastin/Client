package fr.nukkit.blocks;

import net.minecraft.src.Block;
import net.minecraft.src.Material;

/**
 * Nukkit furniture block base class.
 * @author Mathieu Bour (Dierka)
 * @version 1.0
 * @since 2.0R0.1
 */
public abstract class BlockFurnitureAbstract extends Block
{
	protected BlockFurnitureAbstract(int id, int textureIndex, Material material)
	{
		super(id, textureIndex, material);
		this.setStepSound(Block.soundWoodFootstep);
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}
}
