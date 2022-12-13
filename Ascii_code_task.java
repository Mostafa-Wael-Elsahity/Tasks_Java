import java.math.BigInteger;
import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //task 1 : ascii code
        System.out.print("Please Enter ascii code : ");
        int asciiCode = scan.nextInt();
        System.out.println("Character is " + (char) asciiCode);
    }

}
