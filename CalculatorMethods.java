import com.sun.deploy.security.SelectableSecurityManager;

public class CalculatorMethods {


    public static int summ(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    // ВОТ ЭТО ЗАДАНИЕ
    public void

    boolean RomanianCNP(String id) { // void or static?
        String id1 = id1.toCharArray();
        for (int i = 0; i < id1.length(); i++) {
            if (i < 10) {// проверяю длину массива, инн сот. из 11 цифр
                System.out.println("Invalid Romanian CNP"); // или если метод static return 0;
            }
            char [0] =int c; // обратиться с 0(т.е. к 1 числу) элементу массива?
            if (c == 0) {
                System.out.println("Invalid Romanian CNP"); // или если метод static return 0;
            } else if ( char [10] ==0){ // обратиться к 10 (т.е. к одинадцатому числу)
                System.out.println("Invalid Romanian CNP"); // или если метод static, return 0;
            } else{
                System.out.println("Valid Romanian CNP"); // или если метод static, return 1;
            }

        }

    }


}
