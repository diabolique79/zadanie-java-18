package com.example.homework.app;

import com.example.homework.model.ArrayComparator;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość elementów w tablicy 1: ");
        int w = scanner.nextInt();
        int[] tab1 = new int[w];


        Random random = new Random();

        for (int i = 0; i < tab1.length; i++) {

            //tab1[i]=i+1;
            tab1[i] = random.nextInt(50);
            System.out.println(tab1[i]);
        }

        System.out.println("Podaj ilość elementów w tablicy 2: ");
        int k = scanner.nextInt();
        int[] tab2 = new int[k];
        for (int i = 0; i < tab2.length; i++) {

            //tab2[i]=i+1;
            tab2[i] = random.nextInt(50);
            System.out.println(tab2[i]);
        }

        ArrayComparator arrayComparator = new ArrayComparator();
        System.out.println(arrayComparator.compare(tab1, tab2));


    }


}

