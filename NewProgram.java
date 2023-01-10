package program;

public class NewProgram {
	public static void main(String[] args) {
		System.out.println("Start");
		int a=15;
		int b=0;
		try {
		int c=a/b;
		System.out.println(c);
		
		} catch(Exception e) 
		{
			e.printStackTrace();
			//System.out.println(e);
		}
		System.out.println("End");
	}

}
