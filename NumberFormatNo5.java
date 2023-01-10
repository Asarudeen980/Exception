package program;

public class NumberFormatNo5 {
	public static void main(String[] args) {
		try {
			String b="1b";
			int c=Integer.parseInt(b);
			System.out.println(c);
		}
		catch(NumberFormatException f) {
			System.out.println("Number format Exception");
			System.out.println(f);
			f.printStackTrace();
		}
	}

}
