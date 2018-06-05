package com.company;

import java.util.HashSet;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashSet<String> name = new HashSet<String>();
        name.add("pratik");
        name.add("kabin");
        name.add("diwakar");
        name.add("ujwal");

        Random key = new Random();
        int ran = key.nextInt(name.size());
        String [] n = new String[name.size()] ;
        int j =0;
        for (String i : name)
        {
            n[j] =i;
            j++;
        }
        System.out.println(n[ran]);

    }
}
