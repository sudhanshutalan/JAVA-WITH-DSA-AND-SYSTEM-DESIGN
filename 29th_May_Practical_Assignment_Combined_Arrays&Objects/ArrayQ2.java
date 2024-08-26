// program to create an object of an class which contain a method and call that class method in main method.

import java.util.Scanner;
class Calculator{
    int res;

    //Method Decelaration
    int add(int a, int b){
        res = a+b;
        return res;
    }
}
public class ArrayQ2{
    public static void main(String[] args){
        //creating object of Scanner class
        Scanner sc = new Scanner(System.in);

        //creating object of Calculator class
        Calculator calc = new Calculator();

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        sc.close();

        //Method call. calling add method from Calculator class
        int sum = calc.add(num1,num2);
        System.out.println("The sum is: "+sum);

    }
}
