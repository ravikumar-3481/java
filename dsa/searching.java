import java.util.*;

public class searching {
    public static int binarySearch(int[] arr, int target) {
      Arrays.sort(arr);
      System.out.println("Array elements are: " + Arrays.toString(arr)); 
      int low = 0;
      int high = arr.length - 1;
      while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == target) {
          return mid;
        } else if (arr[mid] < target) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
      return -1;
    }

    public static void arrinput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " Element : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element to search: ");
        int target = sc.nextInt();
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
         sc.close();
      
    }

    public static void main(String[] args) {
        arrinput();
    }
}