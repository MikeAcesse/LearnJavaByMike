package xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/10/22 18:32
 */
public class XmlDemoItor {
	public static void main(String[] args) throws DocumentException {
		SAXReader reader = new SAXReader();
		File file = new File("target/classes/books.xml");
		Document document = reader.read(file);
		Element root = document.getRootElement();
		Iterator it = root.elementIterator();
		while(it.hasNext()){
			Element element = (Element) it.next();
			//未知属性名称情况下
//			Iterator attrIt = element.attributeIterator();
//			while(attrIt.hasNext()){
//				Attribute a = (Attribute) attrIt.next();
//				System.out.println(a.getName()+": "+a.getValue());
//			}
			//在已知属性名称的情况下
			//System.out.println("id: "+element.attributeValue("id"));


			//在未知元素名情况下
//			Iterator eleIt = element.elementIterator();
//			while(eleIt.hasNext()){
//				Element e = (Element) eleIt.next();
//				System.out.println(e.getName()+": "+e.getText());
//
//			}
//			System.out.println();
            //在已知元素名情况下
			System.out.println("title: "+element.elementText("title"));
			System.out.println("author: "+element.elementText("author"));
			System.out.println();
		}
	}
}
