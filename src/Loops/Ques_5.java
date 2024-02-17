package Loops;
import java.util.Scanner;
public class Ques_5 {
    public static void main(String[] args) {
        // Write a program to generate and print the first 'n' terms of the Fibonacci series.
        Scanner sc = new Scanner(System.in);
        int x = 0 , y = 1 , z = 0 , n;
        System.out.print("Enter Max value: ");
        n = sc.nextInt();
        while(z <= n) {
            System.out.print(z + " ");
            x = y;
            y = z;
            z = x + y;
        }
    }
}
