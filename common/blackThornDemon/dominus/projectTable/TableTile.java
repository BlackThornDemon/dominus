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
	
	@Override
	public ItemStack getStackInSlot(int slotIndex)
	{
		return inventory[slotIndex];
	}
	
	@Override
	public void setInventorySlotContents(int slot, ItemStack stack)
	{
		inventory[slot] = stack;
		
		//check to make sure stack is not null and not > limit
		if(stack != null && stack.stackSize > getInventoryStackLimit())
		{
			stack.stackSize = getInventoryStackLimit();
		}
	}
	
	//decrease stack size
	@Override
	public ItemStack decrStackSize(int slotIndex, int amount)
	{
		ItemStack stack = getStackInSlot(slotIndex);
		if(stack != null)
		{
			if(stack.stackSize <= amount)
			{
				setInventorySlotContents(slotIndex, null);
			}
			else
			{
				stack = stack.splitStack(amount);
				if(stack.stackSize == 0)
				{
					setInventorySlotContents(slotIndex, null);
				}
			}
		}
		return stack;
	}
	
	@Override
	public ItemStack getStackInSlotOnClosing(int slotIndex)
	{
		ItemStack stack = getStackInSlot(slotIndex);
		if(stack != null)
		{
			setInventorySlotContents(slotIndex, null);
		}
		return stack;
	}
	
	@Override
	public int getInventoryStackLimit()
	{
		return 64;
	}
	
	@Override
	public boolean isUseableByPlayer(EntityPlayer player)
	{
		return worldObj.getBlockTileEntity(xCoord, yCoord, zCoord) == this &&
				player.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord +0.5) < 64;
	}
	
	@Override
	public void openChest() {}
	@Override
	public void closeChest() {}
	
	@Override 
	public void readFromNBT(NBTTagCompound tagCompound)
	{ 
		super.readFromNBT(tagCompound); 
		 
		NBTTagList tagList = tagCompound.getTagList("Inventory"); 
		 
		for(int i = 0; i < tagList.tagCount(); i++)
		{ 
			NBTTagCompound tag = (NBTTagCompound) tagList.tagAt(i); 
		 
			byte slot = tag.getByte("Slot"); 
		 
			if(slot >= 0 && slot < inventory.length)
			{ 
				inventory[slot] = ItemStack.loadItemStackFromNBT(tag); 
			} 
		} 
	} 

	@Override 
	public void writeToNBT(NBTTagCompound tagCompound)
	{ 
		super.writeToNBT(tagCompound); 
		 
		NBTTagList itemList = new NBTTagList(); 
		 
		for(int i = 0; i < inventory.length; i++)
		{ 
			ItemStack stack = inventory[i]; 
			 
			if(stack != null)
			{ 
				NBTTagCompound tag = new NBTTagCompound(); 
				 
				tag.setByte("Slot", (byte) i); 
				stack.writeToNBT(tag); 
				itemList.appendTag(tag); 
			} 
		} 
		 
		tagCompound.setTag("Inventory", itemList); 
		} 
		 
	// This returns the inventory's name 
	@Override 
	public String getInvName()
	{ 
		return "TileEntityTutorial"; 
	}

}




























