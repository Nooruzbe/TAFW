package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {
        String path = "jetbrains://idea/navigate/reference?project=Tafw&path=src"
        FileInputStream input = new FileInputStream(path);
        properties = new Properties();
        properties.load(input);

    }catch(IOException e){
        e.printStackTrace();
    }
}
   public static String getProperty(String key){
    return properties.getProperty(key).trim();
}

