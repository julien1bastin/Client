package fr.nukkit.renders;

import java.util.List;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.RenderBlocks;
import net.minecraft.src.Tessellator;
import net.minecraft.src.World;

/**
 * Nukkit render block base class.
 * @author Mathieu Bour (Dierka)
 * @version 1.0
 * @since 2.0R0.1
 */
public abstract class RenderAbstract
{
	protected RenderBlocks renderblocks; // L'objet RenderBlocks
	
	public RenderAbstract(RenderBlocks renderblocks)
	{
		this.renderblocks = renderblocks;
	}
	
	/**
	 * Render block in-game
	 */
	public abstract boolean render(Block par1Block, int par2, int par3, int par4);
	
	/**
	 * Render block in the hand
	 */
	public abstract void render(Tessellator par1Tessellator, Block par2Block);
}
