import java.util.ArrayList;
import java.util.List;
public class Keranjang {
    List<Barang> listBarang = new ArrayList<>();
    int isiKeranjang = 0;
    void masukKeranjang(Barang barang){
        isiKeranjang += barang.jumlahBarang;
        if(isiKeranjang<=5) {
            listBarang.add(barang);
            System.out.println("Berhasil memasukkan ke keranjang");
        }
        else{
            System.out.println("SUDAH CUKUP Y");
        }
    }
    void tampilkanBelanjaan(){
        System.out.println("Jumlah barang di keranjang saat ini : " + isiKeranjang);
        int totalHarga = 0;
        for (Barang barang : this.listBarang){
            System.out.println("# "+barang.namaBarang+", jumlah : "+barang.jumlahBarang);
            totalHarga += barang.hargaBarang * barang.jumlahBarang;
        }
        System.out.println("Total harga yang harus dibayarkan : " + totalHarga);
    }
}
