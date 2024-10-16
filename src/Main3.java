//3 KISS Abstract
class Calculator {
    public void add(int a, int b) {
        System.out.println(a + b);
    }
}


public class Main3 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.add(5,6);

    }
}
