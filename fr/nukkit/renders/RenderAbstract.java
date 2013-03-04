package fr.nukkit.renders;

import java.util.List;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.RenderBlocks;
import net.minecraft.src.Tessellator;
import net.minecraft.src.World;

public abstract class RenderAbstract
{
	protected RenderBlocks renderblocks; // L'objet RenderBlocks
	
	public RenderAbstract(RenderBlocks renderblocks)
	{
		this.renderblocks = renderblocks;
	}
	
	/**
	 * Rendu du bloc dans le jeu
	 */
	public abstract boolean render(Block par1Block, int par2, int par3, int par4);
	/**
	 * Rendu du bloc dans la main
	 */
	public abstract void render(Tessellator par1Tessellator, Block par2Block);
}
