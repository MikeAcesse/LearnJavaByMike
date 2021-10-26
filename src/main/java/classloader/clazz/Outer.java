package classloader.clazz;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/16 9:40
 */
public class Outer {
    public void method() {
        new Inner() {
            @Override
            public void info() {
                System.out.println("I am anonymous class");
            }
        }.info();
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        out.method();
    }
}

interface Inner {
    public void info();
}

