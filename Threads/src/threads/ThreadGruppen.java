package threads;

public class ThreadGruppen {

	public static void main(String[] args) {
		// Gruppieren von Threads
		ThreadGroup group = new ThreadGroup("My Threads");
		
		Runnable runnable = () -> {
			for(int i = 0; i < 3; i++) {
				System.out.printf("%s: Das bin ich%n", Thread.currentThread().getName());
			}
		};
		
		new Thread(group, runnable, "Addierer").start();
		new Thread(group, runnable, "Multi").start();
		
		group.interrupt();
		System.out.println("Abgearbeitet");
		group.list();
	}
}
