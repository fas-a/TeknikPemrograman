package kasus2;

public class Pelanggan extends Produk{
	private double totalHarga = 0;
	
	public Pelanggan() {
		
	}
	
	private void beliProduk(String nama, double harga, int stok, byte kode) {
		setId(kode);
		setNama_produk(nama);
		setHarga_produk(harga);
		setStok(getStok(kode)+stok);
	}
	
	public void beli(byte kode, int jumlah, Toko shop) {
		if(shop.getStok(kode) - jumlah < 0) {
			System.out.println("Stok produk tidak mencukupi!!");
		} else {
			shop.reduceStok(jumlah, kode);
			this.beliProduk(shop.getNama_produk(kode), shop.getHarga_produk(kode), jumlah, kode);
			totalHarga += shop.getHarga_produk(kode) * jumlah; 
		}
	}
	
	public void tampilPesanan() {		
		System.out.println("Total Pesanan : ");
		System.out.println("------------------------------------");
		System.out.format("|%s|%-10s|%-4s|%-13s|\n", "Kode", "Nama", "Stok", "Harga Satuan");
		System.out.println("====================================");
		for(byte i = 0; i <= 9; i++) {
			if(!isOutOfBuy(i)) {
				System.out.format("|%-4d|%-10s|%-4d|Rp.%10s|\n", i, getNama_produk(i), getStok(i),getHarga_produk(i));				
			}
		}
		System.out.println("------------------------------------");
		System.out.format("|Total Bayar         |Rp.%10s|\n", totalHarga);
		System.out.println("------------------------------------");
	}

	private boolean isOutOfBuy(byte kode) {
		if(this.getStok(kode) == 0) return true;
		else return false;
	}
}
