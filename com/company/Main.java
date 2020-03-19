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

        //multidimensional array

        int[][] numbersArray = new int[2][3];
        numbersArray[0][0]=1;
        numbersArray[0][1]=22;
        numbersArray[1][2]=88;
        System.out.println(Arrays.deepToString(numbersArray));

        int [][] numberArray1 = {{1,33,44}, {2222,4444}};
        System.out.println(Arrays.deepToString(numberArray1));


        // Constants
        // constant values are always suppose to be written in the capital with final keyword;
        final float PI = 3.14F;
        System.out.println(PI);

        // Arithmetic expressions

        int num1 = 10;
        int num2 = 3;

        double result1 = num1/num2;
        double result2 = (double)num1/num2;
        System.out.println("result with out converting the data type  " + result1);
        System.out.println("result with converting the data type  " + result2);



    }
}
