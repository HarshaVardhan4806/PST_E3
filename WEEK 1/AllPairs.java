import java.util.Scanner;

class AllPairs {
    public static void printAllPairs(int[] arr) {
        System.out.println("All possible pairs:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("(%d, %d)  ", arr[i], arr[j]);
            }
            System.out.println();
        }
    }

    // Bonus: Print unique unordered pairs (i <= j)
    public static void printUniquePairs(int[] arr) {
        System.out.println("\nAll unique unordered pairs:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.printf("(%d, %d)  ", arr[i], arr[j]);
            }
        }
        System.out.println();
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
        
        printAllPairs(arr);
        printUniquePairs(arr);
        
        sc.close();
    }
}