package blackThornDemon.core;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import net.minecraft.src.*;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class ServerPacketHandler implements IPacketHandler
{
	@Override 
	public void onPacketData(NetworkManager manager, Packet250CustomPayload payload, Player player)
	{ 
	DataInputStream data = new DataInputStream(new ByteArrayInputStream(payload.data));
	}

	@Override
	public void onPacketData(INetworkManager manager,
			Packet250CustomPayload packet, Player player) {
		// TODO Auto-generated method stub
		
	}

}