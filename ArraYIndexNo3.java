package program;

public class ArraYIndexNo3 {
	public static void main(String[] args) {
	    System.out.println("Array Index Out of Bound Exception");
	    try{
	    	int[] a= {3,5,67,4};
	    	 int b=a[4];
	    	 System.out.println(b);
	    
	    }catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bound Exception");
			System.out.println(e);
			e.printStackTrace();
		}

}
}
