public class Main {
    public static void main(String[] args) {
        Toko mebel = new Toko();
        mebel.getGudangBarang().tambahBahan(Gudang.Bahan.KAYU, 20);
        mebel.getGudangBarang().tambahBahan(Gudang.Bahan.BAUT, 100);
        mebel.getGudangBarang().tambahBahan(Gudang.Bahan.CAT, 15);

        mebel.getGudangBarang().buatBarang(Toko.Barang.KURSI, 3);
        mebel.getGudangBarang().cekStokBahan();

        mebel.getGudangBarang().buatBarang(Toko.Barang.KURSI, 5);
        mebel.getGudangBarang().buatBarang(Toko.Barang.MEJA, 5);

        mebel.getGudangBarang().tambahBahan(Gudang.Bahan.KAYU, 20);
        mebel.getGudangBarang().tambahBahan(Gudang.Bahan.BAUT, 100);
        mebel.getGudangBarang().tambahBahan(Gudang.Bahan.CAT, 15);
        mebel.getGudangBarang().cekStokBahan();

        mebel.getGudangBarang().buatBarang(Toko.Barang.KURSI, 5);
        mebel.getGudangBarang().cekIsiGudang();

        Pembeli pembeli1 = new Pembeli("Nino", Toko.Barang.KURSI, 10);
        Pembeli pembeli2 = new Pembeli("Auliya", Toko.Barang.MEJA, 5);
        Pembeli pembeli3 = new Pembeli("Nahara", Toko.Barang.LEMARI, 3);

        mebel.tambahAntrian(pembeli1);
        mebel.tambahAntrian(pembeli2);
        mebel.tambahAntrian(pembeli3);
        mebel.cekIsiAntrian();

        mebel.selesaikanAntrian();
        mebel.cekIsiAntrian();
        mebel.getGudangBarang().cekIsiGudang();

    }
}