import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строки:");
        String input = scanner.nextLine();
        //cтроки нужно вводить через пробел
        
        List<String> strings = Arrays.asList(input.split(" "));

        // Сортировка по возрастанию
        List<String> ascendingOrder = strings.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Сортировка по возрастанию:");
        ascendingOrder.forEach(System.out::println);

        // Сортировка по убыванию
        List<String> descendingOrder = strings.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());

        System.out.println("Сортировка по убыванию:");
        descendingOrder.forEach(System.out::println);
    }
}
