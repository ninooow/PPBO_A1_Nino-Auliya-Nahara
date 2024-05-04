public class Vehicle {
    private String brand;
    private double rentalPrice;
    private int year;

    public java.lang.String getBrand() {
        return brand;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(java.lang.String brand) {
        this.brand = brand;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double discount(){
        if (year<2010){
            return rentalPrice*0.1;
        }return 0.0;
    }
    public void displayInfo(){
        System.out.println("Detail : ");
        System.out.println("Merk : " + brand);
        System.out.println("Tahun : " + year);
        System.out.println("Harga Sewa : " + rentalPrice);
        System.out.println("Total Diskon : " + discount());
        System.out.println("Harga Sewa Setelah Diskon : " + (rentalPrice-discount()));
        System.out.println("-------------------------------------------------------------");
    }
}
