package main.java.by.rymtsov.lesson18;

import main.java.by.rymtsov.lesson18.service.ListOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * This is the application runner class.
 * Tasks
 * Task 1:
 * Create a collection of the ArrayList class and fill it with elements of random Integer type.
 * Using Streams:
 * - Remove duplicates
 * - Display all even elements in the range from 7 to 17 (inclusive)
 * - Multiply each element by 2
 * - Sort and display the first 4 elements
 * - Display the number of elements in the stream
 * - Display the arithmetic mean of all numbers in the stream
 * Task 2:
 * Create a collection of the ArrayList class with the values of the names of all students in the group
 * Using Streams:
 * - Select all names that begin with any letter entered from the console (regardless of upper/lower case)
 * - Sort and return the first element of the collection
 */

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        List<Integer> list = ListOperations.createRadnomList(size);
        ListOperations.outputList(list);
        ListOperations.deleteDuplicates(list);
        ListOperations.onlyOvenFrom7To17(list);
        ListOperations.multiplyAllElementsBy2(list);
        ListOperations.sortAndOutput4First(list);
        ListOperations.outputNumberOfElements(list);
        ListOperations.outputArithmeticMean(list);

        List<String> students = ListOperations.createListOfStudents();
        System.out.println(Arrays.toString(students.toArray()));
        System.out.print("Enter the letter: ");
        String letter = sc.next();
        ListOperations.outputNamesThatBeginsOnLetter(students, letter);
        ListOperations.sortAndOutputTheFirstName(students);
        sc.close();
    }
}
