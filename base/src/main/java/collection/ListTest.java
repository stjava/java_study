package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {

    public static void main(String[] args) {
        //数组实现，便于查找，不适合插入删除
//        ArrayList arrayList = new ArrayList();
//        arrayList.add(1);
//        arrayList.size();
//        //链表实现，便于
//        LinkedList linkedList = new LinkedList();
//        linkedList.add(1);
//
//        Vector vector = new Vector();
//
//        Integer num1 = new Integer(1);
//        int h1 = num1.hashCode();
//        Integer num2 = new Integer(1);
//        int h2 = num2.hashCode();
//        System.out.println(h1);
//        System.out.println(h2);
        ListTest listTest = new ListTest();

        listTest.test1();
    }


    public void test1() {
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer item : list) {
            if (item % 2 == 1) {
                list.remove(item);
            }
        }

        System.out.println(list);


    }
}
