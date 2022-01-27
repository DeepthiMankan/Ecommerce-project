package genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile
{   
	public String getdata(String key) throws IOException
	{
	Properties p = new Properties();
	FileInputStream fs=new FileInputStream(autoConstant.propertyFilePath);
    p.load(fs);
    return p.getProperty(key);
    
	
	}
}
