package begining;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 
 * @author vdh
 *	So much cons. IO blocking, long time consumation,etc.
 */
public class SingleThreadWebServer {
	public static void main(String[] args) throws IOException{
		ServerSocket server = new ServerSocket(80);
		while(true){
			Socket connection = server.accept();
			handleRequest(connection);
		}
	}
	public static void handleRequest(Socket connection){
		//do nothing
	}
}
