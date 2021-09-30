package javaxm3.sbww;

public class People {
    private int Age;

    public People(int age) throws AgeException{
        if(age<120&&age>0)
        {
            Age = age;
        }else{
            throw new AgeException("hhh");
        }
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) throws AgeException{
        if(age>120||age<0)
        {
            throw new AgeException("hhh");
        }
        else{
            Age = age;
        }
    }

    @Override
    public String toString() {
        return "People{" +
                "Age=" + Age +
                '}';
    }
}
