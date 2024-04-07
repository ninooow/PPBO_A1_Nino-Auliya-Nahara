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

        Pembeli pembeli4 = new Pembeli("Roro", Toko.Barang.KURSI, 10);
        Pembeli pembeli5 = new Pembeli("Jonggrang", Toko.Barang.MEJA, 5);
        Pembeli pembeli6 = new Pembeli("Gattha", Toko.Barang.LEMARI, 3);
        Pembeli pembeli7 = new Pembeli("Isa", Toko.Barang.KURSI, 10);
        Pembeli pembeli8 = new Pembeli("Muhammad", Toko.Barang.MEJA, 5);
        Pembeli pembeli9 = new Pembeli("Damar", Toko.Barang.LEMARI, 3);
        Pembeli pembeli10 = new Pembeli("Aziz", Toko.Barang.KURSI, 10);

        mebel.tambahAntrian(pembeli4);
        mebel.tambahAntrian(pembeli5);
        mebel.tambahAntrian(pembeli6);
        mebel.tambahAntrian(pembeli7);
        mebel.tambahAntrian(pembeli8);
        mebel.tambahAntrian(pembeli9);
        mebel.tambahAntrian(pembeli10);
        mebel.cekIsiAntrian();

    }
}