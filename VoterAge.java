package program;

public class VoterAge {
	public static void main(String[] args) throws AgeException {
		try {
		int age=19;
		if(age<18) {
			throw new AgeException("Not Eligible");
		}else {
			System.out.println("Elgible");
		}
		}catch (AgeException e) {
			e.printStackTrace();
		}
	}

}
class AgeException extends Exception {
	public AgeException(String msg) {
		super(msg);
	}
	public void printStackTrace() {
		System.out.println("Age Exception");
	}
}
