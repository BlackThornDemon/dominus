package blackThornDemon.dominus.projectTable;

import cpw.mods.fml.common.network.IGuiHandler; 
import net.minecraft.src.*; 

public class GuiHandler implements IGuiHandler
{
	@Override 
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{ 
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z); 
		if(tile_entity instanceof TableTile)
		{ 
			return new TableContainer((TableTile) tile_entity, player.inventory); 
		} 
		return null; 
	} 

	@Override 
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{ 
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z); 
	 
		if(tile_entity instanceof TableTile)
		{ 
			return new TableGUI(player.inventory, (TableTile) tile_entity); 
		} 
		 
		return null; 
		} 

}
