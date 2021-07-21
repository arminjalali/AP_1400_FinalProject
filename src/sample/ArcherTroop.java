package sample;

public class ArcherTroop extends TroopCard {
    private final double hitSpeed;
    private final String speed;
    private final String target;
    private final String range;
    private final boolean areaSplash;
    private final int count;
    private final int cost;
    private int HP;
    private int damage;

    public ArcherTroop() {
        hitSpeed = 1.2;
        speed = "Medium";
        target = "Air&Ground";
        range = "5";
        areaSplash = false;
        count = 2;
        cost = 3;
        HP = 125;
        damage = 33;
    }

    @Override
    public void levelUp(int level) {
        if (level == 2) {
            HP = 127;
            damage = 44;
        } else if (level == 3) {
            HP = 151;
            damage = 48;
        } else if (level == 4) {
            HP = 166;
            damage = 53;
        } else if (level == 5) {
            HP = 182;
            damage = 58;
        } else {
            System.out.println("Illegal level!");
        }
    }
}
