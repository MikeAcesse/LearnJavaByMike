package com.xml;

import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/12 9:15
 */
public class Main {
	public static void main(String[] args) throws IOException {
		InputStream inputStream = Main.class.getResourceAsStream("/book.xml");
		System.out.println(System.getProperty("user.dir"));
		JacksonXmlModule module = new JacksonXmlModule();
		XmlMapper mapper = new XmlMapper(module);
		Book book = mapper.readValue(inputStream,Book.class);
		System.out.println(book.id);
		System.out.println(book.author);
		System.out.println(book.isbn);
		System.out.println(book.pubDate);
		System.out.println(book.tags);
	}
}
