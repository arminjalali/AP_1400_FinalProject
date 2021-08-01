package model.card.troops;

public class ArcherTroop extends TroopCard {

    public ArcherTroop() {
        super(125, 33, 1.2 , "medium" , "any" , 5 , false , 2 , 3);
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
