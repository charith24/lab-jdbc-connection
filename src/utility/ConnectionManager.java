package utility;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager {
	public static Properties loadPropertiesFile() throws IOException {
		Properties prop = new Properties();
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
				prop.load(in);
		in.close();
		return prop;
	}
	public static Connection getConnection() throws IOException {
		String driver;
		String url;
		String username;
		String password;
		
		
		Properties newProp = new Properties();
		newProp = loadPropertiesFile();
		driver = newProp.getProperty("driver");
		url = newProp.getProperty("url");
		username = newProp.getProperty("username");
		password = newProp.getProperty("password");
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,password);
			if(con!= null) {
				System.out.println("Established");
			}
		}
		catch(Exception e) {
		System.out.println(e.getMessage());
	}
		return null;
	
}
}
