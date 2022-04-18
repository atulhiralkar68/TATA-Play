package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	/**
	 *    used to get data from property file based on key
	 *  key
	 * @return value
	 * @throws IOException
	 */
	public String getPropertyKeyValue(String key) throws Throwable  {

		FileInputStream fis = new FileInputStream(FrameworkConstant.PROPERTIES_PATH);
		Properties properties = new Properties();
		properties.load(fis);
		String value = properties.getProperty(key);

		return value;
	}

}
