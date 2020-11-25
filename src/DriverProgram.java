import java.io.*;

import Client.client;

public class DriverProgram 
{
	public static void main(String[] args) throws IOException
	{
		HMSserver server = new HMSserver(1234);
		client HMSclient = new client("localhost", 1234, null);
		
		server.listen();
		HMSclient.openConnection();
		
		String sendmessage = "Successful";
		HMSclient.sendToServer(sendmessage);
		
		HMSclient.closeConnection();
		server.stopListening();
	}
}
