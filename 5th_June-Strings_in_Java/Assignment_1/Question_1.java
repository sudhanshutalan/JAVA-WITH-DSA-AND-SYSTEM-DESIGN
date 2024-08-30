//1.Write a java program to Reverse a string without using the inbuilt method.
public class Question_1 {
	public static void main(String[] args) {
		String name = "Sudhanshu";
		String rev="";

		for (int i = name.length() - 1; i >=0; i--) {
			char chaar = name.charAt(i);
			rev = rev + chaar;
		}
		System.out.println(rev);
	}
}
