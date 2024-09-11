package tasks.task02;

/**
 * Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
 * если они одинаковые, и false в противном случае.
 * Массивы могут быть любого типа данных, но должны иметь одинаковую длину и
 * содержать элементы одного типа по парно по индексам.
 */
public class CompareArrays {
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Integer[] intArray1 = {1, 2, 3, 4, 5};
        Integer[] intArray2 = {1, 2, 3, 4, 5};
        Integer[] intArray3 = {1, 2, 3, 4, 6};

        System.out.println(compareArrays(intArray1, intArray2));
        System.out.println(compareArrays(intArray1, intArray3));

        String[] stringArray1 = {"one", "two", "three"};
        String[] stringArray2 = {"one", "two", "three"};
        String[] stringArray3 = {"one", "two", "four"};

        System.out.println(compareArrays(stringArray1, stringArray2));
        System.out.println(compareArrays(stringArray1, stringArray3));
    }
}
