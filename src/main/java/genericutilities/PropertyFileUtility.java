package genericutilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility {
	
	public String readDataFromPropertyfile(String key) throws Throwable{
FileInputStream fisp = new FileInputStream("C:\\Users\\Madhu\\eclipse-workspace\\newm1\\src\\test\\resources\\CommonData.properties.txt");
		Properties p=new Properties();
		p.load(fisp);
		return p.getProperty(key);
		
	}

}
