
import java.util.Scanner;

class ArrayElementAccessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter index (0 to " + (n-1) + "): ");
        int index = sc.nextInt();
        
        if (index >= 0 && index < n) {
            System.out.println("Element at index " + index + " = " + arr[index]);
        } else {
            System.out.println("Invalid index!");
        }
        
        sc.close();
    }
}