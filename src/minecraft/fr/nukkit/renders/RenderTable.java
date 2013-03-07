package fr.nukkit.renders;

import org.lwjgl.opengl.GL11;

import net.minecraft.src.Block;
import net.minecraft.src.BlockStairs;
import net.minecraft.src.RenderBlocks;
import net.minecraft.src.Tessellator;

/**
 * Nukkit chair rederer
 * @author Mathieu Bour (Dierka)
 * @version 1.0
 * @since 2.0R0.1
 */
public class RenderTable extends RenderAbstract
{
	public RenderTable(RenderBlocks renderblocks)
	{
		super(renderblocks);
	}

	@Override
	public boolean render(Block par2Block, int par2, int par3, int par4)
	{
		int var5 = this.renderblocks.blockAccess.getBlockMetadata(par2, par3, par4);
		
		this.renderblocks.setRenderBounds(0.4F, 0.0F, 0.4F, 0.6F, 0.9F, 0.6F);
        this.renderblocks.renderStandardBlock(par2Block, par2, par3, par4);
        this.renderblocks.setRenderBounds(0.0F, 0.9F, 0.0F, 1.0F, 1.0F, 1.0F);
        this.renderblocks.renderStandardBlock(par2Block, par2, par3, par4);
        
	    return true;
	}
	
	@Override
	public void render(Tessellator par1Tessellator, Block par2Block)
	{
		for (int i = 0; i < 2; ++i)
        {
            if (i == 0)
        		this.renderblocks.setRenderBounds(0.4F, 0.0F, 0.4F, 0.6F, 0.9F, 0.6F);
            if (i == 1)
                this.renderblocks.setRenderBounds(0.0F, 0.9F, 0.0F, 1.0F, 1.0F, 1.0F);

            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            par1Tessellator.startDrawingQuads();
            par1Tessellator.setNormal(0.0F, -1.0F, 0.0F);
            this.renderblocks.renderBottomFace(par2Block, 0.0D, 0.0D, 0.0D, par2Block.getBlockTextureFromSide(0));
            par1Tessellator.draw();
            par1Tessellator.startDrawingQuads();
            par1Tessellator.setNormal(0.0F, 1.0F, 0.0F);
            this.renderblocks.renderTopFace(par2Block, 0.0D, 0.0D, 0.0D, par2Block.getBlockTextureFromSide(1));
            par1Tessellator.draw();
            par1Tessellator.startDrawingQuads();
            par1Tessellator.setNormal(0.0F, 0.0F, -1.0F);
            this.renderblocks.renderEastFace(par2Block, 0.0D, 0.0D, 0.0D, par2Block.getBlockTextureFromSide(2));
            par1Tessellator.draw();
            par1Tessellator.startDrawingQuads();
            par1Tessellator.setNormal(0.0F, 0.0F, 1.0F);
            this.renderblocks.renderWestFace(par2Block, 0.0D, 0.0D, 0.0D, par2Block.getBlockTextureFromSide(3));
            par1Tessellator.draw();
            par1Tessellator.startDrawingQuads();
            par1Tessellator.setNormal(-1.0F, 0.0F, 0.0F);
            this.renderblocks.renderNorthFace(par2Block, 0.0D, 0.0D, 0.0D, par2Block.getBlockTextureFromSide(4));
            par1Tessellator.draw();
            par1Tessellator.startDrawingQuads();
            par1Tessellator.setNormal(1.0F, 0.0F, 0.0F);
            this.renderblocks.renderSouthFace(par2Block, 0.0D, 0.0D, 0.0D, par2Block.getBlockTextureFromSide(5));
            par1Tessellator.draw();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
        }
	}
}
