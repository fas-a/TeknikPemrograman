
public class Inventori {
	Barang[] barangs;
	void initBarang() {
		barangs = new Barang[2];
		barangs[0] = new Barang("001", "Baju", 10);
		barangs[1] = new Barang("002", "Celana", 20);
	}
	void showBarang() {
		System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
		System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
	}
	
//	void addStock(Barang benda, int add) {
//		benda.getStok() += add;
//	}
	
	void pengadaan() {
		initBarang();
		//barangs[0].stok += 20;
		//barangs[0].stok -= 30;//Bisa juga dikurangi dong?
		//barangs[0].stok *= 30;//dikali juga bisa dong??
		barangs[0].addStock(10);
		//this.addStock(barangs[0].getStok(), 100);
		
		showBarang();
	}
	public static void main(String[] args) {
		Inventori beli = new Inventori();
		beli.pengadaan();
	}
}
