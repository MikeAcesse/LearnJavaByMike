package xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.xml.parsers.SAXParser;
import java.io.File;
import java.util.List;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/10/22 15:58
 * // 利用List 列表的方式来解析xml
 */
public class XmlClassDemoReader {
	public static void main(String[] args) throws DocumentException {
		//SAXReader 就是一个管道，用一个流的方式，把xml 文件读出来
		SAXReader reader = new SAXReader();
		File file = new File("target/classes/books.xml");
		Document document = reader.read(file);
		Element root = document.getRootElement();
		List<Element> childElements = root.elements();
		System.out.println(childElements);
		for (Element child: childElements
		     ) {
            //未知属性名情况
//			List<Attribute> attributeList = child.attributes();
//			for (Attribute attr: attributeList
//			     ) {
//				System.out.println(attr.getName()+":"+attr.getValue());
//			}
			//已知属性名的情况下
			System.out.println("id: "+child.attributeValue("id"));

			//未知子元素名情况下
			List<Element> elementList = child.elements();
			for (Element ele: elementList
			     ) {
				System.out.println(ele.getName()+": "+ele.getText());
			}
			System.out.println();

			//已知子元素名的情况下
//			System.out.println("title:"+child.elementText("title"));
//			System.out.println("author:"+child.elementText("author"));
//			//这行是为了格式美化而存在
//			System.out.println();
		}
	}
}
