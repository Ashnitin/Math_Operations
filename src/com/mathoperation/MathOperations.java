package com.mathoperation;

import java.util.Scanner;

@FunctionalInterface
interface IMathFuction{
    int calculate(int a,int b);
}
public class MathOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice: \n1)Addition\n2)Subsraction\n3)Division");
        int ch =sc.nextInt();
        switch (ch) {
            case 1:
                IMathFuction add = (x, y) -> x + y;
                System.out.println("Addition is: " + add.calculate(8, 4));
                break;
            case 2:
                IMathFuction sub=(x,y)->x-y;
                System.out.println("Substraction is: "+sub.calculate(5,4));
                break;
            case 3:
                IMathFuction div=(x,y)->x/y;
                System.out.println("Division is: "+div.calculate(10,5));
                break;
        }
    }
}
