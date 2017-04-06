package begining;


public class ThreadMethods implements Runnable{
	private String message;
	
	public ThreadMethods(String message){
		this.message = message;
	}
	public void run(){
		System.out.println(this.message);
		System.out.println("dumpStack : " );Thread.dumpStack();
	}
	public static void main(String[] args){
		Runnable hello	=	new	ThreadMethods("Hello");
		Thread thread1 	=	new	Thread(hello);
		thread1.setName("Hello thread");
		thread1.setPriority(Thread.NORM_PRIORITY);
		thread1.start();
		
		// Thread.currentThread() : Thread
		//	Thread.
	}
}
