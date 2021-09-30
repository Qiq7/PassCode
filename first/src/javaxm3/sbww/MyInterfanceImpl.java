package javaxm3.sbww;

public class MyInterfanceImpl implements MyInterface<String>{

    @Override
    public String server(String s) {
        System.out.println(s);
        return s;
    }
}
