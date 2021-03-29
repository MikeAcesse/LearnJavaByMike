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
        InputStream inputStream = Main.class.getResourceAsStream("/book.xml");
        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser saxParser = spf.newSAXParser();
        saxParser.parse(inputStream, new MyHandler());
    }

}

