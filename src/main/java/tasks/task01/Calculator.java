package tasks.task01;

/**
 * Написать класс Калькулятор (необобщенный),
 * который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
 * Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
 * Методы должны возвращать результат своей работы.
 */
public class Calculator {
    public static <T extends Number, U extends Number> double sum(T a, U b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, U extends Number> double multiply(T a, U b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, U extends Number> double divide(T a, U b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException();
        }
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number, U extends Number> double subtract(T a, U b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static void main(String[] args) {
        int x = 10;
        double y = 5.0;
        float z = 2.0f;

        System.out.println("Sum: " + sum(y, z));
        System.out.println("Multiply: " + multiply(x, y));
        System.out.println("Divide:" + divide(x,z));
        System.out.println("Subtract: " + subtract(y, z));
    }
}
