import java.math.BigInteger;
import java.util.Scanner;
import java.util.Timer;

public class Main {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int Partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) { // condition that decide sort ascending or descending
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void QuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = Partition(arr, low, high);
            QuickSort(arr, low, pi - 1);
            QuickSort(arr, pi + 1, high);
        }
    }
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        // task 7 : Quick Sort
        System.out.print("Enter Size of Array you want to sort it : ");
        int N = scan.nextInt();
        int array[] = new int[N];
        System.out.print("Enter Elements of Array : ");
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        QuickSort(array, 0, N - 1);
        System.out.print("Array after sorted : ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
