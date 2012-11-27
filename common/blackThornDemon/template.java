package blackThornDemon;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry; 
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.BlockOre;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Block;
import net.minecraftforge.common.EnumHelper;
import blackThornDemon.common.CommonProxyTutorial;

public class template {
	
	
	@SidedProxy(clientSide = "blackThornDemon.client.ClientProxyTutorial", serverSide = "blackThornDemon.common.CommonProxyTutorial")
	public static CommonProxyTutorial proxy;
	
	
	@Init
	 public void load(FMLInitializationEvent event)
	 {
		
		  

	 }

}