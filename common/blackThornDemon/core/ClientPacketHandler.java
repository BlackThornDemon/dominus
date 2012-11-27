package blackThornDemon.core;

import java.io.ByteArrayInputStream; 
import java.io.DataInputStream; 
import net.minecraft.src.*; 
import net.minecraft.src.Packet250CustomPayload; 
import cpw.mods.fml.common.network.IPacketHandler; 
import cpw.mods.fml.common.network.Player; 


public class ClientPacketHandler implements IPacketHandler
{
	public void onPacketData(INetworkManager manager, Packet250CustomPayload payload, Player player)
	{ 
		DataInputStream data = new DataInputStream(new ByteArrayInputStream(payload.data)); 
	}
}
