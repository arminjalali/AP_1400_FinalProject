package model.card.spells;

public class RageSpell extends SpellCard {

    private final int damageBoost;
    private final int speedBoost;
    private final int hitSpeed;
    private double duration;

    public RageSpell() {
        super(3 , 5) ;
        damageBoost = 40;
        speedBoost = 40;
        hitSpeed = 40;
        radius = 5;
        cost = 3;
        duration = 6;
    }
    @Override
    public void levelUp(int level) {
        if (level == 2) {
            duration = 6.5;
        } else if (level == 3) {
            duration = 7;
        } else if (level == 4) {
            duration = 7.5;
        } else if (level == 5) {
            duration = 8;
        } else {
            System.out.println("Illegal level!");
        }
    }
}
