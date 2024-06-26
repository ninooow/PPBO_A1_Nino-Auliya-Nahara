public class Pegawai {
    private String nama;
    private String departemen;
    private char jenisKelamin;
    private String cutiString;
    private int cutiInt;
    private int gaji;
    private String nip;
    private int urutanMasuk;

    public Pegawai(String nama, String departemen, char jenisKelamin){
        this.nama=nama;
        this.departemen=departemen;
        this.jenisKelamin=jenisKelamin;
    }

    public java.lang.String getNama() {
        return nama;
    }

    public java.lang.String getDepartemen() {
        return departemen;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public int getGaji() {
        return gaji;
    }

    public java.lang.String getNip() {
        return nip;
    }

    public java.lang.String getCutiString() {
        return cutiString;
    }

    public int getCutiInt() {
        return cutiInt;
    }

    public int getUrutanMasuk() {
        return urutanMasuk;
    }

    public void setNama(java.lang.String nama) {
        this.nama = nama;
    }

    public void setDepartemen(java.lang.String departemen) {
        this.departemen = departemen;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    public void setNip(int urutanMasuk) {
        this.urutanMasuk = urutanMasuk;
    }


    public void setCuti(String cuti) {
        this.cutiString = cuti;
    }

    public void setCuti(int cuti) {
        this.cutiInt = cuti;
    }


    public int thr(){
        return this.gaji;
    }

    public int banyakCuti(){
        if(cutiString != null) {
            if(cutiString.equals("pernikahan")){
                return 14;
            }else if (cutiString.equals("persalinan")){
                if(jenisKelamin == 'L'){
                    return 15;
                }else if (jenisKelamin == 'P'){
                    return 102;
                }
            }
        }return 12 + cutiInt;
    }
    public String nipPegawai(){
        if(nip!=null) {
            char hurufAwalNIP = nip.charAt(0);
            if (hurufAwalNIP == 'P') {
                return nip;
            }return "NULL";
        }return "P000" + urutanMasuk;
    }

    public void displayInfo(){
        System.out.println("===============================================");
        System.out.println("Jabatan : Pegawai");
        System.out.println("Nama : " + this.nama);
        System.out.println("Departemen : " + this.departemen);
        System.out.println("NIP : " + nipPegawai());
        System.out.println("Gaji : " + this.gaji);
        System.out.println("THR : " + thr());
        System.out.println("Cuti : " + banyakCuti());
    }
}
