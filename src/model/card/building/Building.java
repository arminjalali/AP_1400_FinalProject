package model.card.building;

public abstract class Building {

    private double hitSpeed;
    private String target;
    private double range;
    private int lifeTime;
    private int cost;
     int HP;
     int damage ;

    public Building(double hitSpeed, String target, double range, int lifeTime, int cost, int HP, int damage) {
        this.hitSpeed = hitSpeed;
        this.target = target;
        this.range = range;
        this.lifeTime = lifeTime;
        this.cost = cost;
        this.HP = HP;
        this.damage = damage ;
    }

    public void levelUp(int num){

    }
}
