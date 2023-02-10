package kasus2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int jumlah = 0;
		byte id = 0;
		char confirm = 'y';
		Toko shop = new Toko();
		Pelanggan cust = new Pelanggan();
		shop.tambahProduk("Bala-Bala", 1_000, 48);
		shop.nextId();
		shop.tambahProduk("Gehu", 1_000, 30);
		shop.nextId();
		shop.tambahProduk("Tahu", 1_000, 30);
		shop.nextId();
		shop.tambahProduk("Molen", 1_000, 40);
		shop.nextId();
		shop.tambahProduk("Es Teh", 5_000, 30);
		shop.nextId();
		shop.tambahProduk("Mi Ayam", 15_000, 40);
		shop.nextId();
		shop.tambahProduk("Kopi", 5_000, 30);
		shop.nextId();
		shop.tambahProduk("Air Putih", 1_000, 100);
		shop.nextId();
		shop.tambahProduk("Bakso", 10_000, 25);
		shop.nextId();
		shop.tambahProduk("Susu", 5_000, 30);
		Scanner sc = new Scanner(System.in);
		while(confirm == 'y') {
			shop.tampilMenuProduk();
			System.out.print("Pilih kode produk yang dipesan : ");
			id = sc.nextByte();
			if(id > 9 || id < 0) {
				System.out.println("Kode produk tidak tersedia!!");
			} else {
				System.out.print("Berapa banyak yang dipesan : ");
				jumlah = sc.nextInt();
				cust.beli(id, jumlah, shop);
			}
			System.out.print("Ingin memesan lagi?(y) : ");
			confirm = sc.next().charAt(0);
		}
		sc.close();
		cust.tampilPesanan();
	}
}
