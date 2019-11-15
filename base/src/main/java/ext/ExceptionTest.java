package ext;

public class ExceptionTest {


    /**
     * 会先执行try 内代码，
     * 如果出现异常。执行catch 内代码
     * 然后一定执行finally内代码
     *
     * @param args
     */
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();
        System.out.println(exceptionTest.test());
    }

    private int test() {
        try {
            System.out.println(1);
            return 10;
        } catch (Exception e) {
            return 11;
        } finally {
            System.out.println(2);
        }
    }
}
