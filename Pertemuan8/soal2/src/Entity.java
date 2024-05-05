public class Entity {
    private int hp;
    private int level;

    public int getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void entityInfo(){
        System.out.println("# ENTITY DENGAN LEVEL : " + this.level);
    }
}
