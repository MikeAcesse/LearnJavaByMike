package com.pattern.ssm.chapter2.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) {
        ReflectTest rt = new ReflectTest();
        ReflectServiceImpl rs1 = rt.getInstance();
        rs1.sayHello("fanzhikang");
        rt.reflectMethod();
        ReflectServiceImpl2 rt2 = ReflectServiceImpl2.getInstance();
        rt2.sayHello();
    }

    public ReflectServiceImpl getInstance(){
        ReflectServiceImpl object = null;
        try {
            object = (ReflectServiceImpl) Class.forName("com.pattern.ssm.chapter2.reflect.ReflectServiceImpl").newInstance();
        } catch (InstantiationException |IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

    public Object reflectMethod(){
        Object returnObj = null ;
        ReflectServiceImpl target = new ReflectServiceImpl();
        try {
            Method method = ReflectServiceImpl.class.getMethod("sayHello",String.class);
            returnObj = method.invoke(target,"dawanglaixunsan");
        } catch (NoSuchMethodException | IllegalAccessException |InvocationTargetException e) {
            e.printStackTrace();
        }
        return returnObj;
    }
}
