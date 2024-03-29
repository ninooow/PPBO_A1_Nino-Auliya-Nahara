//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gudang gudang = new Gudang();
        gudang.tambahBahan(Gudang.Bahan.KAYU, 20);
        gudang.tambahBahan(Gudang.Bahan.BAUT, 100);
        gudang.tambahBahan(Gudang.Bahan.CAT, 15);
        gudang.cekStokBahan();
        gudang.buatBarang(Toko.Barang.KURSI, 3);
        gudang.cekStokBahan();
        gudang.cekIsiGudang();

    }
}