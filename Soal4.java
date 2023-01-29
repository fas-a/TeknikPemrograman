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
        
    }
}
