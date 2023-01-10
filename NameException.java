package program;

public class NameException {
	public static void main(String[] args) throws NotMatchStartingLetter{
		String name="Azar";
		if(!name.startsWith("M"))
			throw new NotMatchStartingLetter("First Letter Not Match");
		else
			System.out.println("Matched First Letter");
		
	}

}
class NotMatchStartingLetter extends Exception {
	public NotMatchStartingLetter(String msg) {
		super(msg);
	}
}
