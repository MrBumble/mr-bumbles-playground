package network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	private String username;
	private int port;

	private Socket socket;
	private BufferedWriter out;
	
	public Client(){
		
		
	}
	
	public void connect(String adress,int port,String username) throws UnknownHostException, IOException{
		socket = new Socket(adress, port);
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	
	}
	
	public void sendMessage(String message, BufferedWriter out) throws IOException{
		out.write(message);
		out.newLine();
		out.flush();
		
	}
	
	
}
