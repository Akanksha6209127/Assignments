package Loops;
import java.util.Scanner;
public class Ques_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 10 , sum = 0;
        for(int i=1;i<=n;i++) {
            sum = sum + i;
        }
        System.out.println("Sum of 10 natural number is = " + sum);
    }
}  // Write a java program to calculate the sum of natural numbers up to a given positive integer 'n'.
