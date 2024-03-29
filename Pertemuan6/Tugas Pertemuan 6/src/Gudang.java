import java.util.HashMap;
import java.util.EnumMap;
public class Gudang {
    public enum Bahan{
        KAYU,BAUT,CAT
    }
    private Bahan bahan;
    private EnumMap <Toko.Barang,Integer> isiGudang = new EnumMap<>(Toko.Barang.class);
    private EnumMap <Bahan,Integer> stokBahan = new EnumMap<>(Bahan.class);


    public Gudang(){
        isiGudang.put(Toko.Barang.MEJA, 0);
        isiGudang.put(Toko.Barang.KURSI, 0);
        isiGudang.put(Toko.Barang.LEMARI, 0);
        stokBahan.put(Bahan.KAYU, 0);
        stokBahan.put(Bahan.BAUT, 0);
        stokBahan.put(Bahan.CAT, 0);
    }


    public void cekStokBahan(){
        System.out.println(" STOK BAHAN : ");
        for (int i = 0;i<3;i++){
            System.out.println("Jumlah : " + Bahan.values()[i] + ", saat ini adalah : " + stokBahan.get(Bahan.values()[i]));
        }
    }
    public void cekIsiGudang(){
        System.out.println(" ISI GUDANG : ");
        for (int i = 0;i<3;i++){
            System.out.println("Jumlah : " + Toko.Barang.values()[i] + ", saat ini adalah : " + isiGudang.get(Toko.Barang.values()[i]) + " buah");
        }
    }

    public void tambahBahan(Bahan bahan, int banyakBahan){
        stokBahan.replace(bahan, stokBahan.get(bahan)+banyakBahan);
    }


    public void kurangiBahan(Bahan bahan, int banyakBahan){
        stokBahan.replace(bahan,stokBahan.get(bahan)-banyakBahan);
    }

    public void buatBarang(Toko.Barang barang, int banyakBarang){
        if (bahanPembuatanMencukupi(barang,banyakBarang)){
            System.out.println(banyakBarang + " " + barang + " berhasil ditambahkan ke Gudang");
            masukkanBarangKeGudang(barang, banyakBarang);
        }
        else {
            System.out.println("Bahan tidak cukup untuk membuat " + banyakBarang + " " + barang);
        }
    }

    public boolean slotTersedia(Toko.Barang barang, int banyakBarang){
        int max = 0;
        switch (barang){
            case MEJA:
                max = 10;
            case KURSI:
                max = 20;
            case  LEMARI:
                max = 5;
        }
        if (isiGudang.get(barang)+banyakBarang <= max){
            return true;
        }
        return false;
    }


    public void masukkanBarangKeGudang(Toko.Barang barang, int banyakBarang){
            isiGudang.replace(barang, isiGudang.get(barang)+banyakBarang);
    }


    public void keluarkanBarangDariGudang (Toko.Barang barang, int banyakBarang){
        isiGudang.replace(barang, isiGudang.get(barang)-banyakBarang);
        System.out.println(banyakBarang + " " + barang + " berhasil dikerluarkan dari Gedung");
    }


    public boolean bahanPembuatanMencukupi(Toko.Barang barang, int banyakBarang){
        switch (barang) {
            case MEJA:
                if (slotTersedia(barang, banyakBarang) && (stokBahan.get(Bahan.KAYU) >= banyakBarang * 3) && (stokBahan.get(Bahan.BAUT) >= banyakBarang * 20) && (stokBahan.get(Bahan.CAT) >= banyakBarang * 2)) {
                    kurangiBahan(Bahan.KAYU, banyakBarang * 3);
                    kurangiBahan(Bahan.BAUT, banyakBarang * 20);
                    kurangiBahan(Bahan.CAT, banyakBarang * 2);
                    return true;
                }
                return false;
            case KURSI:
                if (slotTersedia(barang, banyakBarang) && (stokBahan.get(Bahan.KAYU) >= banyakBarang * 2) && (stokBahan.get(Bahan.BAUT) >= banyakBarang * 10) && (stokBahan.get(Bahan.CAT) >= banyakBarang * 1)) {
                    kurangiBahan(Bahan.KAYU, banyakBarang * 2);
                    kurangiBahan(Bahan.BAUT, banyakBarang * 10);
                    kurangiBahan(Bahan.CAT, banyakBarang * 1);
                    return true;
                }
                return false;
            case LEMARI:
                if (slotTersedia(barang, banyakBarang) && (stokBahan.get(Bahan.KAYU) >= banyakBarang * 5) && (stokBahan.get(Bahan.BAUT) >= banyakBarang * 30) && (stokBahan.get(Bahan.CAT) >= banyakBarang * 3)) {
                    kurangiBahan(Bahan.KAYU, banyakBarang * 5);
                    kurangiBahan(Bahan.BAUT, banyakBarang * 30);
                    kurangiBahan(Bahan.CAT, banyakBarang * 3);
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

}
