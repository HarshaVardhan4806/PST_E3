import java.util.Arrays;
import java.util.Scanner;

class KthSmallest {
    public static int findKthSmallest(int[] arr, int k) {
        if (k < 1 || k > arr.length) {
            return -1; // invalid k
        }
        
        // Create copy to avoid modifying original
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        
        return copy[k - 1]; // 1-based k → 0-based index
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter value of K: ");
        int k = sc.nextInt();
        
        int result = findKthSmallest(arr, k);
        if (result != -1) {
            System.out.println(k + "th smallest element = " + result);
        } else {
            System.out.println("Invalid K value");
        }
        
        sc.close();
    }
}