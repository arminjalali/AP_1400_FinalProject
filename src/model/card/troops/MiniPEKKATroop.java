package model.card.troops;

import model.card.troops.TroopCard;

public class MiniPEKKATroop extends TroopCard {



    public MiniPEKKATroop() {

        super(600, 325 , 1.8 , "Fast" , "Ground" , 0 , false  , 1 , 4);

    }

    @Override
    public void levelUp(int level) {
        if (level == 2) {
            HP = 660;
            damage = 357;
        } else if (level == 3) {
            HP = 726;
            damage = 393;
        } else if (level == 4) {
            HP = 798;
            damage = 432;
        } else if (level == 5) {
            HP = 876;
            damage = 474;
        } else {
            System.out.println("Illegal level!");
        }
    }
}
