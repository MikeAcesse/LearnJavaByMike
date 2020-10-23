package xml;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.*;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/10/22 15:37
 */
public class XmlClassDemo {
	public static void main(String[] args) throws IOException {
		Document doc = DocumentHelper.createDocument();
		//增加根节点
		Element fanbooks = doc.addElement("fanbooks");
		//增加子元素
		Element book1 = fanbooks.addElement("book");
		Element title1 = book1.addElement("title");
		Element author1 = book1.addElement("author");

		Element book2 = fanbooks.addElement("book");
		Element title2 = book2.addElement("title");
		Element author2 = book2.addElement("author");

		//为子节点添加属性
		book1.addAttribute("id","001");
		//为元素添加内容
		title1.setText("Harry Potter");
		author1.setText("JK.Rowling");

		book2.addAttribute("id","002");
		title2.setText("Learning xml");
		author2.setText("Erik T. Rya");

		//实例化输出格式对象
		OutputFormat format = OutputFormat.createPrettyPrint();
		//设置输出编码
		format.setEncoding("UTF-8");
		//创建需要写入的File对象
		File file = new File("D:"+File.separator+"books.xml");
		//生成xmlwriter 对象， 构造函数中的参数为需要输出的文件流 和 格式
		XMLWriter writer  = new XMLWriter(new FileOutputStream(file),format);
		//开始写入，write 方法中包含上面创建的Document对象
		writer.write(doc);


	}
}
