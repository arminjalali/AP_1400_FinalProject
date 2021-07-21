package sample;

public class MiniPEKKATroop extends TroopCard {

    private final double hitSpeed;
    private final String speed;
    private final String target;
    private final String range;
    private final boolean areaSplash;
    private final int count;
    private final int cost;
    private int HP;
    private int damage;

    public MiniPEKKATroop() {
        hitSpeed = 1.8;
        speed = "Fast";
        target = "Ground";
        range = "Melee";
        areaSplash = false;
        count = 1;
        cost = 4;
        HP = 600;
        damage = 325;
    }

    @Override
    public void levelUp(int level) {
        if (level == 2) {
            HP = 660;
            damage = 357;
        } else if (level == 3) {
            HP = 726;
            damage = 393;
        } else if (level == 4) {
            HP = 798;
            damage = 432;
        } else if (level == 5) {
            HP = 876;
            damage = 474;
        } else {
            System.out.println("Illegal level!");
        }
    }
}
