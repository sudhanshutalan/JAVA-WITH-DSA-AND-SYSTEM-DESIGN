
public class Question_1 {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("Hello");
        StringBuilder str2 = new StringBuilder("Kapil");

        System.out.println("Value of str1 before change: "+str1);
        System.out.println("Value of str2 before change: "+str2);

        str1.append(" World!");
        str2.append(" Dev");

        System.out.println("Value of str2 after change: "+str1);
        System.out.println("Value of str2 after change: "+str2);

    }
}
