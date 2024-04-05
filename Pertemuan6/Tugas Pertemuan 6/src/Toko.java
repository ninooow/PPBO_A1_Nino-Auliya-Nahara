import java.util.ArrayList;
public class Toko {
    public enum Barang{
        MEJA, KURSI, LEMARI
    }
    private Barang Barang;
    private Gudang gudang = new Gudang();
    ArrayList <Pembeli> antrian = new ArrayList<>();

    public Gudang getGudangBarang() {
        return gudang;
    }

    public void tambahAntrian(Pembeli pembeli){
        antrian.add(pembeli);
        System.out.println("Berhasil menambah antrian \n");
    }

    public void selesaikanAntrian(){
        if (barangDibeliTersedia(antrian.get(0).getBarangDibeli(), antrian.get(0).getJumlahBarang())) {
            gudang.keluarkanBarangDariGudang(antrian.get(0).getBarangDibeli(), antrian.get(0).getJumlahBarang());
            System.out.println("Antrian terdepan berhasil diselesaikan \n");
            antrian.remove(0);
        }
        else{
            System.out.println("Antrian tidak berhasil ditambahkan karena barang tidak tersedia \n");
        }
    }

    public void cekIsiAntrian(){
        int i = 1;
        System.out.println("LIST ANTRIAN : ");
        for(Pembeli listAntrian : antrian){
            System.out.println("Antrian ke-" + i + ", nama : " + listAntrian.getNama() + ", barang dibeli : " + listAntrian.getBarangDibeli() + ", jumlah barang dibeli : " + listAntrian.getJumlahBarang());
            i++;
        }
        System.out.println();
    }

    public boolean barangDibeliTersedia(Barang barang, int beliBarang){
        return gudang.isIsiGudang(barang,beliBarang);
    }
}
