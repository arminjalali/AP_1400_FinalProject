package model.card.spells;

import model.card.Card;

public abstract class SpellCard extends Card {
     int cost;
     double radius;

    public SpellCard(int cost, double radius) {
        this.cost = cost;
        this.radius = radius;
    }

    public abstract void levelUp(int level);
}
