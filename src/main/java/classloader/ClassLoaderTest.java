package classloader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/26 10:51
 */
public class ClassLoaderTest {
	public static void main(String[] args) {

		//自定义classloader对象
		DiskClassLoader disLoader = new DiskClassLoader("D:\\lib");
		try {
			//加载class 文件
			Class c = disLoader.loadClass("classloader.Test");
			if(c !=null){
				Object obj = c.newInstance();
				Method method = c.getDeclaredMethod("say",null);
				method.invoke(obj,null);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
