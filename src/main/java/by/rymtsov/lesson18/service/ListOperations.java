package main.java.by.rymtsov.lesson18.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class contains methods that do
 * operations with lists.
 */

public class ListOperations {

    public static void deleteDuplicates(List<Integer> list) {
        Stream<Integer> stream = list.stream();
        System.out.println(stream.distinct()
                .collect(Collectors.toList()));
    }

    public static void onlyOvenFrom7To17(List<Integer> list) {
        Stream<Integer> stream = list.stream();
        System.out.println(stream.skip(6)
                .limit(11)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList()));
    }

    public static void multiplyAllElementsBy2(List<Integer> list) {
        Stream<Integer> stream = list.stream();
        System.out.println(stream.map(n -> n * 2)
                .collect(Collectors.toList()));
    }

    public static void sortAndOutput4First(List<Integer> list) {
        Stream<Integer> stream = list.stream();
        System.out.println(stream.sorted()
                .limit(4)
                .collect(Collectors.toList()));
    }

    public static void outputNumberOfElements(List<Integer> list) {
        Stream<Integer> stream = list.stream();
        System.out.println(stream.count());
    }

    public static void outputArithmeticMean(List<Integer> list) {
        Stream<Integer> stream = list.stream();
        System.out.println(stream.mapToInt(Integer::intValue)
                .average()
                .getAsDouble());
    }

    public static void outputNamesThatBeginsOnLetter(List<String> list, String letter) {
        Stream<String> stream = list.stream();
        System.out.println(stream.filter(n -> n.toLowerCase()
                .startsWith(letter.toLowerCase()))
                .collect(Collectors.toList()));
    }

    public static void sortAndOutputTheFirstName(List<String> list) {
        Stream<String> stream = list.stream();
        System.out.println(stream.sorted()
                .limit(1)
                .collect(Collectors.toList()));
    }

    public static List<Integer> createRadnomList(int n) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add((int) (Math.random() * 10) + 1);
        }
        return list;
    }

    public static List<String> createListOfStudents() {
        List<String> students = new ArrayList<>();
        students.add("Ilya");
        students.add("Kate");
        students.add("Sultan");
        students.add("Marina");
        students.add("Sergey");
        students.add("Rita");
        students.add("Kirill");
        students.add("Dmitry");
        students.add("Daniil");
        students.add("Kirill");
        students.add("Oleg");
        students.add("Vlad");
        students.add("Igor");
        students.add("Dmitry");
        return students;
    }

    public static void outputList(List<Integer> list) {
        System.out.println(Arrays.toString(list.toArray()));
    }
}
