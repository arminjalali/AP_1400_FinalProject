package sample;

public class KingTower extends Tower{
    private final double range = 7;
    private final double hitSpeed = 1;
    private int HP;
    private int damage;
    private int level;
    private boolean active;
    public KingTower(){
        level = 1;
        HP = 2400;
        damage = 50;
        active = false;
    }
}
