package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTest {

    public static void main(String[] args) {
        //线程不安全
        HashMap map = new HashMap();
        //线程安全
        Hashtable hashtable = new Hashtable();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeMap treeMap = new TreeMap();

    }
}
