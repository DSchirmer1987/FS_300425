package threads;

public class MainThread {

	public static void main(String[] args) {
		DateCommand dc = new DateCommand();
		CounterCommand cc = new CounterCommand();
		Sprecher sprecher = new Sprecher();
		// hintereinander
		dc.ausgeben();
		cc.ausgeben();
		System.out.println("-----");
		/*
		 * Gleichzeitig (Threads)
		 */
		// Thread-Objekt aufbauen - Das Objekt, dass vom Thread behandelt wird muss vom Typ 'Runnable' sein
		Thread t1 = new Thread(cc);
		Thread t2 = new Thread(dc);
		// Thread Aufbau über ein anonymes Runnable (new Runnable())
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				sprecher.sprechen();
			}
		});
		// Thread Aufbau über eine Klasse, die von Thread geerbt hat.
		Thread t4 = new DateThread();
		// Thread starten
		System.out.println(t1.getState());
		t1.start();
		t2.start();
		t3.start();
		// Thread schlafen legen
		try {
			t3.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t4.start();
		System.out.println(t1.getState());
	}

}
