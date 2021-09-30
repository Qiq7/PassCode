package Winter_vacation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class demo01 {
    public static class Person{
        private String name;
        private int age;
        Person(String name,int age)
        {
            this.name=name;
            this.age=age;
        }
        public void eat()
        {
            System.out.println("hhhh");
        }
    }
    public static void main(String[] args) throws Exception {
        //Person p=new Person("xiao",15);
        //三种获取类对象
//        Class a1=p.getClass();
//        Class a2=Person.class;
//        Class a3=Class.forName("Winter_vacation.demo01");
//        System.out.println(a1.hashCode()+"  "+a2.hashCode()+"  "+a3.hashCode());
        //反射
//        Class a4=Class.forName("javaxm3.sbww.MyLeetCode0040");
//        System.out.println(a4.getName()+"\n  "+a4.getPackageName()+"\n "+a4.getSuperclass().getName());
        f1();
    }
    public static void f1 ()throws Exception
    {
        Class a=Class.forName("Winter_vacation.Student");
//        Constructor[] b=a.getConstructors();
//        for (Constructor c:b) {
//            System.out.println(c.toString());
//        }
//        Constructor c=a.getConstructor();
//        Student p=(Student) c.newInstance();
//        System.out.println(p.toString());
//        Constructor c1=a.getConstructor(String.class,int.class);
//        Student p1=(Student)c1.newInstance("xiaoming",20);
//        Student p2= (Student) a.newInstance();
//        System.out.println(p1.toString());
//        System.out.println(p2.toString());
                    //a.getMethods()所有公开方法
        Method[] m0=a.getDeclaredMethods();//所有声明的方法
        for (Method m:m0) {
            System.out.println(m.toString());
        }
        Method m1=a.getMethod("study");
        m1.invoke(a.newInstance());

    }
}
