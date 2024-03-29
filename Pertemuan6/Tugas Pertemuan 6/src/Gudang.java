import java.util.HashMap;
import java.util.EnumMap;
public class Gudang {
    public enum Bahan{
        KAYU,BAUT,CAT
    }
    private Bahan bahan;
    private EnumMap <Toko.tipeBarang,Integer> isiGudang = new EnumMap<>();
    private EnumMap <Bahan,Integer> stokBahan = new EnumMap<>();


    public EnumMap cekStokBahan(){
        return stokBahan;
    }
    public HashMap cekIsiGudang(){
        return isiGudang;
    }

    public void tambahBahan(Gudang.Bahan bahan, int banyakBahan){
        if (stokBahan.get(bahan)==null){
            stokBahan.put(bahan, banyakBahan);
        }
        if (stokBahan.get(bahan)!=null){
            stokBahan.put(bahan, stokBahan.get(bahan)+banyakBahan);
        }
    }


    public void kurangiBahan(Gudang.Bahan bahan, int banyakBahan){
        stokBahan.replace(bahan,stokBahan.get(bahan)-banyakBahan);
    }

    public void buatBarang(Toko.Barang barang, int banyakBarang){
        switch (barang){
            case barang.MEJA :

        }
    }

    public boolean bahanPembuatanMencukupi(Toko.Barang barang, int banyakBarang){
        switch (barang){
            case barang.MEJA:
                if (stokBahan.get(barang.KAYU) >= banyakBarang*3){

                }
        }
    }



}
