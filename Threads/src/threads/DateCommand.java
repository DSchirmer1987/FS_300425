package threads;

import java.time.LocalDateTime;
import java.util.stream.Stream;

public class DateCommand implements Runnable{
	public void ausgeben() {
		Stream.generate(LocalDateTime::now).limit(20).forEach(System.out::println);
	}

	@Override
	public void run() {
		this.ausgeben();
	}
}
