package javaxm3.sbww;

/*
泛型类
语法：类名<T>
T为类型可以多个用，隔开

* */
public class MyGeneric<T> {

    T t;
    public void  show(T t)
    {
        //T不能new对象（不能实列化）
        System.out.println(t);
    }

    public T getT() {
        return t;
    }
}
