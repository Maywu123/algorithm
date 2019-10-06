package randomset;

import java.util.*;

//实现一个数据结构，是插入x、删除x、任意获取x的复杂度都为O(1)
public class RandomSet<E> {

        List<E> data = new ArrayList<E>();
        Map<E, Integer> index = new HashMap<E, Integer>();

        public boolean add(E item) {
            if (index.containsKey(item)) {
                return false;
            }
            index.put(item, data.size());
            data.add(item);
            return true;
        }

        public E removeAt(int id) {
            if (id >= data.size()) {
                return null;
            }
            E res = data.get(id);
            index.remove(res);
            E last = data.remove(data.size() - 1);
            // skip filling the hole if last is removed
            if (id < data.size()) {
                index.put(last, id);
                data.set(id, last);
            }
            return res;
        }

        public boolean remove(E item) {
            Integer id = index.get(item);//得到value，就是下标
            if (id == null) {
                return false;
            }
            removeAt(id);
            return true;
        }

        public E random(Random rnd) {
            if (data.isEmpty()) {
                return null;
            }
            int id = rnd.nextInt(data.size());
            return removeAt(id);
        }

        public static void main(String[] args){
            RandomSet randomSet=new RandomSet();
            randomSet.add(1);
            randomSet.add(2);
            randomSet.add(3);
            randomSet.add(4);
            System.out.println(randomSet);

            randomSet.remove(3);
            System.out.println(randomSet);


        }
}
