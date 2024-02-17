package Loops;
import java.util.Scanner;
public class Ques_4 {
    public static void main(String[] args) {
        // Write a Java program to check if a given string is a palindrome or not using a loop.
        String s = new String();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to check palindrome: ");
        s = sc.nextLine();
        int i , j , flag ;
        i = 0;
        j = s.length() - 1;
        flag = 0;
        while(i <  j && flag == 0){
            if(s.charAt(i) != s.charAt(j))
                flag = 1;
            i += 1;  j -= 1;
        }
        if(flag == 0)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
