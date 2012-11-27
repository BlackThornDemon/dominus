package blackThornDemon.core;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
public class ObjectItem extends Item
{
	public ObjectItem(int i)
    {
        super(i);
        maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
    public String getTextureFile()
    {
            return "/titanium.png";
    }
}
