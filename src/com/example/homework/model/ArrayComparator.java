package com.example.homework.model;

import java.util.Arrays;

public class ArrayComparator {



    public boolean compare(int tab1[], int tab2[]) {


        if (tab1.length == tab2.length && Arrays.equals(tab1,tab2)==true){

            return true;
        }
        else

            return false;



    }


    }

