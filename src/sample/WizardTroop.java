package sample;

public class WizardTroop extends TroopCard {

    private final double hitSpeed;
    private final String speed;
    private final String target;
    private final String range;
    private final boolean areaSplash;
    private final int count;
    private final int cost;
    private int HP;
    private int damage;

    public WizardTroop() {
        hitSpeed = 1.7;
        speed = "Medium";
        target = "Air&Ground";
        range = "5";
        areaSplash = true;
        count = 1;
        cost = 5;
        HP = 340;
        damage = 130;
    }

    @Override
    public void levelUp(int level) {
        if (level == 2) {
            HP = 374;
            damage = 143;
        } else if (level == 3) {
            HP = 411;
            damage = 157;
        } else if (level == 4) {
            HP = 452;
            damage = 172;
        } else if (level == 5) {
            HP = 496;
            damage = 189;
        } else {
            System.out.println("Illegal level!");
        }
    }
}
