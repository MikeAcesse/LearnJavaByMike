package com.pattern.imooc.proxy.chapter3.proxy;

import org.apache.commons.io.FileUtils;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/25 18:26
 */
public class Proxy {
	public static Object newProxyInstance(Class infce) throws IOException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
		String rt = "\r\n";
		String methodStr  = "";
		for (Method m : infce.getMethods()){
			methodStr += " @Override" +rt+
					" public void "+m.getName()+"() {"+rt+
					" long starttime = System.currentTimeMillis();"+rt+
					" System.out.println(\"汽车开始行驶。。。\");"+rt+
					" m."+m.getName()+"();"+rt+
					" long endtime = System.currentTimeMillis();"+rt+
					" System.out.println(\"汽车结束行驶。。。汽车行驶时间：\" "+rt+
					" +(endtime -starttime) + \" 毫秒！\");"+rt+
					" }";
		}
		String str =
				"package com.pattern.proxy.chapter3.proxy;"+rt+
						"public class $Proxy0 implements "+infce.getName()+" {"+rt+
						" public $Proxy0("+infce.getName()+" m) {"+rt+
						" super();"+rt+
						" this.m = m;"+rt+
						" }"+rt+
						" private "+infce.getName()+" m;"+rt+
						methodStr+rt+"}";
		//产生代理类的Java文件
		String filename = System.getProperty("user.dir")+"/target/classes/com/pattern/proxy/chapter3/proxy/$Proxy0.java";
		File file = new File(filename);
		FileUtils.writeStringToFile(file,str);
		//编译
		//拿到编译器
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		//文件管理者
		StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null,null,null);
		//获取文件
		Iterable units = fileMgr.getJavaFileObjects(filename);
		//编译任务
		JavaCompiler.CompilationTask t = compiler.getTask(null,fileMgr,null,null,null,units);
		//进行编译
		t.call();
		fileMgr.close();

		//load 到内存
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		Class c = cl.loadClass("com.pattern.proxy.chapter3.proxy.$Proxy0");
		Constructor ctr = c.getConstructor(infce);
		return ctr.newInstance(new Car());







	}

}
