package reflex;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class Check {


    public static String check(Object oldObj, Object newObj) {
        StringBuilder memo = new StringBuilder();
        Class<?> classA = oldObj.getClass();
        Class<?> classB = newObj.getClass();
        //1.先比较两个类型是否一样
        if (!(classA.isAssignableFrom(classB))) {
            System.out.println("传入的两个java对象类型不一致！");
        }
        //2.遍历取值
        Field[] declaredFields = classA.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            OperatorLog annotation = declaredField.getAnnotation(OperatorLog.class);
            if (annotation != null) {
                try {
                    Object o = declaredField.get(oldObj);
                    Object o1 = declaredField.get(newObj);
                    if (!o.equals(o1)) {
                        String memo1 = "将" + annotation.name() + "由【" + o + "】改为了【" + o1 + "】;";
                        memo.append(memo1);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return memo.toString();
    }

    public static void main(String[] args) {
        User us = new User();
        us.setName("123");
        us.setAge(11);
        User us1 = new User();
        us1.setName("321");
        us1.setAge(12);
        Check.check(us, us1);
    }
}
