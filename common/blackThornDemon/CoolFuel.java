package blackThornDemon;

import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.IFuelHandler;
import blackThornDemon.Titanium;

public class CoolFuel implements IFuelHandler 
{
 public int getBurnTime(ItemStack fuel) 
 {
	 if(fuel.itemID == 550)
		   return 2000;
		  else
		   return 0;
 }
}