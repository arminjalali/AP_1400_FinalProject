package sample;

public class GiantTroop extends TroopCard {

    private final double hitSpeed;
    private final String speed;
    private final String target;
    private final String range;
    private final boolean areaSplash;
    private final int count;
    private final int cost;
    private int HP;
    private int damage;

    public GiantTroop() {
        hitSpeed = 1.5;
        speed = "Slow";
        target = "Ground";
        range = "Melee";
        areaSplash = false;
        count = 1;
        cost = 5;
        HP = 2000;
        damage = 126;
    }

    @Override
    public void levelUp(int level) {
        if (level == 2) {
            HP = 2200;
            damage = 138;
        } else if (level == 3) {
            HP = 2420;
            damage = 152;
        } else if (level == 4) {
            HP = 2660;
            damage = 167;
        } else if (level == 5) {
            HP = 2920;
            damage = 183;
        } else {
            System.out.println("Illegal level!");
        }
    }
}
