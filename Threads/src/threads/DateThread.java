package threads;

import java.time.LocalDateTime;
import java.util.stream.Stream;

/*
 * Klasse erweitert Thread. Thread selbst ist schon vom Typ 'Runnable'
 * Erben von Thread erleichtert die Implementierung und ermöglicht detailierte Steuerung von Threads.
 */
public class DateThread extends Thread{
	
	public void ausgeben() {
		Stream.generate(LocalDateTime::now).limit(20).forEach(System.out::println);
	}

	@Override
	public void run() {
		this.ausgeben();
	}
	
}
