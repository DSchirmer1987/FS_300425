package threads;

public class ThreadStop {

	public static void main(String[] args) throws InterruptedException {
		Runnable stopMe = () -> {
			System.out.println("Ich1 muss gestoppt werden!");
			while(! Thread.currentThread().isInterrupted()) {
				System.out.println("Ich1 laufe und laufe und laufe.");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					System.out.println("Sleep() wurde unterbrochen");
				}
			}
			System.out.println("Ich1 bin gestoppt worden!");
		};
		
		Runnable unstoppableMe = () -> {
			try {
				System.out.println("Ich2 muss gestoppt werden!");
				while(! Thread.currentThread().isInterrupted()) {
					System.out.println("Ich2 laufe und laufe und laufe.");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						System.out.println("Sleep() wurde unterbrochen");
					}
				}
			} catch(ThreadDeath td) { // Reagieren auf ThreadDeath (Tod / Abruptes Ende des Threads)
				System.out.println("Ich2 bin gestoppt worden!");
			}
		};
		
		/*
		 * Holzhammer Methode
		 */
		Thread t1 = new Thread(stopMe);
		t1.start();
		Thread.sleep(5000);
		t1.stop();
		
		/*
		 * Reagieren auf das Stop (Abfangen des Holzhammers)
		 */
		Thread t2 = new Thread(unstoppableMe);
		t2.start();
		Thread.sleep(5000);
		t2.stop();
		
		/*
		 * Softe Methode - Bevorzugte Methode
		 */
		Thread t3 = new Thread(stopMe);
		t3.start();
		Thread.sleep(5000);
		t3.interrupt();
	}

}
