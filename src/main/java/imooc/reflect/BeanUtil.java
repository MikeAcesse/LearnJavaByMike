package imooc.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/25 14:59
 */
public class BeanUtil {
	/**
	 *  根据标准JavaBean对象的属性名获取其属性值
	 * @param obj
	 * @param propertyName
	 * @return
	 */
	public static Object getValueByPropertyName(Object obj,String propertyName){
	 //1.根据属性名可以获取其get方法
		String getMethodName = "get"
				+propertyName.substring(0,1).toUpperCase()
				+propertyName.substring(1);
		//2.获取方法对象
		Class c = obj.getClass();
		try {
			//get 方法都是public 且无参数
			Method m = c.getMethod(getMethodName);
			//3 通过方法的反射操作方法
			Object value = m.invoke(obj);
			return  value;

		} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
			return null;
		}
	}
}
