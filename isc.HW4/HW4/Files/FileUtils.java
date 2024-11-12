package HW4.Files;
import java.io.*;
import java.util.Scanner; // Import the Scanner class to read text files
public class FileUtils {
	String Address;
	public FileUtils(String Address) {
		this.Address=Address;
	}
	public void readFile() {
		try {
		      File f = new File(this.Address);
		      Scanner Reader = new Scanner(f);
		      while (Reader.hasNextLine()) {
		        String data = Reader.nextLine();
		        System.out.println(data);
		      }
		      Reader.close();
		    } catch(FileNotFoundException e) {
			      System.out.println("File not found.");
			      e.printStackTrace();
		    }
		  }
	public void WriteFile(String s) {
		try {
		      File f = new File(this.Address);
		      if (f.createNewFile()) {
		        System.out.println("File created: " + f.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("input could not be a file Address.");
		      e.printStackTrace();
		    }
		try {
		      FileWriter w = new FileWriter("C:/Users/ASUS/Desktop/test.txt");
		      w.write(s);
		      w.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("String is not writable");
		      e.printStackTrace();
		    }
	}

}
