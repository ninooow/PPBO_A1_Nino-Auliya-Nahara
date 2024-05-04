public class Truck extends Vehicle{
    private int cargoCapacity;

    public Truck(String brand, int year, double rentalPrice, int cargoCapacity) {
        super.setBrand(brand);
        super.setYear(year);
        super.setRentalPrice(rentalPrice);
        this.cargoCapacity = cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public double discount(){
        if (cargoCapacity>=2000){
            return super.discount() + super.getRentalPrice()*0.1;
        }return  super.discount();
    }
    public void displayInfo(){
        System.out.println("Detail Truk : ");
        System.out.println("Merk : " + super.getBrand());
        System.out.println("Tahun : " + super.getYear());
        System.out.println("Harga Sewa : " + super.getRentalPrice());
        System.out.println("Kapasitas Kargo : " + cargoCapacity);
        System.out.println("Total Diskon : " + this.discount());
        System.out.println("Harga Sewa Setelah Diskon : " + (super.getRentalPrice()-this.discount()));
        System.out.println("-------------------------------------------------------------");
    }
}
