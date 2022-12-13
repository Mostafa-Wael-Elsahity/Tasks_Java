import java.math.BigInteger;
import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // task 5 : string after remove comma
        System.out.print("Enter your String : ");
        String S =scan.nextLine();
        String A="";
        // string after remove comma
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i)!=',')
                A+=S.charAt(i);
        }
        System.out.println("String after removing comma : "+A);

    }

}
