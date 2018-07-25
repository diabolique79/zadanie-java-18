package com.example.homework.model;

import java.util.Arrays;

public class ArrayComparator {


    public boolean compare(int tab1[], int tab2[]) {

        boolean result = true;


        for (int i = 0; i < tab1.length; i++) {

            for (int j = 0; j < tab2.length; j++) {

                if (tab1[i] == tab2[j]) {

                    result = true;
                } else {

                    result = false;
                }

            }

        }
        return result;

    }
}

