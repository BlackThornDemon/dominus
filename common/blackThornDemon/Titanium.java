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
import blackThornDemon.core.ObjectSword;
import blackThornDemon.core.ObjectItem;
import blackThornDemon.core.ObjectOre;
import blackThornDemon.core.ObjectPickaxe;
import blackThornDemon.core.ObjectAxe;
import blackThornDemon.core.ObjectSpade;
import blackThornDemon.core.ObjectHoe;
import blackThornDemon.common.CommonProxyTutorial;

@Mod(modid = "BlackThornDemon", name = "BlackThornDemon", version = "0.80")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
/* 749 
 * 
 * ** Item :: IconIndex :: ID **
 * titanium 		:: 00 :: 550
 * titanium sword 	:: 01 :: 551
 * titanium pickaxe	:: 02 :: 552
 * titanium axe 	:: 03 :: 553
 * titanium spade 	:: 04 :: 554
 * titanium hoe 	:: 05 :: 555
 * titanium helmet 	:: 06 :: 556
 * titanium armor 	:: 07 :: 557
 * titanium greaves	:: 08 :: 558
 * titanium boots 	:: 09 :: 559
 * titanium arrows 	:: 10 :: 560
 * Rutile Ore  		:: 11 :: 230
 */

public class Titanium {
	public static Block oreRutile;
	public static Item titanium;
	public static Item swordTitanium;
	public static Item pickaxeTitanium;
	public static Item axeTitanium;
	public static Item spadeTitanium;
	public static Item hoeTitanium;
	public static Item helmetTitanium;
	public static Item armorTitanium;
	public static Item greavesTitanium;
	public static Item bootsTitanium;
	public static Item arrowsTitanium;
	static EnumToolMaterial titaniumMaterial = EnumHelper.addToolMaterial("titaniumMaterial",3,750,7f,6,14);
	
	@SidedProxy(clientSide = "blackThornDemon.client.ClientProxyTutorial", serverSide = "blackThornDemon.common.CommonProxyTutorial")
	public static CommonProxyTutorial proxy;
	
	
	@Init
	 public void load(FMLInitializationEvent event)
	 {
		
		// Rutile Ore
		oreRutile = new ObjectOre(230, 11)
						.setStepSound(Block.soundMetalFootstep)
						.setHardness(4F)
						.setResistance(1.0F)
						.setBlockName("oreRutile");
		
		// Titanium  
		titanium = new ObjectItem(550).setIconIndex(0).setItemName("titanium");
		
		// Titanium Weapons/Tools
		swordTitanium = new ObjectSword(551, titaniumMaterial)
										.setIconIndex(1)
										.setItemName("swordTitanium");
		pickaxeTitanium = new ObjectPickaxe(552, titaniumMaterial)
										.setIconIndex(2)
										.setItemName("pickaxeTitanium");
		axeTitanium = new ObjectAxe(553, titaniumMaterial)
										.setIconIndex(3)
										.setItemName("axeTitanium");
		spadeTitanium = new ObjectSpade(554, titaniumMaterial)
										.setIconIndex(4)
										.setItemName("spadeTitanium");
		hoeTitanium = new ObjectHoe(555, titaniumMaterial)
										.setIconIndex(5)
										.setItemName("hoeTitanium");
		
		// Titanium Sword recipe
		GameRegistry.addRecipe(new ItemStack(swordTitanium), new Object[]{
					" x ",
					" x ",
					" | ",
					'x', titanium,
					'|', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(pickaxeTitanium), new Object[]{
			"xxx",
			" | ",
			" | ",
			'x', titanium,
			'|', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(axeTitanium), new Object[]{
			"xx ",
			"x| ",
			" | ",
			'x', titanium,
			'|', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(spadeTitanium), new Object[]{
			" x ",
			" | ",
			" | ",
			'x', titanium,
			'|', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(hoeTitanium), new Object[]{
			"xx ",
			" | ",
			" | ",
			'x', titanium,
			'|', Item.stick
		});
		  
		LanguageRegistry.addName(oreRutile, "Rutile Ore");
		LanguageRegistry.addName(titanium, "Titanium");
		LanguageRegistry.addName(swordTitanium, "Titanium Sword");
		LanguageRegistry.addName(pickaxeTitanium, "Titanium Pickaxe");
		LanguageRegistry.addName(axeTitanium, "Titanium Axe");
		LanguageRegistry.addName(spadeTitanium, "Titanium Shovel");
		LanguageRegistry.addName(hoeTitanium, "Titanium Hoe");
		GameRegistry.registerBlock(oreRutile);
		GameRegistry.addSmelting(oreRutile.blockID, new ItemStack(titanium), 0.5F);
		GameRegistry.registerWorldGenerator(new WorldgeneratorTutorial());
		GameRegistry.registerFuelHandler(new CoolFuel());
		proxy.registerRenderThings();
	 }

}
