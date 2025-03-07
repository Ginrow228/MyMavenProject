package org.example;

public class MathUtils {

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал не определён для отрицательных чисел");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static double sqrt(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Невозможно вычислить корень из отрицательного числа");
        }
        return Math.sqrt(number);
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль запрещено");
        }
        return a / b;
    }

    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
