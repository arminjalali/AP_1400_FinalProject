package sample;

public class BabyDragonTroop extends TroopCard {

    private final double hitSpeed;
    private final String speed;
    private final String target;
    private final String range;
    private final boolean areaSplash;
    private final int count;
    private final int cost;
    private int HP;
    private int damage;

    public BabyDragonTroop() {
        hitSpeed = 1.8;
        speed = "Fast";
        target = "Air&Ground";
        range = "3";
        areaSplash = true;
        count = 1;
        cost = 4;
        HP = 800;
        damage = 100;
    }

    @Override
    public void levelUp(int level) {
        if (level == 2) {
            HP = 880;
            damage = 110;
        } else if (level == 3) {
            HP = 968;
            damage = 121;
        } else if (level == 4) {
            HP = 1064;
            damage = 133;
        } else if (level == 5) {
            HP = 1168;
            damage = 146;
        } else {
            System.out.println("Illegal level!");
        }
    }
}
