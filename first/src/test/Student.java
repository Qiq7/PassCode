package test;

public class Student {
    private int num;
    private String name;
    private String sex;
    void display(){
        System.out.println("("+this.toString()+")");
    }

    public Student(int num, String name, String sex) {
        this.num = num;
        this.name = name;
        this.sex = sex;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return ""+
                 num+","+
                  name+","+
                  sex
                ;
    }
}
