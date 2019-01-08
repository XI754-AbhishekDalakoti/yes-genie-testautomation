package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	FileInputStream fis ;
	Properties config;




	public   PropertyReader(String path)   {
		try {
			fis = new FileInputStream(path);

			config= new Properties();
			config.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	public String getProperty(String key){
		return config.getProperty(key);


	}



}
