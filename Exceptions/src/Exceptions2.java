
public class Exceptions2 {

	public static void main(String[] args) {
		String s = "ABC";
		try {
			int a = 5 / 0;
			int i = Integer.parseInt(s);
			System.out.println("Zahl ist: " + i);
		}  catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		}	catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		}
		System.out.println("Programmende");
	}

}
