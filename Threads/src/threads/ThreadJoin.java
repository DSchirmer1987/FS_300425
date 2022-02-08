package threads;

public class ThreadJoin {
	static int summe, produkt, ergebnis;
	/*
	 * Joinen von Threads
	 * 
	 * Wird verwendet wenn Aufgaben auf mehrere Threads verteilt sind.
	 * Dabei geht es darum, dass oftmals Ergebnisse eingesammelt werden müssen, dazu muss aber
	 * auch sichergestellt sein, dass alle Threads ihr Ausführungen beendet haben.
	 */
	public static void main(String[] args) throws InterruptedException {
		Runnable adder = () -> {
			summe = 5 + 6;
		};
		
		Runnable multi = () -> {
			produkt = 10 * 5;
		};
		
		Thread t1 = new Thread(adder);
		Thread t2 = new Thread(multi);
		t1.start();
		t2.start();
//		Thread.sleep(5000); Funktioniert, aber keine wirkliche Lösung
		// Join wartet darauf dass die Threads erledigt sind.
		// Die Reihenfolge der Joins ist unerheblich. Da immer auf den langsamsten Thread gewartet wird.
		t1.join();
		t2.join();
		ergebnis = produkt - summe;
		System.out.println(ergebnis);
	}

}
