import java.util.ArrayList;
public class Merchant extends Entity{
    private ArrayList<String> listItem;

    public Merchant(int level, int hp, ArrayList<String> listItem){
        super.setLevel(level);
        super.setHp(hp);
        this.listItem = listItem;
    }

    public ArrayList<String> getListItem() {
        return listItem;
    }

    public void setListItem(ArrayList<String> listItem) {
        this.listItem = listItem;
    }

    public void entityInfo(){
        System.out.println("# MERCHANT DENGAN LEVEL : " + super.getLevel());
    }
}
