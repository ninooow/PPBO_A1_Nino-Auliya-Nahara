public class Salesman extends Pegawai{
    private int target;
    private int penjualan;
    public Salesman(String nama, String departemen, char jenisKelamin){
        super(nama, departemen,jenisKelamin);
    }

    public int getTarget() {
        return target;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public int thr(){
        if(penjualan>=target){
            return 2*super.getGaji();
        }return super.getGaji();
    }

    public String nipPegawai(){
        if(super.getNip()!=null) {
            char hurufAwalNIP = super.getNip().charAt(0);
            if (hurufAwalNIP == 'S') {
                return super.getNip();
            }return "NULL";
        }return "P000" + super.getUrutanMasuk();
    }

    public void displayInfo(){
        System.out.println("===============================================");
        System.out.println("Jabatan : Pegawai");
        System.out.println("Nama : " + super.getNama());
        System.out.println("Departemen : " + super.getDepartemen());
        System.out.println("NIP : " + nipPegawai());
        System.out.println("Gaji : " + super.getGaji());
        System.out.println("THR : " + thr());
        System.out.println("Cuti : " + super.banyakCuti());
    }

}
