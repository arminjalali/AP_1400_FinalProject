package sample;

public class BarbarianTroop extends TroopCard{
    private final double hitSpeed;
    private final String speed;
    private final String target;
    private final String range;
    private final boolean areaSplash;
    private final int count;
    private final int cost;
    private int HP;
    private int damage;

    public BarbarianTroop(){
        hitSpeed = 1.5;
        speed = "Medium";
        target = "Ground";
        range = "Melee";
        areaSplash = false;
        count = 4;
        cost = 5;
        HP = 300;
        damage = 75;
    }
    @Override
    public void levelUp(int level) {
        if (level == 2) {
            HP = 330;
            damage = 82;
        } else if (level == 3) {
            HP = 363;
            damage = 90;
        } else if (level == 4) {
            HP = 438;
            damage = 99;
        } else if (level == 5) {
            HP = 480;
            damage = 109;
        } else {
            System.out.println("Illegal level!");
        }
    }
}
