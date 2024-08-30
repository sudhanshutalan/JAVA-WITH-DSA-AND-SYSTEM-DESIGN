//3.Write a java program to convert upper case to lower case and vice versa.
public class Question3 {
    public static void main(String[] args) {
		String S1 = "sudhanshu kr talan";
		String S2 = "";
		for (int i = 0; i < S1.length(); i++) {
			if ((S1.charAt(i) >= 'a') && (S1.charAt(i) <= 'z')) {
				S2 = S2 + (char) (S1.charAt(i) - 32);

			} else if ((S1.charAt(i) >= 'A') && (S1.charAt(i) <= 'Z')) {
				S2 = S2 + (char) (S1.charAt(i) + 32);

			}

		}
		System.out.println(S2);
	}

}
