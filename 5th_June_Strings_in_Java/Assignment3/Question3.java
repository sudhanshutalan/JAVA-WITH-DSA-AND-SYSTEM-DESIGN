//WAP to reverse a sentence while preserving the position
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String str = sc.nextLine();
        int length = str.length();
        String rev ="";
        for(int i=length-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        // System.out.println(rev);

        //using split() method
        String[] arr = rev.split(" ");
        System.out.println("Reversed Sentence: ");
        for(int j=arr.length-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        sc.close();
    }
}
