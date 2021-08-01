package model.card.spells;

public class ArrowsSpell extends SpellCard{

    private int damage;

    public ArrowsSpell() {
        super(3 , 4);
        damage = 144;
    }
    @Override
    public void levelUp(int level) {
        if (level == 2) {
            damage = 156;
        } else if (level == 3) {
            damage = 174;
        } else if (level == 4) {
            damage = 189;
        } else if (level == 5) {
            damage = 210;
        } else {
            System.out.println("Illegal level!");
        }
    }
}
