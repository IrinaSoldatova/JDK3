package boxFruit;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits; // Список фруктов в коробке

    // Конструктор, инициализирующий список фруктов
    public Box() {
        fruits = new ArrayList<>();
    }

    // Метод для добавления фрукта в коробку
    public void addFruit(T fruit) {
        fruits.add(fruit); // Добавляем фрукт в список
    }

    // Метод для получения общего веса коробки
    public float getWeight() {
        float totalWeight = 0.0f;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight(); // Суммируем вес всех фруктов
        }
        return totalWeight; // Возвращаем общий вес
    }

    // Метод для сравнения веса текущей коробки с другой коробкой
    public boolean compare(Box<?> otherBox) {
        return this.getWeight() == otherBox.getWeight(); // Сравниваем веса
    }

    // Метод для пересыпания фруктов из одной коробки в другую
    public void transferFruitsTo(Box<T> anotherBox) {
        if (anotherBox == null) {
            return; // Если переданная коробка пустая, выходим
        }
        anotherBox.fruits.addAll(this.fruits); // Переносим фрукты
        this.fruits.clear(); // Очищаем текущую коробку
    }

    // Метод для получения количества фруктов (для отладки)
    public int getFruitCount() {
        return fruits.size();
    }

}
