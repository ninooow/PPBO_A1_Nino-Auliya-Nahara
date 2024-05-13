public class Manager extends Pegawai{
    public Manager(String nama, String departemen, char jenisKelamin){
        super(nama, departemen, jenisKelamin);
    }
    public int thr(){
        return 2*super.getGaji();
    }

    public String nipPegawai(){
        if(super.getNip()!=null) {
            char hurufAwalNIP = super.getNip().charAt(0);
            if (hurufAwalNIP == 'M') {
                return super.getNip();
            }return "NULL";
        }return "P000" + super.getUrutanMasuk();
    }

    public void displayInfo(){
        System.out.println("===============================================");
        System.out.println("Jabatan : Manager");
        System.out.println("Nama : " + super.getNama());
        System.out.println("Departemen : " + super.getDepartemen());
        System.out.println("NIP : " + nipPegawai());
        System.out.println("Gaji : " + super.getGaji());
        System.out.println("THR : " + thr());
        System.out.println("Cuti : " + super.banyakCuti());
    }
}
