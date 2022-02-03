
public class Exceptions {

	public static void main(String[] args) {
		String s = "ABC";
		try {
			int i  = Integer.parseInt(s);
			System.out.println("Die Zahl ist " + i);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			StackTraceElement[] stea = e.getStackTrace();
			StackTraceElement ste = stea[0];
			System.out.println(ste.getFileName());
			System.out.println(ste.getClassName());
			System.out.println(ste.getMethodName());
			System.out.println("-----");
			for (StackTraceElement stackTraceElement : stea) {
				System.out.println(stackTraceElement.getFileName());
				System.out.println(stackTraceElement.getClassName());
				System.out.println(stackTraceElement.getMethodName());
			}
			System.out.println("-----");
			e.printStackTrace();
		}
	}

}
