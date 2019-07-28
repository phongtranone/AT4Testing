package Keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utils {
	public static Properties getProp(String propertyFileName) throws IOException{
		InputStream inputStream = null;
		try {
			Properties prop = new Properties();
			inputStream = new FileInputStream(propertyFileName);
			if(inputStream != null) {
				prop.load(inputStream);
			}else {
				throw new FileNotFoundException("The property file '" + propertyFileName + "' not found in the classpath");
			}
			return prop;
		}
		catch (Exception e) {
			System.out.println("Exception " + e);
		}
		finally {
			inputStream.close();
		}
		return null;
	}
}
