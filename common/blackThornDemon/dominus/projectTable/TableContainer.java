package blackThornDemon.dominus.projectTable;

import net.minecraft.src.*;

public class TableContainer extends Container
{
	protected TableTile tile_entity;
	public TableContainer(TableTile tile_entity, InventoryPlayer player_inventory)
	{ 
			
		this.tile_entity = tile_entity;
		
							// Slot(slot declaration, slotID, Xpos, Ypos);
		addSlotToContainer(new Slot(tile_entity, 0, 76, 27));
		
		// our method, binds player's inventory to gui
		bindPlayerInventory(player_inventory);
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player)
	{
		return tile_entity.isUseableByPlayer(player);
	}
	
	protected void bindPlayerInventory(InventoryPlayer player_inventory)
	{
		for(int i = 0; i < 3; i++)
		{ 
			for(int j = 0; j < 9; j++)
			{ 
				addSlotToContainer(new Slot(player_inventory, j + i * 9 + 9, 9 + j * 18, 64 + i * 16)); 
			} 
		} 
			 
		for(int i = 0; i < 9; i++)
		{ 
			addSlotToContainer(new Slot(player_inventory, i, 6 + i * 16, 142)); 
		} 
			
	}
}
