class Barang{
    String namabarang;
    int hargabarang;
    int jumlahbarang;

    Barang(String inputnama, int inputharga, int inputjumlah){
        namabarang = inputnama;
        hargabarang = inputharga;
        jumlahbarang = inputjumlah;

    }

    int Total_harga(){
        return hargabarang * jumlahbarang;
    }
}