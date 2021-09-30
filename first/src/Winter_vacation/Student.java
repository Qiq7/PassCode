package Winter_vacation;

public class Student {
    private String name;
    private int age;
    public Student(String name,int age)
    {
        this.age=age;
        this.name=name;
    }
    public Student(){};
    public void study()
    {
        System.out.println(name+"在学习。。。。。");
    }
    public void study(String object)
    {
        System.out.println(name+"正在学习"+object);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
