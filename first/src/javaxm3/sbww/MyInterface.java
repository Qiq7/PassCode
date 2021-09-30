package javaxm3.sbww;
//泛型接口、不能创建泛型静态常量
public interface MyInterface<T> {
    String name ="张三";
    T server(T t);
}
