package com.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/9/10 10:53
 */
public class testannotation {
	public static String query(Person person){
		StringBuilder sb = new StringBuilder();
        //通过反射，获取Class 对象
		Class p = person.getClass();
		//判断此Class是不是注解类
		boolean exist = p.isAnnotationPresent(Table.class);
		if(!exist){
			return null;
		}
		//如果是，强制类型转换成Table
		Table table = (Table) p.getAnnotation(Table.class);
		String tableName = table.value();
		//接下来便是取值拼接sql语句，并且重复这个过程
		sb.append("select * from ").append(tableName).append(" where 1=1");
		Field[] fArray = p.getDeclaredFields();
		for (Field field: fArray
		     ) {
			boolean fExist = field.isAnnotationPresent(Column.class);
			if(!fExist){
				return null;
			}
			Column column = field.getAnnotation(Column.class);
			String columnName = column.value();
			String fieldName = field.getName();
			Object fieldValue=null;
			//此处将生成getXX方法，用于下边通过反射执行对应的get方法拿到里边的返回值
			String getMethodName = "get"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
			try{
               Method method = p.getMethod(getMethodName);
               fieldValue = method.invoke(person);

			}catch (Exception e){
				e.printStackTrace();
			}
			sb.append(" and ").append(columnName).append("=").append(fieldValue);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
      Person p1= new Person();
      p1.setName("fanzhikang");
      p1.setUserName("root");
      String str = query(p1);
		System.out.println(str);
	}
}
