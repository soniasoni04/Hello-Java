package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Sonia ");
        var show = new Show();
        System.out.println(show.date());

        String name = show.string("Sonia Pathak");
        System.out.println(name);
        //System.out.println(name + "Pathak");
        //System.out.println(name.concat(" Pathak"));
//        String name1 = "Sonia";
//        String name2 = "SONIA";
//        System.out.println(name1==name2);
//        System.out.println(name1.equalsIgnoreCase(name2));
//        System.out.println(name1.compareTo(name2));
//        System.out.println(30+20+"sonia"+20+30);
//        System.out.println(name.charAt(0));

        StringBuilder sb=new StringBuilder("Hello");
        sb.reverse();
        System.out.println(sb);
        System.out.println(String.format("%s", "chacha"));

        //displaying the elements of the array

        int[] arrayList = new int[5]; //array if integer having length 5
        arrayList[0] = 1;
        arrayList[1]=2;
        arrayList[2]=3;

        System.out.println(Arrays.toString(arrayList));

        int[] arrayList1  = {11,22,33,44,55};
        System.out.println(Arrays.toString(arrayList1));


    }
}
