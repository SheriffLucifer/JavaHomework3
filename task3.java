// Заполнить список названиями планет Солнечной системы в произвольном порядке 
// с повторениями. Вывести название каждой планеты и количество его повторений в списке.

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class task3 {
    public static void main(String[] args) {
        ex2();
    }

    static void ex2() {
        List<String> list = createList();
        System.out.println(list);

        Map<String, Long> frequency = list.stream().collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()));

        frequency.forEach((k, v) -> System.out.println(k + ": " + v));

    }

    static List<String> createList() {
        List<String> list = new ArrayList<>();
        list.add("Mercury");
        list.add("Venus");
        list.add("Jupiter");
        list.add("Neptune");
        list.add("Mercury");
        list.add("Saturn");
        list.add("Mercury");
        list.add("Earth");
        list.add("Neptune");
        list.add("Uranus");
        list.add("Mars");
        list.add("Jupiter");
        list.add("Mars");
        list.add("Venus");
        return list;
    }
}
