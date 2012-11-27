package blackThornDemon.core;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemAxe;

public class ObjectAxe extends ItemAxe
{
	public ObjectAxe(int itemID, EnumToolMaterial toolMaterial)
	 {
	  super(itemID, toolMaterial);
	 }
	 public String getTextureFile()
	 {
	         return "/titanium.png";
	 }
}
