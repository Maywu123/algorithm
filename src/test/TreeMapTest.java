package test;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest {

    public  static void main(String[] args){
        TreeMap<Student,Integer> map=new TreeMap<>(
                new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.age=o2.age;
                    }
                }
        );

        Student st1=new Student(1);
        Student st2=new Student(2);
        Student st3=new Student(3);
        Student st4=new Student(4);
        Student st5=new Student(5);

        map.put(st1,2);
        map.put(st1,4);
        map.put(st1,6);
        map.put(st1,8);
        map.put(st1,10);

        System.out.println(map);
        st1.age=100;

        System.out.println("-------------------------");
        System.out.println(map);
    }
}
