package HomeWork7;

import java.util.Scanner;



public class Winter extends Object{

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] i1 = {1};
//        System.out.println(i1);
//
//        String s1 = "Hello Java!";
//        String s2 = "Hello ";
//        s2 += "Java!";
//
//        String s3 = scanner.nextLine();
//
//        String s4 = "Hello Java!";
//
//        System.out.println("S1: " + s1);
//        System.out.println("S2: " + s2);
//        System.out.println("S3: " + s3);
//        System.out.println("S4: " + s4);
//        System.out.println("********");
//        System.out.println("S1 == S2 > " + (s1 == s2));
//        System.out.println("S1 == S3 > " + (s1 == s3));
//        System.out.println("S1 == S4 > " + (s1 == s4));
//        System.out.println("********");
//        System.out.println("S1 == S2 > " + (s1.equals(s2)));
//        System.out.println("S1 == S3 > " + (s1.equals(s3)));
//        System.out.println("S1 == S4 > " + (s1.equals(s4)));

        String test1 = "Test";
        StringBuilder stringBuilder = new StringBuilder("Test");

        long startTime = System.nanoTime(); //typeUnixTime

        for (int i = 0; i < 100000; i++) {
            test1 += i; //Test0123456789...99999
        }

        float finishTime = System.nanoTime() - startTime;

        System.out.println(test1);
        System.out.println("Time last string: " + finishTime * 0.000001f + " millisec.");

        startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(i); //Test0123456789...99999
        }

        finishTime = System.nanoTime() - startTime;
        System.out.println(stringBuilder.toString());
        System.out.println("Time last stringBuilder: " + finishTime * 0.000001f + " millisec.");
        System.out.println(test1.equals(stringBuilder.toString()));



    }
}

