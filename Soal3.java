import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        String operation = sc.next();
        int numB = sc.nextInt();
        int hasil = 0;
        sc.close();
        switch (operation.charAt(0)) {
            case '+':
                hasil = numA + numB;
                break;
            case '-':
                hasil = numA - numB;
                break;
            case '*':
                hasil = numA * numB;
                break;
            case '/':
                hasil = numA / numB;
                break;
            case '%':
                hasil = numA % numB;
                break;
            default:
                break;
        }
        System.out.println(hasil);
    }
}
