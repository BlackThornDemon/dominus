package blackThornDemon.dominus;

import net.minecraft.src.BlockContainer;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;
import net.minecraft.src.Material;
/*
 * first we will start with a simple chest
 * 
 */
public class template extends BlockContainer
{
	public template(int id)
	{
		super(id, Material.iron);
	}
	@Override
	public TileEntity createNewTileEntity(World var1) {
		// TODO Auto-generated method stub
		return null;
	}
}
