package HW4.Files;

public class main {
	public static void main(String[] args) {
		FileUtils f= new FileUtils("C:/Users/ASUS/Desktop/tesmiit.txt");
		f.readFile();
		f.WriteFile("new text for test");

	}

}
