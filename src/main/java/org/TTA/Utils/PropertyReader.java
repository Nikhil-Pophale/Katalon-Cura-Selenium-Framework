package org.TTA.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.util.Objects;
import java.util.Properties;

public class PropertyReader {
    PropertyReader() {

    }

    public static String readKey(String key) throws Exception {
        FileInputStream fileInputStream = null;
        Properties p = null;
        try {
            fileInputStream = new FileInputStream(new File(System.getProperty("user.dir") + "/src/main/java/org/TTA/Resources/data.properties"));
            p = new Properties();
            p.load(fileInputStream);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (Objects.nonNull(fileInputStream)) {
                fileInputStream.close();
            }
        }

        if (p.getProperty(key) == null) {
            throw new Exception(p.getProperty(key) + " not found!!");
        } else {
            return p.getProperty(key);
        }

    }

}
