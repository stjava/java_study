package cls;

import java.lang.reflect.ParameterizedType;

public class ClsRef {

    /**
     * 获取名称
     */
    public void getCName() {
        String name = ((Class) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getSimpleName();
        System.out.println(name);
    }

    public static void main(String[] args) {
        ClsRef clsRef = new ClsRef();
        clsRef.getCName();

    }
}
