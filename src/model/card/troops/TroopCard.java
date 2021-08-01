package model.card.troops;

import model.card.Card;

public abstract class TroopCard extends Card {
     int HP;
     int damage;
     double hitSpeed;
     String speed;
     String target;
     double range;
     boolean areaSplash;
     int count;
     int cost;

    public TroopCard(int HP, int damage, double hitSpeed, String speed, String target, double range, boolean areaSplash, int count, int cost) {
        this.HP = HP;
        this.damage = damage;
        this.hitSpeed = hitSpeed;
        this.speed = speed;
        this.target = target;
        this.range = range;
        this.areaSplash = areaSplash;
        this.count = count;
        this.cost = cost;
    }

    public abstract void  levelUp(int level);

}
