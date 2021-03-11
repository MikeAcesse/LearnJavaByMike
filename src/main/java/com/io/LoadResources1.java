package com.io;

import java.io.*;
import java.util.Properties;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/8/3 10:40
 */
public class LoadResources1 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("target/classes/db.properties");
        Properties p = new Properties();
        p.load(inputStream);
        OutputStream outputStream = new FileOutputStream("resources/db4.xml");
        p.storeToXML(outputStream, "This is store to xml");
        outputStream.close();
        inputStream.close();
        InputStream inputxml = new FileInputStream("target/classes/db4.xml");
        p.loadFromXML(inputxml);
        System.out.println(p);

    }
}
