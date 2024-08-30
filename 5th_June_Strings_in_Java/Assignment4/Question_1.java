// Write a simple string program to take input from a user

import java.util.Scanner;
public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sting: ");
        String s1 = sc.nextLine();
        System.out.println("Your entered String is: "+s1);
        sc.close();
    }
}
