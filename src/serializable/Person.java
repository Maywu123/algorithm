package serializable;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionID=1L;
    String name;
    int age;

    public Person(String name,int age){
        super();
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
