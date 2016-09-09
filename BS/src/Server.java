import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
	private ServerSocket host;
	private Socket[] clients;
	private InetAddress[] socketAddresses;
	
	public Server(String type, int players) throws IOException
	{
		if(type.equals("Host"))
		{
			this.clients = new Socket[players];
			this.socketAddresses = new InetAddress[players];
			this.host = new ServerSocket(80);
			for(int i = 0; i < players; i++)
			{
				this.clients[i] = host.accept();
				this.socketAddresses[i] = this.clients[i].getInetAddress();
			}
		}
	}
}
