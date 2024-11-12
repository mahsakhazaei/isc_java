package HW4.serialize;
import java.io.*;

public class user implements Serializable {
	private String username;
	private transient String password; //transient= to avoid serialize
	private transient String CardNum;
	public user(String u,String p,String c) {
		this.username=u;
		this.password=p;
		this.CardNum=c;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCardNums() {
		return CardNum;
	}
	public void setCardNums(String cardNums) {
		CardNum = cardNums;
	}
	public void serialized() {
		try{          
			  FileOutputStream fout=new FileOutputStream("k.txt");    
			  ObjectOutputStream out=new ObjectOutputStream(fout);    
			  out.writeObject(this);    
			  out.flush();        
			  out.close();    
			  System.out.println("successfully serialized");    
			  }catch(Exception e){System.out.println(e+" can't serialized");}    
			 }    
	
	
	public void deserialized() {
		try{  
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("k.txt"));    
			  System.out.println("successfully deserialized");   
			  in.close();  
			  }catch(Exception e){System.out.println(e);}  
		}
	
	

}
