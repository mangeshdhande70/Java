package MethodReference;

import java.util.ArrayList;

public class Practice {


    public static void main(String[] args) {


        ArrayList<Integer> l = new ArrayList<>();

        l.add(45);
        l.add(33);
        l.add(23);


        l.forEach(System.out::println);


    }



}
