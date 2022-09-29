package utilities;

import java.io.FileReader;
import java.util.Properties;
import java.io.IOException;


public class ReadpropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\VSXUSER\\eclipse-workspace\\AutomationFramework\\MyHealthBDAutomationTseting\\src\\test\\resources\\configfiles\\config.properties");
		
		Properties p = new Properties();
		
		p.load(fr);
		
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl"));

	}

}
