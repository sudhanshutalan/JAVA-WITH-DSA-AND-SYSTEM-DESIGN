import java.util.Scanner;
public class Question_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scan.nextLine();
        int length = str.length();
        String rev="";
        for(int i =(length-1);i>=0;i--){
            rev = rev+str.charAt(i);
        }
        System.out.println("Reversed String is: "+rev);
        scan.close();
    }
}
