package com.pattern.ssm.chapter2.proxy;

import com.pattern.ssm.chapter2.reflect.ReflectServiceImpl;

public class ProxyTest {
    public static void main(String[] args) {
        //testJdkProxy();
        testCGLIBProxy();
    }

    private static void testCGLIBProxy() {
        CglibProxyExample cpe = new CglibProxyExample();
        ReflectServiceImpl obj = (ReflectServiceImpl) cpe.getProxy(ReflectServiceImpl.class);
        obj.sayHello("baba");
    }

    private static void testJdkProxy() {
        JdkProxyExample jdk = new JdkProxyExample();
        //绑定关系，因为挂在接口HelloWorld下，所以声明代理对象HelloWorld proxy
         HelloWorld proxy = (HelloWorld) jdk.bind(new HelloWorldImpl());
         proxy.sayHelloWorld();;
    }
}
