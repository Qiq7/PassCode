package Study;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AnTest {
    public static void main(String[] args) throws ClassNotFoundException {
//        ClassLoader loader = AnTest.class.getClassLoader();
//        loader.loadClass("chick");
        chick a= new chick();
        Class b = a.getClass();
        Method[] m = b.getMethods();
//        System.out.println(Arrays.toString(m));
        for (Method method : m) {
            //System.out.println(method);
            if (method.isAnnotationPresent(MyA.class)){
                try {
                    //System.out.println(method.getName());
                    method.invoke(a);
                } catch (IllegalAccessException e) {
                    System.out.println(e.getCause());
                } catch (InvocationTargetException e) {
                    System.out.println(e.getCause());
                }
            }
        }

    }
}
