package builder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTTPConnection {
	    // final instance fields
	    private final String URL;
		private final int port;
		private final String username;
		private final String password;
		private final int timeout;
	    public HTTPConnection(Builder builder)
	    {
	        
	        this.timeout=builder.timeout;
	        this.username=builder.username;
	        this.password=builder.password;
	        this.URL=builder.URL;
	        this.port=builder.port;
	    }

	    // Static class Builder
	    public static class Builder {

	        public int port;
			public String URL;
			public String password;
			public String username;
			public int timeout;


	        public static Builder newInstance()
	        {
	            return new Builder();
	        }

	        private Builder() {}

	        // Setter methods
	        public Builder URL(String URL)
	        {
	        	Pattern pattern = Pattern.compile("HTTP:");
	            Matcher matcher = pattern.matcher(URL);
	            boolean matchFound = matcher.find();
	            if(matchFound) {
	            	this.URL = URL;
		           
	            } else {
	              System.out.println("URL incorrect");
	            }
	            return this;
	        }
	        public Builder username(String username)
	        {
	        	if (username.length()>2) {
	            this.username = username;	            
	        	}
	        	else {
	        		System.out.println("Username incorrect");
	        		
	        }return this;
	        }
	        public Builder password(String password)
	        {
	        	String regExpn = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";
	        	Pattern pattern = Pattern.compile(regExpn, Pattern.CASE_INSENSITIVE);
	            Matcher matcher = pattern.matcher(password);
	            boolean matchFound = matcher.find();
	            if(matchFound) {
	            	this.password = password;
		            
	            } else {
	              System.out.println("password incorrect");
	            }
	            return this;
	        }
	        public Builder port(int port)
	        {
	            this.port = port;
	            return this;
	        }
	        public Builder timeout(int timeout)
	        {
	            this.timeout = timeout;
	            return this;
	        }

	        public HTTPConnection build()
	        {
	            return new HTTPConnection(this);
	        }
	    }

		@Override
		public String toString() {
			return "HTTPConnection [URL=" + URL + ", port=" + port + ", username=" + username + ", password=" + password
					+ ", timeout=" + timeout + "]";
		}

	    
	}

	