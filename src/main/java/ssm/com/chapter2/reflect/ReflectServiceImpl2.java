package ssm.com.chapter2.reflect;

import java.lang.reflect.InvocationTargetException;

public class ReflectServiceImpl2 {
    private String name;

    public ReflectServiceImpl2(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.err.println("hello "+name);
    }
    public static ReflectServiceImpl2 getInstance(){
        ReflectServiceImpl2 object = null;
        try {
           object = (ReflectServiceImpl2) Class.forName("ssm.com.chapter2.reflect.ReflectServiceImpl2")
                    .getConstructor(String.class).newInstance("zhang san");
        } catch (InstantiationException  | InvocationTargetException | NoSuchMethodException | ClassNotFoundException | IllegalAccessException ex) {
            ex.printStackTrace();
        }
        return object;
    }

}
