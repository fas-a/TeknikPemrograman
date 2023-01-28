import java.util.*;

public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kalimat = sc.nextLine();
        sc.close();
        int jumlahkata = 0;
        String[] kumpulankata = kalimat.split("[! ,?._'@]+");
        jumlahkata = kumpulankata.length;
        System.out.println(jumlahkata);
        for(String a : kumpulankata)
            System.out.println(a);
    }
}
