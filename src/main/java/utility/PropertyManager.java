package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {

	Properties properties=new Properties();

	public PropertyManager()
	{
		try {
			String filePath=System.getProperty("user.dir")+"\\Object_config.properties";

			File file=new File(filePath);

			FileInputStream fileInputStream=new FileInputStream(file);

			properties.load(fileInputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}

	public String getProperty(String key)
	{
		return properties.getProperty(key);

	}




}
