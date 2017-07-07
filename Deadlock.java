
package packageone;

public class Deadlock{
	public static String value1 = "ValueOne";
	public static String value2 = "ValueTwo";
	
	public static void main(String args[]){
		ThreadOne t1 = new ThreadOne();
		ThreadTwo t2 = new ThreadTwo();
		
		t1.start();
		t2.start();
	}
}


class ThreadOne extends Thread{
	public void run(){
		synchronized (Deadlock.value1) {
			System.out.println("ThreadOne is working on ValueOne");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block	
			}
			System.out.println("ThreadOne is waiting for ThreadTwo to release ValueTwo");
			
			synchronized (Deadlock.value2) {
				System.out.println("ThreadOne is working on ValueTwo");
			}
		}
	}
}

class ThreadTwo extends Thread{
	public void run(){
		synchronized (Deadlock.value2) {
			System.out.println("ThreadTwo is working on ValueTwo");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block	
			}
			System.out.println("ThreadTwo is waiting for ThreadOne to release ValueOne");
			
			synchronized (Deadlock.value1) {
				System.out.println("ThreadTwo is working on ValueOne");
			}
			
		
		}
	}
}