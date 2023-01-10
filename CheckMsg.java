package program;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckMsg {
	static public void main(String[] args) throws IOException {
		try {
		File f =new File("E:\\welcom.txt");
		FileReader fr= new FileReader(f);
		int temp =0;
		while((temp=fr.read())!=-1) {
			System.out.print((char)(temp));
		}
	}catch(FileNotFoundException r) {
		r.printStackTrace();
	}
	}

}
