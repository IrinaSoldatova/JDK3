package boxFruit;

public class Main {
    public static void main(String[] args) {
        // Создаем коробку с яблоками
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        // Создаем коробку с апельсинами
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());

        // Выводим вес коробок
        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight()); // 2.0
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight()); // 1.5

        // Сравниваем вес коробок
        System.out.println("Сравнение весов: " + appleBox.compare(orangeBox)); // false

        // Пересыпаем яблоки в другую коробку
        Box<Apple> anotherAppleBox = new Box<>();
        appleBox.transferFruitsTo(anotherAppleBox);
        System.out.println("Яблоки после пересыпания: " + appleBox.getFruitCount()); // 0
        System.out.println("Яблоки в новой коробке: " + anotherAppleBox.getFruitCount()); //2
    }
}
/**
 * 1. **Интерфейс Fruit**: Содержит метод `getWeight()`,
 * который реализуется в классах-фруктах.
 *
 * 2. **Классы Apple и Orange**: Реализуют интерфейс Fruit и
 * возвращают соответствующий вес для яблока и апельсина.
 *
 * 3. **Класс Box**:
 *
 *    - Использует обобщения (`<T extends Fruit>`) для того,
 *    чтобы принимать фрукты определенного типа.
 *
 *    - Метод `addFruit()` добавляет фрукты в коробку.
 *
 *    - Метод `getWeight()` рассчитывает общий вес коробки на основе весов фруктов.
 *
 *    - Метод `compare()` позволяет сравнить вес текущей коробки с другой коробкой.
 *
 *    - Метод `transferFruitsTo()` пересыпает фрукты из одной коробки в другую.
 *    При этом учитывается, что нельзя пересыпать яблоки
 */