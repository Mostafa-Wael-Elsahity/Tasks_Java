import java.math.BigInteger;
import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // task 2 : nPr & nCr
        BigInteger N = new BigInteger("1");
        BigInteger R = new BigInteger("1");
        BigInteger dif = new BigInteger("1");
        System.out.print("Please Enter N and R to Calculate nPr and nCr : ");
        int n = scan.nextInt(), r = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            BigInteger con = new BigInteger(Integer.toString(i));
            N = N.multiply(con);
        }
        for (int i = 1; i <= r; i++) {
            BigInteger con = new BigInteger(Integer.toString(i));
            R = R.multiply(con);
        }
        for (int i = 1; i <= n - r; i++) {
            BigInteger con = new BigInteger(Integer.toString(i));
            dif = dif.multiply(con);
        }
        BigInteger nCr = new BigInteger("1");
        nCr = N.divide(R);
        BigInteger nPr = new BigInteger("1");
        nPr = nCr.divide(dif);
        System.out.println("nCr = " + nCr);
        System.out.println("nPr = " + nPr);
    }

}
