// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее 
// арифметическое из этого списка. Collections.max()

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class task2 {
    public static void main(String[] args) {
        ex2();
    }

    static void ex2() {
        List<Integer> list = createList(10, 1, 50);
        System.out.println(list);

        int min = Collections.min(list);
        int max = Collections.max(list);
        double average = list.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
        System.out.println("Arithmetic mean: " + average);
    }

    static List<Integer> createList(int size, int min, int max) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        return list;
    }
}
