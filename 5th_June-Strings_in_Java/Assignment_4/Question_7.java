//Q7. Write a program to delete all consonants from the string "Hello, have a good day".
import java.util.Scanner;
class Test{
    String remVowel(String str){
        return str.replaceAll("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]","");
    }
}

public class Question_7{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Test obj = new Test();
        System.out.print("Enter a Word or Sentence: ");
        String str = scan.nextLine();
        String res = obj.remVowel(str);
        System.out.println("String after removing consonents: "+res);
        scan.close();
    }
}












//program to remove vowel from a String


// import java.util.Scanner;
// public class Question_7 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a Word or a Sentence: ");
//         String str = sc.nextLine();
//         char s;
//         sc.close();
//         for(int i=0;i<str.length();i++){
//             s=str.charAt(i);
//             if(s=='A'||s=='E'||s=='I'||s=='O'||s=='U'||s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
//                 continue;
//             }else{
//                 System.out.print(s);
//             }

//         }
//     }
// }
