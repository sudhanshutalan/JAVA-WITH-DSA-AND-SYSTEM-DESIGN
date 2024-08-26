import java.util.*;
public class ArrayQ4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int arrsize = sc.nextInt();
        int arr[] = new int[arrsize];
        for(int i=0;i<arrsize;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();
        sc.close();

        System.out.println("Element "+ key +" found at index: "+ Arrays.binarySearch(arr, key));
        
    }
    
}
