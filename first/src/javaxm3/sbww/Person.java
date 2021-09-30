package javaxm3.sbww;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
      @Override
          public int hashCode() {
          return this.name.hashCode()+this.age;
      }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        if (person.name.equals(this.name)&&person.age==this.age)
            return true;
        return false;
    }

    @Override
    public int compareTo(Person o) {
        int n1 = this.age-o.getAge();
        int n2 =this.name.compareTo(o.getName());
        return n1 ==0?n2:n1;
    }
}
