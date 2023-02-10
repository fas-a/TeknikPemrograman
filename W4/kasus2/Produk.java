package kasus2;

public class Produk {
	private String[] nama_produk;
	private double[] harga_produk;
	private int[] stok;
	public static byte id=0;

	public Produk() {
		nama_produk = new String[10];
		harga_produk = new double[10];
		stok = new int[10];
	}
	
	public String getNama_produk(byte kode) {
		return nama_produk[kode];
	}
	public void setNama_produk(String nama) {
		this.nama_produk[id] = nama;
	}
	public double getHarga_produk(byte kode) {
		return harga_produk[kode];
	}
	public void setHarga_produk(double harga_makanan) {
		this.harga_produk[id] = harga_makanan;
	}
	public int getStok(byte kode) {
		return stok[kode];
	}
	public void setStok(int stok) {
		this.stok[id] = stok;
	}
	public void reduceStok(int jumlah, byte kode) {
		this.stok[kode] -= jumlah;
	}
	public void nextId() {
		id++;
	}
	public static void setId(byte kode) {
		id = kode;
	}
}
