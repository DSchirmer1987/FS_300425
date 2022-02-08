package threads;

import java.util.stream.IntStream;

public class CounterCommand implements Runnable{
	public void ausgeben() {
		IntStream.range(0, 20).forEach(System.out::println);
	}

	// Methode 'run' aus dem Interface 'Runnable', damit ein Thread wei�, was ausgef�hrt werden muss
	@Override
	public void run() {
		this.ausgeben();
	}
}
