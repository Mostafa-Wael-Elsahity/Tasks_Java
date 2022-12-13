import java.math.BigInteger;
import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // task 4 : Transpose Array
        System.out.print("Enter dimension of Array NxM : ");
        int N=scan.nextInt(),M=scan.nextInt();
        int array[][] = new int[N][M];
        int TransposedArray[][] = new int[M][N];
        System.out.println("Enter Elements of Array : ");
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                array[i][j]=scan.nextInt();
                TransposedArray[j][i]=array[i][j];
            }
        }
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                System.out.print(TransposedArray[i][j]+" ");
            }
            System.out.println();
        }
    }

}
