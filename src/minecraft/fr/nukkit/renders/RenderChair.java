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
public class RenderChair extends RenderAbstract
{
	public RenderChair(RenderBlocks renderblocks)
	{
		super(renderblocks);
	}

	@Override
	public boolean render(Block par1Block, int par2, int par3, int par4)
	{
		int direction = this.renderblocks.blockAccess.getBlockMetadata(par2, par3, par4);
		
		this.renderblocks.setRenderBounds(0.2F, 0.0F, 0.2F, 0.3F, 0.4F, 0.3F);
        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
        this.renderblocks.setRenderBounds(0.2F, 0.0F, 0.7F, 0.3F, 0.4F, 0.8F);
        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
        this.renderblocks.setRenderBounds(0.7F, 0.0F, 0.2F, 0.8F, 0.4F, 0.3F);
        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
        this.renderblocks.setRenderBounds(0.7F, 0.0F, 0.7F, 0.8F, 0.4F, 0.8F);
        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
        this.renderblocks.setRenderBounds(0.2F, 0.4F, 0.2F, 0.8F, 0.5F, 0.8F);
        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);

        if(direction == 0)
        {
	        this.renderblocks.setRenderBounds(0.2F, 0.5F, 0.2F, 0.3F, 1.0F, 0.3F);
	        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
        	this.renderblocks.setRenderBounds(0.7F, 0.5F, 0.2F, 0.8F, 1.0F, 0.3F);
	        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
	        this.renderblocks.setRenderBounds(0.3F, 0.65F, 0.225F, 0.7F, 0.70F, 0.275F);
	        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
	        this.renderblocks.setRenderBounds(0.3F, 0.85F, 0.225F, 0.7F, 0.90F, 0.275F);
	        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
        }
        else if(direction == 1)
        {
	        this.renderblocks.setRenderBounds(0.7F, 0.5F, 0.2F, 0.8F, 1.0F, 0.3F);
	        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
        	this.renderblocks.setRenderBounds(0.7F, 0.5F, 0.7F, 0.8F, 1.0F, 0.8F);
	        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
	        this.renderblocks.setRenderBounds(0.725F, 0.65F, 0.3F, 0.775F, 0.70F, 0.7F);
	        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
	        this.renderblocks.setRenderBounds(0.725F, 0.85F, 0.3F, 0.775F, 0.90F, 0.7F);
	        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
        }
        else if(direction == 2)
        {
	        this.renderblocks.setRenderBounds(0.2F, 0.5F, 0.7F, 0.3F, 1.0F, 0.8F);
	        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
        	this.renderblocks.setRenderBounds(0.7F, 0.5F, 0.7F, 0.8F, 1.0F, 0.8F);
	        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
	        this.renderblocks.setRenderBounds(0.3F, 0.65F, 0.725F, 0.7F, 0.70F, 0.775F);
	        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
	        this.renderblocks.setRenderBounds(0.3F, 0.85F, 0.725F, 0.7F, 0.90F, 0.775F);
	        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
        }
        else if(direction == 3)
	    {
	        this.renderblocks.setRenderBounds(0.2F, 0.5F, 0.2F, 0.3F, 1.0F, 0.3F);
	        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
	        this.renderblocks.setRenderBounds(0.2F, 0.5F, 0.7F, 0.3F, 1.0F, 0.8F);
	        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
	        this.renderblocks.setRenderBounds(0.225F, 0.65F, 0.3F, 0.275F, 0.70F, 0.7F);
	        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
	        this.renderblocks.setRenderBounds(0.225F, 0.85F, 0.3F, 0.275F, 0.90F, 0.7F);
	        this.renderblocks.renderStandardBlock(par1Block, par2, par3, par4);
	    }
        
	    return true;
	}
	
	@Override
	public void render(Tessellator par1Tessellator, Block par2Block)
	{
		for (int i = 0; i < 9; ++i)
        {
            if (i == 0)
        		this.renderblocks.setRenderBounds(0.2F, 0.0F, 0.2F, 0.3F, 0.4F, 0.3F);
            if (i == 1)
                this.renderblocks.setRenderBounds(0.2F, 0.0F, 0.7F, 0.3F, 0.4F, 0.8F);
            if (i == 2)
                this.renderblocks.setRenderBounds(0.7F, 0.0F, 0.2F, 0.8F, 0.4F, 0.3F);
            if (i == 3)
                this.renderblocks.setRenderBounds(0.7F, 0.0F, 0.7F, 0.8F, 0.4F, 0.8F);
            if (i == 4)
                this.renderblocks.setRenderBounds(0.2F, 0.4F, 0.2F, 0.8F, 0.5F, 0.8F);
            if (i == 5)
    	        this.renderblocks.setRenderBounds(0.2F, 0.5F, 0.2F, 0.3F, 1.0F, 0.3F);
            if (i == 6)
            	this.renderblocks.setRenderBounds(0.7F, 0.5F, 0.2F, 0.8F, 1.0F, 0.3F);
            if (i == 7)
    	        this.renderblocks.setRenderBounds(0.3F, 0.65F, 0.225F, 0.7F, 0.70F, 0.275F);
            if (i == 8)
    	        this.renderblocks.setRenderBounds(0.3F, 0.85F, 0.225F, 0.7F, 0.90F, 0.275F);

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
