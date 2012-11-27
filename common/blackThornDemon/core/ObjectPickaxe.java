package blackThornDemon.core;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemPickaxe;

public class ObjectPickaxe extends ItemPickaxe
{
	public ObjectPickaxe(int itemID, EnumToolMaterial toolMaterial)
	 {
	  super(itemID, toolMaterial);
	 }
	 public String getTextureFile()
	 {
	         return "/titanium.png";
	 }
}
