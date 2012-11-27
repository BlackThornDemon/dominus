package blackThornDemon.core;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemSword;

public class ObjectSword extends ItemSword
{
	 public ObjectSword(int itemID, EnumToolMaterial toolMaterial)
	 {
	  super(itemID, toolMaterial);
	 }
	 public String getTextureFile()
	 {
	         return "/titanium.png";
	 }
}
