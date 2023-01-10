package program;

public class EmailVerified {
	public static void main(String[] args) throws Verifing {
		String a="asarudeensr@gmail.com";
		if(a.contains("aar")) {
			System.out.println("Verified");
		}else {
			throw new Verifing("Not Verified");
		}
		
	}

}
class Verifing extends Exception {
	public  Verifing(String msg) {
		super(msg);
	}
}
