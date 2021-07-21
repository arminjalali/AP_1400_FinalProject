package sample;

public class InfernoTowerBuilding extends Building{

    private final double hitSpeed;
    private final String target;
    private final double range;
    private final int lifeTime;
    private final int cost;
    private int HP;
    private int minDamage;
    private int maxDamage;

    public InfernoTowerBuilding(){
        hitSpeed = 0.4;
        target = "Air&Ground";
        range = 6;
        lifeTime = 40;
        cost = 5;
        HP = 800;
        minDamage = 20;
        maxDamage = 400;
    }
    @Override
    public void levelUp(int level){
        if (level == 2){
            HP = 880;
            maxDamage = 22;
            maxDamage = 440;
        }
        else if (level == 3){
            HP = 968;
            minDamage = 24;
            maxDamage = 484;
        }
        else if (level == 4){
            HP = 1064;
            minDamage = 26;
            maxDamage = 532;
        }
        else if (level == 5){
            HP = 1168;
            minDamage = 29;
            maxDamage = 584;
        }
        else {
            System.out.println("Illegal level!");
        }

    }
}
