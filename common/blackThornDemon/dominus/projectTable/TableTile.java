package blackThornDemon.dominus.projectTable;

import net.minecraft.src.*;

public class TableTile extends TileEntity implements IInventory 
{
	private ItemStack[] inventory;
	
	public TableTile()
	{
		inventory = new ItemStack[1];
		
	}
	@Override
	public int getSizeInventory()
	{
		return inventory.length;
	}
}
