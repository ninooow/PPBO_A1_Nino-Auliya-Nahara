public class Potion extends Item implements IAttack{
    public enum Type{
        ATTACK,HEAL
    }
    private int duration;
    private int effect_point;
    private Type type;

    public Potion(String name, int rank, double price, int duration, int effect_point, Type type){
        super(name,rank,price);
        this.duration = duration;
        this.effect_point = effect_point;
        this.type = type;
    }

    public void use(){
        if(type == Type.ATTACK){
            attack();
        }else if(type == Type.HEAL){
            heal();
        }
    }

    public void attack() {
        System.out.println("Damage dealt by " + effect_point);
        System.out.println();
    }
    public void heal(){
        System.out.println("Healed by " + effect_point);
        System.out.println();
    }

    public void display(){
        System.out.println("Nama : " + getName());
        System.out.println("Rank : " + getRank());
        System.out.println("Price : " + getPrice());
        System.out.println("Duration : " + duration);
        System.out.println("Type : " + type);
        System.out.println();
    }
}
