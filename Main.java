import java.math.BigInteger;
import java.util.Scanner;
import java.util.Timer;

class Circle {
    private double radius;

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return radius * radius * 3.14;
    }

    double getSurrounding() {
        return 2 * 3.14 * radius;
    }
}

class Triangle {
    int a=0, b=0, c=0;
    void setSides(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    int []getSides(){
        int sides[]={a,b,c};
        return sides;
    }
    double getArea(){
        double semi=(a+b+c)/2.0;
        return Math.sqrt(semi*(semi-a)*(semi-b)*(semi-c));
    }
    int getSurrounding(){
        return a+b+c;
    }
}

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
        //task 1 : ascii code
//        System.out.print("Please Enter ascii code : ");
//        int asciiCode = scan.nextInt();
//        System.out.println("Character is " + (char) asciiCode);




        // task 2 : nPr & nCr
//        BigInteger N = new BigInteger("1");
//        BigInteger R = new BigInteger("1");
//        BigInteger dif = new BigInteger("1");
//        System.out.print("Please Enter N and R to Calculate nPr and nCr : ");
//        int n = scan.nextInt(), r = scan.nextInt();
//        for (int i = 1; i <= n; i++) {
//            BigInteger con = new BigInteger(Integer.toString(i));
//            N = N.multiply(con);
//        }
//        for (int i = 1; i <= r; i++) {
//            BigInteger con = new BigInteger(Integer.toString(i));
//            R = R.multiply(con);
//        }
//        for (int i = 1; i <= n - r; i++) {
//            BigInteger con = new BigInteger(Integer.toString(i));
//            dif = dif.multiply(con);
//        }
//        BigInteger nCr = new BigInteger("1");
//        nCr = N.divide(R);
//        BigInteger nPr = new BigInteger("1");
//        nPr = nCr.divide(dif);
//        System.out.println("nCr = " + nCr);
//        System.out.println("nPr = " + nPr);




        // task 3 : maximum number in array
//        System.out.print("Enter size of Array : ");
//        int sizeOfArray = scan.nextInt();
//        int arr[] = new int[sizeOfArray];
//        int maxElementInArray = 0, positionMax = -1;
//        for (int i = 0; i < sizeOfArray; i++) {
//            arr[i] = scan.nextInt();
//            if (i == 0) maxElementInArray = arr[0];
//            // there is a new value greater than I have
//            if (maxElementInArray < arr[i]) {
//                maxElementInArray = arr[i];
//                positionMax = i;
//            }
//        }
//        System.out.println("Max Element in Array is "+maxElementInArray+" and it's position is "+(positionMax+1));




        // task 4 : Transpose Array
//        System.out.print("Enter dimension of Array NxM : ");
//        int N=scan.nextInt(),M=scan.nextInt();
//        int array[][] = new int[N][M];
//        int TransposedArray[][] = new int[M][N];
//        System.out.println("Enter Elements of Array : ");
//        for(int i=0;i<N;i++){
//            for(int j=0;j<M;j++){
//                array[i][j]=scan.nextInt();
//                TransposedArray[j][i]=array[i][j];
//            }
//        }
//        for(int i=0;i<M;i++){
//            for(int j=0;j<N;j++){
//                System.out.print(TransposedArray[i][j]+" ");
//            }
//            System.out.println();
//        }





        // task 5 : string after remove comma
//        System.out.print("Enter your String : ");
//        String S =scan.nextLine();
//        String A="";
//        // string after remove comma
//        for (int i = 0; i < S.length(); i++) {
//            if(S.charAt(i)!=',')
//                A+=S.charAt(i);
//        }
//        System.out.println("String after removing comma : "+A);




        // task 6 : Triangle and Circle (Area and Surrounding)
        // Triangle
//        System.out.print("Enter Sides of Triangle :");
//        int a=scan.nextInt();
//        int b=scan.nextInt();
//        int c=scan.nextInt();
//        Triangle t1=new Triangle();
//        t1.setSides(a,b,c);
//        System.out.println("Area of Triangle = "+t1.getArea());
//        System.out.println("Surrounding of Triangle = "+t1.getSurrounding());

        // Circle
//        double radius = scan.nextDouble();
//        Circle c1=new Circle();
//        c1.setRadius(radius);
//        System.out.println("Area of Circle = "+c1.getArea());
//        System.out.println("Surrounding of Circle = "+c1.getSurrounding());





        // task 7 : Quick Sort
//        System.out.print("Enter Size of Array you want to sort it : ");
//        int N = scan.nextInt();
//        int array[] = new int[N];
//        System.out.print("Enter Elements of Array : ");
//        for (int i = 0; i < N; i++) {
//            array[i] = scan.nextInt();
//        }
//        QuickSort(array, 0, N - 1);
//        System.out.print("Array after sorted : ");
//        for (int i = 0; i < N; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
    }

}