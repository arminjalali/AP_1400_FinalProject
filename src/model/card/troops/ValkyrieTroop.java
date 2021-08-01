package model.card.troops;

public class ValkyrieTroop extends TroopCard {


    public ValkyrieTroop() {

        super(2000 , 126 , 2.5 ,  "Slow" , "Ground" , 0 , true  , 1 , 5)  ;

    }

    @Override
    public void levelUp(int level) {
        if (level == 2) {
            HP = 968;
            damage = 132;
        } else if (level == 3) {
            HP = 1064;
            damage = 145;
        } else if (level == 4) {
            HP = 1170;
            damage = 159;
        } else if (level == 5) {
            HP = 1284;
            damage = 175;
        } else {
            System.out.println("Illegal level!");
        }
    }
}
