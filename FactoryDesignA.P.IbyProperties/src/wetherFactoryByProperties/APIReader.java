package wetherFactoryByProperties;

import java.io.FileReader;
import java.util.Properties;

public class APIReader {
	public static String readWetherAPI() {
		String apiType=null;
		Properties prop=new Properties();
		try {
			FileReader fread=new FileReader("configuration/Config.Properties");	
			prop.load(fread);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		apiType=prop.getProperty("Company");
		return apiType;
	}
}