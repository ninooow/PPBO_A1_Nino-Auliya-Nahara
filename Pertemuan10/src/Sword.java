public class Sword extends Item implements IAttack{
    private int damage;

    public Sword(String name, int rank, double price, int damage){
        super(name,rank,price);
        this.damage = damage;
    }
    public void attack(){
        System.out.println("Damage dealt by " + damage);
        System.out.println();
    }

    public void display(){
        System.out.println("Nama : " + getName());
        System.out.println("Rank : " + getRank());
        System.out.println("Price : " + getPrice());
        System.out.println();
    }
}
