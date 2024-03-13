import java.util.ArrayList;

class Keranjang{
    ArrayList<Barang> daftarbarang;
    int inputbarang;
    int jumlah;
    Keranjang(){
        daftarbarang = new ArrayList<Barang>();
        inputbarang = 0;
    }

    void tambahBarang(Barang barangTerbaru){
        if (inputbarang < 5){
            daftarbarang.add(barangTerbaru);
            inputbarang += barangTerbaru.jumlahbarang;
            jumlah += barangTerbaru.Total_harga();
            System.out.println("Berhasil memasukkan ke keranjang");
        }
        else {
            System.out.println("Gagal, keranjang penuh");
        }
    }

    void printHasil(){
        System.out.printf("Jumlah Barang di keranjang saat ini : %d\n",inputbarang);
        System.out.printf("Barang pada keranjang : ");
        for(Barang e:daftarbarang){
            System.out.printf("# %s, jumlah : %d\n",e.namabarang,e.jumlahbarang);
        }
        System.out.printf("Total harga yang dibayar : %d", jumlah);
    }

}