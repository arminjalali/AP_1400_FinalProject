package model.card.troops;

public class BabyDragonTroop extends TroopCard {



    public BabyDragonTroop() {
        super(2000 , 126 , 2.5 ,  "Slow" , "Ground" , 0 , true  , 1 , 5)  ;
    }

    @Override
    public void levelUp(int level) {
        if (level == 2) {
            HP = 880;
            damage = 110;
        } else if (level == 3) {
            HP = 968;
            damage = 121;
        } else if (level == 4) {
            HP = 1064;
            damage = 133;
        } else if (level == 5) {
            HP = 1168;
            damage = 146;
        } else {
            System.out.println("Illegal level!");
        }
    }
}
