package com.example.homework.model;

import java.util.Arrays;

public class ArrayComparator {


    public boolean compare(int tab1[], int tab2[]) {


        boolean result = true;


        if (tab1.length != tab2.length) return false;

        for (int i = 0; i < tab1.length; i++) {

                if (tab1[i] == tab2[i]) {

                    result = true;
                    break;

                } else {

                    result = false;

                }

            }


        return result;

    }
}

