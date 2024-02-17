package Loops;
import java.util.Scanner;
public class Ques_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.print(n*i + " ");
        }
    }  // Write a program to print a multiplication table for a given number 'n'.
}
