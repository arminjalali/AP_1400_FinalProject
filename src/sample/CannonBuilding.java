package sample;

public class CannonBuilding extends Building {
    private final double hitSpeed;
    private final String target;
    private final double range;
    private final int lifeTime;
    private final int cost;
    private int HP;
    private int damage;

    public CannonBuilding() {
        hitSpeed = 0.8;
        target = "Ground";
        range = 5.5;
        lifeTime = 30;
        cost = 3;
        HP = 380;
        damage = 60;
    }
    @Override
    public void levelUp(int level) {
        if (level == 2) {
            HP = 418;
            damage = 66;
        } else if (level == 3) {
            HP = 459;
            damage = 72;
        } else if (level == 4) {
            HP = 505;
            damage = 79;
        } else if (level == 5) {
            HP = 554;
            damage = 89;
        } else {
            System.out.println("Illegal level!");
        }
    }
}
