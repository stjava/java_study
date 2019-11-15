package cls;

public class ClassTest {

    /**
     * 启动类加载器 Bootstrap ClassLoader
     * 拓展类加载器 Extension ClassLoader
     * 应用程序类加载器 Application ClassLoader
     *
     * @param args
     */
    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
    }
}
