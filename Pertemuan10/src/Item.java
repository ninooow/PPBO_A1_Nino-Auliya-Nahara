public abstract class Item {
    private String name;
    private int rank;
    private double price;

    public Item(String name, int rank, double price){
        this.name = name;
        this.rank = rank;
        this.price = price;
    }
    public abstract void display();

    public java.lang.String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public double getPrice() {
        return price;
    }
}
