package blackThornDemon.dominus.projectTable;

import org.lwjgl.opengl.GL11; 
import net.minecraft.src.*;

public class TableGUI extends GuiContainer
{
	public TableGUI(InventoryPlayer player_inventory, TableTile tile_entity)
	{ 
		super(new TableContainer(tile_entity, player_inventory));
	}
	
	// This method is required and all it does is draw the foreground 
	// and overlays  
	protected void drawGuiContainerForegroundLayer()
	{ 
		fontRenderer.drawString("Project Table", 6, 6, 0xffffff);  
		fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 6, ySize - 96 + 2, 0xffffff); 
	} 
	 
	@Override 
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{ 
		int picture = mc.renderEngine.getTexture("<path>"); 
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f); 
		this.mc.renderEngine.bindTexture(picture); 
		int x = (width - xSize) / 2;  
		int y = (height - ySize) / 2; 
		this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize); 
	} 

}
