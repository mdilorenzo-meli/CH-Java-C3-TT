package Practica;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MiFactory {
    public static Object getInstance(String objName) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Properties properties= new Properties();

        properties.load(new FileInputStream(new File("MiFactory.properties")));

        Class c = Class.forName(properties.get(objName).toString());
        return c.getDeclaredConstructor().newInstance();
    }
}
