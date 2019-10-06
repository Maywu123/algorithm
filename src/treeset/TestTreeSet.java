package treeset;

/**
 * treeSet要求存放的对象所属的类必须要实现Comparable接口，
 * 重些compareTo()方法。插入元素是会比较大小。
 */
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args){
        Set<Student> set = new TreeSet<>();

        set.add(new Student("haha", 20));
        set.add(new Student("may", 18));
        set.add(new Student("june", 30));
        set.add(new Student("lily", 60));

        for(Student st : set){
            System.out.println(st);
        }
    }
}
