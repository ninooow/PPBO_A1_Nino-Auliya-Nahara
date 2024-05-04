public class Car extends Vehicle{
    public enum CarType{
        CITY_CAR,
        FAMILY_CAR,
        PREMIUM_CAR
    }
    private CarType carType;

    public Car (String brand, int year, double rentalPrice, CarType carType){
        super.setBrand(brand);
        super.setYear(year);
        super.setRentalPrice(rentalPrice);
        this.carType=carType;
    }
    public double discount(){
        if(carType==CarType.FAMILY_CAR) {
            return super.discount() + super.getRentalPrice() * 0.05;
        }else if (carType==CarType.PREMIUM_CAR){
            return super.discount() + super.getRentalPrice() * 0.1;
        }return super.discount();
    }
    public void displayInfo(){
        System.out.println("Detail Mobil : ");
        System.out.println("Merk : " + super.getBrand());
        System.out.println("Tahun : " + super.getYear());
        System.out.println("Harga Sewa : " + super.getRentalPrice());
        System.out.println("Tipe Mobil : " + this.carType);
        System.out.println("Total Diskon : " + this.discount());
        System.out.println("Harga Sewa Setelah Diskon : " + (super.getRentalPrice()-this.discount()));
        System.out.println("-------------------------------------------------------------");
    }

}
