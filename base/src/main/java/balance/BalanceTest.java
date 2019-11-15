//package balance;
//
//import java.util.*;
//
//public class BalanceTest {
//
//    // 服务器清单
////    public static final List<String> LIST = new ArrayList<>();
//    // 带有权重值的服务器清单
//    public static final Map<String, Integer> WEIGHT_LIST = new HashMap<>();
//    // 带有当前服务器活跃数的服务器清单
//    public static final Map<String, Integer> ACTIVITY_LIST = new LinkedHashMap<>();
//
//    static {
//        LIST.add("192.168.1.1");
//        LIST.add("192.168.1.2");
//        LIST.add("192.168.1.3");
//
//
//        WEIGHT_LIST.put("192.168.1.1", 9);
//        WEIGHT_LIST.put("192.168.1.2", 1);
//        WEIGHT_LIST.put("192.168.1.3", 8);
//
//
//        ACTIVITY_LIST.put("192.168.1.1", 2);
//        ACTIVITY_LIST.put("192.168.1.2", 0);
//        ACTIVITY_LIST.put("192.168.1.3", 1);
//
//    }
//
//
//    public static String getServer() {
//        Random random = new Random();
//        int pos = random.nextInt(LIST.size());
//        return LIST.get(pos);
//    }
//
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            String server = BalanceTest.getServer();
//            System.out.println(server);
//        }
//
//
//
//    }
//
//
//}
