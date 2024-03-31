package org.example;
import java.util.Arrays;
import java.util.Random;

import static org.example.BubbleSort.bubbleSort;
import static org.example.InsertSort.insertionSort;
import static org.example.SelectSort.selectSortAscending;



public class Main {
    public static void main(String[] args) {
        int totalArr;
        int totalBub;
        int totalIns;
        int totalAsc;
        int length = 100;
        int range = 10000;    // не включая десять косых, только < пятизначных
        int[] array = new int[length];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(range);
        }


        long startTime = System.currentTimeMillis();
        Arrays.sort(array);
        long endTime = System.currentTimeMillis();
        totalArr = (int) (endTime-startTime);
        System.out.println(totalArr);


        startTime = System.currentTimeMillis();
        bubbleSort(array);
        endTime = System.currentTimeMillis();
        totalBub = (int) (endTime-startTime);
        System.out.println(totalBub);


        startTime = System.currentTimeMillis();
        insertionSort(array);
        endTime = System.currentTimeMillis();
        totalIns = (int) (endTime-startTime);
        System.out.println(totalIns);


        startTime = System.currentTimeMillis();
        selectSortAscending(array);
        endTime = System.currentTimeMillis();
        totalAsc = (int) (endTime-startTime);
        System.out.println(totalAsc);
        System.out.println("Sorted array: " + Arrays.toString(array));

    }

}


