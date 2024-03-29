import java.util.ArrayList;
public class Toko {
    public enum Barang{
        MEJA, KURSI, LEMARI
    }
    private Barang tipeBarang;
    private Gudang gudangBarang;
    ArrayList <Pembeli> antrian = new ArrayList<>();
}
