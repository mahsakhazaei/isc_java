package HW4.connection;

public class connection {
	private String url;
	public static connection c; 
	private connection(String url) {
		this.url = url;
	}
	public static connection getInstance(String url) {
		if (c == null) {
			c = new connection(url);}			
		return c;			
	}

}
