public class Shield extends Item{
    private int damage_block;

    public Shield(String name, int rank, double price, int damage_block){
        super(name,rank,price);
        this.damage_block = damage_block;
    }
    public void defense(){
        System.out.println("Damage Mitigated by " + damage_block);
        System.out.println();
    }

    public void display(){
        System.out.println("Nama : " + getName());
        System.out.println("Rank : " + getRank());
        System.out.println("Price : " + getPrice());
        System.out.println();
    }
}
