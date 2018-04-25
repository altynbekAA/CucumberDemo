package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {

	private static Properties properties;

	static {
		String path = "src/test/resources/testdata/test.properties";
		try {
			properties = new Properties();
			FileInputStream input = new FileInputStream(path);
			properties.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return properties.getProperty(key);
	}

}
