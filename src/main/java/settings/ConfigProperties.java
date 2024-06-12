package settings;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
    private final static Properties prop = new Properties();

    static {
        try {
            String currentDir = System.getProperty("user.dir");
            String fileConfig = currentDir + "/src/main/resources/config.properties";
            FileInputStream file = new FileInputStream(fileConfig);
            prop.load(file);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to download config.properties", e);
        }
    }

    public String getValue(String key) {
        return prop.getProperty(key);
    }

    public boolean getValue(String key, boolean defaultValue) {
        String value = prop.getProperty(key);
        return value != null ? Boolean.parseBoolean(value) : defaultValue;
    }

    public long getValue(String key, long defaultValue) {
        String value = prop.getProperty(key);
        return value != null ? Long.parseLong(value) : defaultValue;
    }
}
