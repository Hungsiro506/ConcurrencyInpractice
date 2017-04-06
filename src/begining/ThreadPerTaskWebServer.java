package begining;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * Resource consumption -> terminated main app
 * Thread lifecycle overhead -> create and teardown are not free.
 * Stability	-> Increase stack size -> OutOfMemory
 */
public class ThreadPerTaskWebServer {
	public	static	void	main(String[] args) throws IOException{
		ServerSocket	server	=	new	ServerSocket(80);
		while(true){
			final	Socket	connection	= server.accept();
			Runnable	task	=	new	Runnable(){
				public	void	run(){
					handleRequest(connection);
				}
			};
			new	Thread(task).start();
		}
	}
	//Must be thread safe becase it mayb invoked concurrently multiple tasks. 
	public	static	void	handleRequest(Socket connection){
		//do	no	thing
	}
}
