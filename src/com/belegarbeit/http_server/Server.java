package Test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
	public static void main(String[] args) 
	{
		int port=1001;
		ServerSocket server= null;
		Socket ss;
		Connection con;
		Konsole kon=new Konsole();
		Log_Datei log=new Log_Datei();
		
		System.out.println("Server start");
		try 
		{
			server = new ServerSocket(port);
			kon.start();
			log.schreib("Server start");
			while (true) 
			{
				
				ss = server.accept();
				con=new Connection(ss);
				con.start();
				
			}
		}
		catch(IOException e)
		{
			System.out.println(e.toString()+"  1");
			e.printStackTrace();
		}
	}
}

