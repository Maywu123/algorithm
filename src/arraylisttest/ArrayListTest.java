package arraylisttest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ArrayListTest {
    @Test
    public void test() {
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Person person = new Person();
                    person.setAge(finalI);
                    person.setName("name" + finalI);
                    personList.add(person);
                }
            }
            ).start();
        }

        try {
            TimeUnit.MILLISECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        print(personList);
    }


    public void print(List<Person> personList) {
        System.out.println(personList.size());
        personList.forEach(item -> {
            if (item == null) {
                System.out.println("值" + item);
            }
        });
    }

}
