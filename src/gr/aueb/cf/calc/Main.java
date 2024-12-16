package gr.aueb.cf.calc;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int div(int a, int b) throws ArithmeticException {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.err.println("Error. Divide by zero" + Arrays.toString(e.getStackTrace()));
            throw e;
        }
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }
}
