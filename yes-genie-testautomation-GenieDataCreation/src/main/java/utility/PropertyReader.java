package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	FileInputStream fis ;
	Properties config;

	public   PropertyReader(String path) throws Exception   {
		fis = new FileInputStream(path);
		config= new Properties();
		config.load(fis);
	}


	public String getProperty(String key){
		return config.getProperty(key);
	}

}
