import java.math.BigInteger;
import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        // task 3 : maximum number in array
        System.out.print("Enter size of Array : ");
        int sizeOfArray = scan.nextInt();
        int arr[] = new int[sizeOfArray];
        int maxElementInArray = 0, positionMax = -1;
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = scan.nextInt();
            if (i == 0) maxElementInArray = arr[0];
            // there is a new value greater than I have
            if (maxElementInArray < arr[i]) {
                maxElementInArray = arr[i];
                positionMax = i;
            }
        }
        System.out.println("Max Element in Array is "+maxElementInArray+" and it's position is "+(positionMax+1));
    }

}
