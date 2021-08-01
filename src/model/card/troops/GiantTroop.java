package model.card.troops;

public class GiantTroop extends TroopCard {


    public GiantTroop() {

        super(2000 , 126 , 2.5 ,  "Slow" , "Ground" , 0 , true  , 1 , 5)  ;

    }

    @Override
    public void levelUp(int level) {
        if (level == 2) {
            HP = 2200;
            damage = 138;
        } else if (level == 3) {
            HP = 2420;
            damage = 152;
        } else if (level == 4) {
            HP = 2660;
            damage = 167;
        } else if (level == 5) {
            HP = 2920;
            damage = 183;
        } else {
            System.out.println("Illegal level!");
        }
    }
}
