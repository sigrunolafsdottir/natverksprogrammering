package ExceptionDemo;


public class TestException extends Exception {

    public String s = new String();

    public TestException(String s) {
        this.s = s;
    }
}
