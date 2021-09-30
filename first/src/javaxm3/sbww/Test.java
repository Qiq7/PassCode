package javaxm3.sbww;

public class Test {
    public static void main(String[] args) {
        MyGeneric<String> myGerneric = new MyGeneric<String>();
        myGerneric.t = "hello";
        myGerneric.show("大家好");
        String s = myGerneric.getT();
        System.out.println(s);
    //泛型对象只能使用引用类型、泛型对象之间不能相互赋值
        MyInterface imp = new MyInterfanceImpl();
        MyInterface imp2 = new MyInterfanceImpl();
        imp2 =imp;
        System.out.println(imp2);
        imp.server("hhh");
        MyInterfaceImpl2<Integer> q =new MyInterfaceImpl2<Integer>();
        q.server(123123);
        //调用泛型方法
        System.out.println("--------------------------------");
        MyGenericMethod m=new MyGenericMethod();
        m.show(120);
        System.out.println(m.show("hhh"));

    }
}
