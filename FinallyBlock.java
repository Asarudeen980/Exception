package program;

public class FinallyBlock {
	public static void main(String [] args) {
		try {
			String a = null;
	    	 int b=a.length();
	    	 System.out.println(b);
		}catch(NullPointerException c) {
			System.err.println("Null Pointer");
			c.printStackTrace();
			System.out.println(c);
		}
		finally {
			System.out.println("Thank you");
		}
	}

}
