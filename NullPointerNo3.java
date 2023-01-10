package program;

public class NullPointerNo3 {
	private static String a;

	public static void main(String[] args) {
	    System.out.println("Null Pointer Exception");
	    try{
	    	 a = null;
	    	 int b=a.length();
	    }catch (NullPointerException e) {
			System.out.println("Null Poiter Exception");
			System.out.println(e);
			e.printStackTrace();
		}
	   
	    
	}

}
