package com.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

import javax.print.Doc;
import java.io.*;
import java.util.Iterator;
import java.util.List;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/10/23 10:30
 */
public class Dom4JforXML {
	@Test
	public void test() throws Exception{
		//创建SAXReader 对象
		SAXReader reader = new SAXReader();
		//读取文件转化成Document
		Document document = reader.read(new File("E:\\idea-workspace\\LearnJavaByMike\\resources\\students.xml"));
		//获取根节点元素对象
		Element root = document.getRootElement();
		//遍历
		listNodes(root);

	}
	//遍历当前节点下的所有节点
	public void listNodes(Element node){
		System.out.println("当前节点的名称： "+ node.getName());
		//首先获取当前节点的所有属性节点
		List<Attribute> list = node.attributes();
		//遍历属性节点
		for (Attribute attribute : list
		     ) {

			System.out.println("属性-> "+attribute.getName()+": "+ attribute.getValue());
		}
		//如果当前节点内容不为空，则输出
		if(!(node.getTextTrim().equals(""))){
			System.out.println(node.getName()+"-> "+node.getText());
		}
		//同时迭代当前节点下面的所有子节点
		//使用递归
		Iterator<Element> iterator = node.elementIterator();
		while(iterator.hasNext()){
			Element e = iterator.next();
			listNodes(e);
		}

	}
	@Test
	public void test2() throws DocumentException {
		//创建SAXReader对象
		SAXReader reader = new SAXReader();
		//读取文件，转换成Document
		Document document = reader.read(new File("E:\\idea-workspace\\LearnJavaByMike\\resources\\students.xml"));
		// 获取根节点元素对象
		Element root = document.getRootElement();
		System.out.println("------------添加属性前------------");
		//获取节点student1
		Element student1Element = root.element("student1");
		//遍历
		listNodes(student1Element);
		//获取其属性
		Attribute idAttribute = student1Element.attribute("id");
		//删除其属性
		student1Element.remove(idAttribute);
		//为其添加新属性
		student1Element.addAttribute("name","这是student1节点的新属性");
		System.out.println("---------添加属性后---------------");
		//遍历
		listNodes(student1Element);


	}

	@Test
	public void test3() throws DocumentException, IOException {
		//创建SAXReader对象
		SAXReader reader = new SAXReader();
		//读取文件，转换成Document
		Document document = reader.read(new File("E:\\idea-workspace\\LearnJavaByMike\\resources\\students.xml"));
		//获取根节点元素对象
		Element root = document.getRootElement();
		System.out.println("------添加节点前--------");
	    //获取节点student1
		Element student1Element = root.element("student1");
		//遍历
		listNodes(student1Element);
		//添加节点
		Element phoneElement = student1Element.addElement("phone");
		//为phone节点设置值
		phoneElement.setText("18721762492");
		System.out.println("-------添加节点后---------");
		listNodes(student1Element);
		writerDocumentToNewFile(document);
	}

	//document 写入新的文件
	public void writerDocumentToNewFile(Document document) throws IOException {
		//输出格式
		OutputFormat format = OutputFormat.createPrettyPrint();
		//OutputFormat format = OutputFormat.createCompactFormat();
		//设置编码
		format.setEncoding("UTF-8");
		File file = new File("E:\\idea-workspace\\LearnJavaByMike\\resources\\s1.xml");
		//XMLWriter 指定输出文件及格式
		//XMLWriter writer = new XMLWriter(new OutputStreamWriter(new FileOutputStream(new File("E:\\idea-workspace\\LearnJavaByMike\\resources\\s1.xml"))));
		XMLWriter writer  = new XMLWriter(new FileOutputStream(file),format);
		writer.write(document);
		writer.flush();
		writer.close();

	}
}
