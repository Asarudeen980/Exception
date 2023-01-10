package program;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckMailId {
	public static void main(String[] args) {
		try {
			File n=new File("E:\\Emil.txt");
			FileReader fr= new FileReader(n);
			int temp =0;
			while((temp=fr.read())!=-1) 
				System.out.print((char)(temp));
		} catch (IOException e) {
			System.err.println("File Not Found");
			
		}
	}

}
