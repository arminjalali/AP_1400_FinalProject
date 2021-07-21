package sample;

public class ValkyrieTroop extends TroopCard {

    private final double hitSpeed;
    private final String speed;
    private final String target;
    private final String range;
    private final boolean areaSplash;
    private final int count;
    private final int cost;
    private int HP;
    private int damage;

    public ValkyrieTroop() {
        hitSpeed = 1.5;
        speed = "Medium";
        target = "Ground";
        range = "Melee";
        areaSplash = true;
        count = 1;
        cost = 4;
        HP = 880;
        damage = 120;
    }

    @Override
    public void levelUp(int level) {
        if (level == 2) {
            HP = 968;
            damage = 132;
        } else if (level == 3) {
            HP = 1064;
            damage = 145;
        } else if (level == 4) {
            HP = 1170;
            damage = 159;
        } else if (level == 5) {
            HP = 1284;
            damage = 175;
        } else {
            System.out.println("Illegal level!");
        }
    }
}
