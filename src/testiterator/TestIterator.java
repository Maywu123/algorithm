package testiterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式，提供一种方法遍历容器中的元素，但是却不暴露其内部细节。
 */


interface Iterator{
    Object next();
    boolean hasNext();
}

class ConcreteIterator implements Iterator {
    private List list = new ArrayList();
    private int index = 0;

    public ConcreteIterator(List list) {
        this.list = list;
    }

    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = this.list.get(index++);//指针指向下一个
        }
        return obj;
    }

    public boolean hasNext() {
        if (index == list.size()) {
            return false;
        }
        return true;
    }
}

interface Aggregate{
    void add(Object obj);
    void remove(Object obj);
    Iterator iterator();
}

class ConcreteAggregate implements Aggregate{
    private List list = new ArrayList();

    public void add(Object obj){
        list.add(obj);
    }

    public void remove(Object obj){
        list.remove(obj);
    }

    public Iterator iterator(){
        return new ConcreteIterator(list);
    }
}

public class TestIterator {
    public static void main(String[] args){
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("小明");
        aggregate.add("小红");
        aggregate.add("小李");
        Iterator it = aggregate.iterator();
        while (it.hasNext()){
            String str = (String)it.next();
            System.out.println(str);
        }

    }
}
