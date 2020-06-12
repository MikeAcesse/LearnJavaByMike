package com.imooc;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/10 19:47
 */
public class Main {
	public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
		InputStream input = Main.class.getResourceAsStream("book.xml");
		//解析并获取Document对象
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(input);
		System.out.println(doc);
		printNode(doc,0);
	}

	private static void printNode(Node n, int indent) {
		for (int i=0;i< indent;i++){
			System.out.print(' ');
		}
		switch (n.getNodeType()){
			case Node.DOCUMENT_NODE:
				System.out.println("Document: "+n.getNodeName());
				break;
			case Node.ELEMENT_NODE:
				System.out.println("Element: "+n.getNodeName());
				break;
			case Node.TEXT_NODE:
				System.out.println("Text: "+n.getNodeName());
				break;
			case Node.ATTRIBUTE_NODE:
				System.out.println("Attr: "+n.getNodeName());
				break;
			default:
				System.out.println("NodeType: "+n.getNodeType()+",NodeName: "+n.getNodeName());
		}

		for (Node child = n.getFirstChild();child !=null; child= child.getNextSibling()) {
			printNode(child,indent+1);
		}

	}
}
