package sample;

public class FireballSpell extends SpellCard {

    private final double radius;
    private final int cost;
    private int damage;

    public FireballSpell() {
        radius = 2.5;
        cost = 4;
        damage = 325;
    }
    @Override
    public void levelUp(int level) {
        if (level == 2) {
            damage = 357;
        } else if (level == 3) {
            damage = 393;
        } else if (level == 4) {
            damage = 432;
        } else if (level == 5) {
            damage = 474;
        } else {
            System.out.println("Illegal level!");
        }
    }
}
