package execution_framework;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import	java.util.concurrent.*;
public class TaskExecutionWebServer {
	private	static	final	int	NTHREADS	=	100;
	private	static	final	Executor	exec=	Executors.newFixedThreadPool(NTHREADS);
	
	public	static	void	main(String[] args) throws IOException{
		ServerSocket	server	=	new	ServerSocket(80);
		while(true){
			Socket	connection	=	server.accept();
			Runnable	task	=	new	Runnable(){
				public	void	run(){
					handleRequest(connection);
				}
			};
			exec.execute(task);
			
		}
				
	}
	public	static	void	handleRequest(Socket connection){
		//do	no	thing;
	}
}
