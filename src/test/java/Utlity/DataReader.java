package Utlity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;

public  class DataReader {
	private static Properties prop;
//	private String projectPath=System.getProperty("user.dir");

	private String filePath="Data//config.properties";
	FileInputStream fs;
	
public DataReader() throws IOException{
//	System.out.println("Project Path is:"+projectPath);
	prop=new Properties();
	
		fs=new FileInputStream(filePath);
	prop.load(fs);	
	
	
}
public  String getUrl(){
	 String url = prop.getProperty("url");
	 if(url!= null) return url;
	 else throw new RuntimeException("url not specified in the config.properties file."); 
	 }
public String getUsername(){
	String username = prop.getProperty("username");
	 if(username!= null) return username;
	 else throw new RuntimeException("location not specified in the config.properties file."); 
	 }
public String getPassword(){
	String password = prop.getProperty("password");
	 if(password!= null) return password;
	 else throw new RuntimeException("location not specified in the config.properties file."); 
	 }	

public static String getFirstName(){
	String firstname=RandomStringUtils.randomAlphabetic(5);
	return ("Fname_"+firstname);
}
public static String getLastName(){
	String lastname=RandomStringUtils.randomAlphabetic(5);
	return ("Lname_"+lastname);
}
public static String getMiddlename(){
	String middlename=RandomStringUtils.randomAlphabetic(5);
	return ("Mname_"+middlename);
}
public static String getCategory(){
	String cat=RandomStringUtils.randomAlphabetic(5);
	return ("TestCategory_"+cat);
}
public static String getOptionGroupName(){
	String cat=RandomStringUtils.randomAlphabetic(5);
	return ("TestOptionGroup_"+cat);
}
public static String getsiteName(){
	String name=RandomStringUtils.randomAlphabetic(4);
	return ("Test_"+name);
	
}
}


