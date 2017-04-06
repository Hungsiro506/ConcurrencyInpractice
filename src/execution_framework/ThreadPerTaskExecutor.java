package execution_framework;
import java.util.concurrent.*;
/**
 * We can  easily modify TaskExecutorWebServer to behave like ThreadPerTaskWebServer
 * Unbounded Thread.
 */

public class ThreadPerTaskExecutor implements Executor{
	public void execute(Runnable task){
		new	Thread(task).start();
	}

}
