import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        int item, gajipokok = 500000, gajiakhir, hargaitem = 50000/100, minitem = 15;
        
        Scanner sc = new Scanner(System.in);
        item = sc.nextInt();
        sc.close();

        if(item > 80) gajiakhir = (gajipokok + (35 * item * hargaitem));
        else if (item >= 40) gajiakhir = (gajipokok + (25 * item * hargaitem));
        else if (item >= 15) gajiakhir = (gajipokok + (10 * item * hargaitem));
        else gajiakhir = (gajipokok - (15 * (minitem - item) * hargaitem));

        System.out.println(gajiakhir);
        //gajiakhir = (item > 80)? (gajipokok + (0.35 * item)):((item >= 40)?(gajipokok + (0.25 * item)):((item >= 15)?((gajipokok + (0.10 * item))):((gajipokok - (0.15 * item)))));
    }
}
