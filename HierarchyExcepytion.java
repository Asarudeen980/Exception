package program;

public class HierarchyExcepytion {
	public static void main(String[] args) {
		try {
			String[] a= {"Azar","Madhan","Lokesh","Dinesh"};
			System.out.println(a[9].charAt(0));
		}catch(ArrayIndexOutOfBoundsException  | StringIndexOutOfBoundsException h) {
			h.printStackTrace();
			System.out.println(h);
			System.out.println("Index of Bound");
		}
//		catch(IndexOutOfBoundsException h) {
//			h.printStackTrace();
//			System.out.println(h);
//			System.out.println("Index of Bound Exception");
//		}
		catch(Exception h) {
			h.printStackTrace();
			System.out.println(h);
			System.out.println(" Exception");
		}
	}

}
