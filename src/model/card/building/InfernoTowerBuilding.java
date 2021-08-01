package model.card.building;

public class InfernoTowerBuilding extends Building{


    public InfernoTowerBuilding(){
        super(0.8 , "Ground" , 5.5 , 30 , 4 , 380 , 60) ;

    }
    @Override
    public void levelUp(int level){
        if (level == 2){
            HP = 880;
        }
        else if (level == 3){
            HP = 968;
        }
        else if (level == 4){
            HP = 1064;
        }
        else if (level == 5){
            HP = 1168;
        }
        else {
            System.out.println("Illegal level!");
        }

    }
}
