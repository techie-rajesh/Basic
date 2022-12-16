package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NotFound {
	public static void main(String[] args) throws FileNotFoundException,IOException,Exception {
		
		try {
		File f=new File("C:\\Users\\91979\\Desktop\\name.txt");
		FileReader fr=new FileReader(f);
		
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.print((char)(temp));
		}
		
	}
		catch(FileNotFoundException fl) {
			System.out.println(fl);
		}

}
}
