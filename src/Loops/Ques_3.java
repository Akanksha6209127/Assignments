package Loops;
import java.util.Scanner;
public class Ques_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 , num2 ,  GCD = 0;
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        for(int i=1;i<=num1;i++)
        {
            if (num1 % i == 0 && num2 % i == 0) {
                GCD = i;
            }
        }
        System.out.println("GCD of " + num1 + " and " + num2 + " = " + GCD);

    }
}  // Write a program to find the GCD of two numbers using a loop.
