
import java.util.Arrays;
class Question_4 {
    static void sortString(String str) {
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
}
public static void main(String[] args) {
    String s = "aabbzzncedt";
    sortString(s);
    }
}