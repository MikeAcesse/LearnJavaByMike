package com.sax;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/12 9:56
 */
public class Main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        //path 不以’/'开头时默认是从此类所在的包下取资源，以’/'开头则是从ClassPath根下获取。其只是通过path构造一个绝对路径，最终还是由ClassLoader获取资源
        InputStream inputStream = Main.class.getResourceAsStream("/book.xml");
        //默认则是从ClassPath根下获取，path不能以’/'开头，最终是由ClassLoader获取资源。
       // InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("book.xml");
        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser saxParser = spf.newSAXParser();
        saxParser.parse(inputStream, new MyHandler());
    }

}

