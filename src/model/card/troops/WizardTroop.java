package model.card.troops;

public class WizardTroop extends TroopCard {


    public WizardTroop() {
        super(340 , 130 , 1.7 , "Medium" , "Any" , 5 , true , 1 , 5);
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
