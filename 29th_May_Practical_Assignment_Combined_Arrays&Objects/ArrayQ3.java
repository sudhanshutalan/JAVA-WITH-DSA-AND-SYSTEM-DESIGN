//program to calculate sum all elements in an integer array

import java.util.Scanner;
public class ArrayQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int arrsize = sc.nextInt();
        int sum=0;
        System.out.println("Enter elements of an Integer Array: ");
        int arr[] = new int[arrsize];

        for(int i=0;i<arrsize;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("The Entered Array is: ");
        for(int k : arr){
            System.out.print(k+" ");
        }
        System.out.println();
        for(int j=0;j<arr.length;j++){
            sum = sum+arr[j];
        }
            System.out.println("The sum of an Integer array is: " +sum);
    }
}
