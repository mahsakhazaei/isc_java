package jsontrain;
import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
public class writeInJson {

	public writeInJson() {
		person p = new person();  
	    p.name = "Mahsa";
	    p.ID = 2200;
	    ObjectMapper mapper = new ObjectMapper();
	    try {  

	        // Writing to a file   
	        mapper.writeValue(new File("c:\\person.json"), p );

	    } catch (IOException e) {  
	        e.printStackTrace();  
	    }  

	  }  
	}


