
public class Exception3 {

	public static void main(String[] args) {
		int a = 25;
		int b =  0;
		double ergebnis;
		/*
		 * Division durch 0 - Schlechte Variante
		 */
		try {
			ergebnis = a / b;
		} catch (Exception e) {
			ergebnis = 0;
		}
		
		/*
		 * Division  durch 0 - Gute Variante
		 */
		if(b == 0) {
			ergebnis = 0;
		} else {
			ergebnis = a / b;
		}
		System.out.println(a + " / " + b + " = " + ergebnis);
	}

}
