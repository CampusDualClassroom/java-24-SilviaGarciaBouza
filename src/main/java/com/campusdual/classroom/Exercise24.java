package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> myQueu = new LinkedList<>();
        myQueu.add("Smith");
        myQueu.add("Montessori");
        myQueu.add("Peralta");
        myQueu.add("House");
        return myQueu;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        while (queue.peek() != null) {
            String element = queue.poll();
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Queue<String> myQueu= createQueue();
        printAndEmptyQueue(myQueu);
        printAndEmptyQueue(myQueu);

    }

}
