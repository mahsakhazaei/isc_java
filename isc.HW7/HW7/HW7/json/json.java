package HW7.json;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class json {

	public static void main(String[] args) throws Throwable, DatabindException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		File file = new File("data-person.json");
        Account a =objectMapper.readValue(file, Account.class);
        System.out.println(a);

	}
}
