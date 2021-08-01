package model.card.troops;

public class BarbarianTroop extends TroopCard {

    public BarbarianTroop(){
        super(2000 , 126 , 2.5 ,  "Slow" , "Ground" , 0 , true  , 1 , 5)  ;

    }
    @Override
    public void levelUp(int level) {
        if (level == 2) {
            HP = 330;
            damage = 82;
        } else if (level == 3) {
            HP = 363;
            damage = 90;
        } else if (level == 4) {
            HP = 438;
            damage = 99;
        } else if (level == 5) {
            HP = 480;
            damage = 109;
        } else {
            System.out.println("Illegal level!");
        }
    }
}
