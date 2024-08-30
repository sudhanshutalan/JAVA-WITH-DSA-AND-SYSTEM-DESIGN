//5.Write a java program to find the index of a substring.
public class Question5 {
    public static void main(String[] args) {
        String strOrig = "Indian Institute Of Technology";
        int intIndex = strOrig.indexOf("Institute");
        
        if(intIndex == - 1) {
           System.out.println("Not found");
        } else {
           System.out.println("Found at index " + intIndex);
        }
     }
}
