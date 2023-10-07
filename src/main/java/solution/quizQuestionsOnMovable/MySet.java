package solution.quizQuestionsOnMovable;

import java.util.*;

public class MySet {

    private static Set<String> staticSet = new TreeSet<>();

    public static void addWord(String s) {

        staticSet.add(s);

    }

    public static void printSet() {

        for (String s : staticSet) {

            System.out.print(s + " ");

        }

        System.out.println();

    }




    public static void main(String[] args) {

        MySet var1 = new MySet();

        MySet var2 = new MySet();

        var1.addWord("California");

        var2.addWord("Oregon");



        // Printing AFTER calling all the add methods:

        MySet.printSet();

        var1.printSet();

        var2.printSet();

    }

}
