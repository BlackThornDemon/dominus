package blackThornDemon.core;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemHoe;

public class ObjectHoe extends ItemHoe
{
	public ObjectHoe(int itemID, EnumToolMaterial toolMaterial)
	 {
	  super(itemID, toolMaterial);
	 }
	 public String getTextureFile()
	 {
	         return "/titanium.png";
	 }
}
