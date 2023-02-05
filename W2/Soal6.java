import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        BigInteger numA, numB;

        Scanner sc = new Scanner(System.in);
        numA = sc.nextBigInteger();
        numB = sc.nextBigInteger();
        sc.close();

        System.out.println(numA.add(numB));
        System.out.println(numA.multiply(numB));
    }
}
