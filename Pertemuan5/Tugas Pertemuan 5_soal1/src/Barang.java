public class Barang {
    private String namaBarang;
    private int hargaBarang, jumlahBarang;

    public Barang(String namaBarang, int hargaBarang, int jumlahBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }
}
