package program;

public class StringIndexExceptionNo4 {
	public static void main(String[] args) {
	    System.out.println("String Index Out of Bound Exception");
	    try{
	    	String a="Car";
	    	 char b=a.charAt(-1);
	    System.out.println(b);
	    }catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out of Bound Exception");
			System.out.println(e);
			e.printStackTrace();
		}

}

}
