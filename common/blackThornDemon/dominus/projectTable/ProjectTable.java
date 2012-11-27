package blackThornDemon.dominus.projectTable;

import blackThornDemon.core.ClientPacketHandler;
import blackThornDemon.core.ServerPacketHandler;
import cpw.mods.fml.common.Mod; 
import cpw.mods.fml.common.Mod.Init; 
import cpw.mods.fml.common.Mod.PreInit; 
import cpw.mods.fml.common.Mod.PostInit; 
import cpw.mods.fml.common.Mod.Instance; 
import cpw.mods.fml.common.SidedProxy; 
import cpw.mods.fml.common.event.FMLInitializationEvent; 
import cpw.mods.fml.common.event.FMLPostInitializationEvent; 
import cpw.mods.fml.common.event.FMLPreInitializationEvent; 
import cpw.mods.fml.common.network.NetworkMod; 
import cpw.mods.fml.common.network.NetworkRegistry; 
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler; 
import cpw.mods.fml.common.registry.GameRegistry; 
import cpw.mods.fml.common.registry.LanguageRegistry; 
import net.minecraft.src.*; 

@Mod(modid = "projectTable", name = "Project Table", version = "1.00")
@NetworkMod(clientSideRequired=true, serverSideRequired=false, 
clientPacketHandlerSpec = 
@SidedPacketHandler(channels = {"ProjectTable"}, packetHandler = ClientPacketHandler.class), 
serverPacketHandlerSpec = 
@SidedPacketHandler(channels = {"ProjectTable"}, packetHandler = ServerPacketHandler.class)) 

public class ProjectTable 
{
	@Instance
	public static ProjectTable instance = new ProjectTable();
	
	private GuiHandler guiHandler = new GuiHandler();
	public static final Block blockz = new TableBlock(920);
	
	@SidedProxy(clientSide = "blackThornDemon.dominus.projectTable.ClientProxy", serverSide = "blackThornDemon.dominus.projectTable.CommonProxy") 
	public static CommonProxy proxy; 
	
	@Init 
	public void Init(FMLInitializationEvent event)
	{
		NetworkRegistry.instance().registerGuiHandler(this, guiHandler);
		GameRegistry.registerTileEntity(TableTile.class, "tileEntityTutorial"); 
		GameRegistry.registerBlock(blockz);
		GameRegistry.addRecipe(new ItemStack(this.blockz, 1), new Object[]{ 
			"XXX", "XXX", "XXX", Character.valueOf('X'), Block.blockDiamond});


	}

}
