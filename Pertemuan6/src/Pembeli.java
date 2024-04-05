public class Pembeli {
    private String nama;
    private Toko.Barang barangDibeli;
    private int jumlahBarang;


    public Pembeli(String nama, Toko.Barang barangDibeli, int jumlahBarang){
        this.nama = nama;
        this.barangDibeli = barangDibeli;
        this.jumlahBarang = jumlahBarang;
    }

    public String getNama() {
        return this.nama;
    }

    public Toko.Barang getBarangDibeli(){
        return this.barangDibeli;
    }

    public int getJumlahBarang() {
        return this.jumlahBarang;
    }
}