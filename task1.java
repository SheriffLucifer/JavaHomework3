import java.util.ArrayList;
import java.util.List;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

public class task1 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        List<Integer> list = createList(10, 4, 10);
        System.out.println(list);
        deleteEvenNumbers(list);
        System.out.println(list);
    }

    static List<Integer> createList(int size, int min, int max) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        return list;
    }

    static void deleteEvenNumbers(List<Integer> list) {
        list.removeIf(i -> i % 2 == 0);
    }
}