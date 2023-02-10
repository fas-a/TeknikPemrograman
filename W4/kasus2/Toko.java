package kasus2;

public class Toko extends Produk{
	public Toko() {
		
	}
	
	public void tambahProduk(String nama, double harga, int stok) {
		setNama_produk(nama);
		setHarga_produk(harga);
		setStok(stok);
	}
	
	public void tampilMenuProduk() {
		System.out.println("------------------------------------");
		System.out.format("|%s|%-10s|%-4s|%-13s|\n", "Kode", "Nama", "Stok", "Harga Satuan");
		System.out.println("====================================");
		for(byte i = 0; i <= 9; i++) {
			System.out.format("|%-4d|%-10s|%-4d|Rp.%10s|\n", i, getNama_produk(i), getStok(i),getHarga_produk(i));
		}
		System.out.println("------------------------------------");
	}
	
	public boolean isOutOfStock(byte id) {
		if(getStok(id) == 0) return true;
		else return false;
	}
}
