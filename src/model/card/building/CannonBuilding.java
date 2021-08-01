package model.card.building;

public class CannonBuilding extends Building {

    public CannonBuilding() {
        super(0.8 , "Ground" , 5.5 , 30 , 3 , 380 , 60) ;
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
