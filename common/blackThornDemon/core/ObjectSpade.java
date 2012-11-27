package blackThornDemon.core;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemSpade;

public class ObjectSpade extends ItemSpade
{
	public ObjectSpade(int itemID, EnumToolMaterial toolMaterial)
	 {
	  super(itemID, toolMaterial);
	 }
	 public String getTextureFile()
	 {
	         return "/titanium.png";
	 }
}

