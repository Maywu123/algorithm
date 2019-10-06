package guava;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class TestIterator {

    @Test
    public void test() {
        List<Integer> list1 = Arrays.asList(0, 1, 2);
        List<Integer> list2 = Arrays.asList(3, 4);
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = Arrays.asList(5, 6, 7, 8, 9);

//        //需要导入guava的jar包，但是没有找到。。。
//        Iterable<Integer> iterable = Iterable.concat(list1, list2, list3, list4);
//        Iterator<Integer> iterator = iterable.iterator();
//
//        for (int i = 0; i < 10; i++) {
//            assertEquals(Integer.valueOf(i), iterator.next());
//        }
//        assertFalse(iterator.hasNext());
    }

}
