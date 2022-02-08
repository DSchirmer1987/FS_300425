package threads;

public class DaemonThread {
	public static void main(String[] args) {
		Runnable endless = () -> {
			while(true) {
				System.out.println("Lauf Thread, lauf!");
			}
		};
		
		Thread thread = new Thread(endless);
		Thread thread2 = new DateThread();
		thread.setDaemon(true);
		thread2.start();
		thread.start();
	}
}
