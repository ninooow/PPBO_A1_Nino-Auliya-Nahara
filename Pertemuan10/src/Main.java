//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Potion p1 = new Potion("A",1,100,30,50, Potion.Type.ATTACK);
        Potion p2 = new Potion("B",2,90,20,20, Potion.Type.HEAL);
        Sword sw1 = new Sword("C",3,80,10);
        Shield sh1 = new Shield("D",3,70,5);

        p1.display();
        p1.use();

        p2.display();
        p2.use();

        sw1.display();
        sw1.attack();

        sh1.display();
        sh1.defense();
    }
}