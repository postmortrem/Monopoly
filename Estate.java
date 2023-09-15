package com.company.cucumber.monopoly.desklogics.desk;

import com.company.cucumber.monopoly.desklogics.Owner;

import java.io.Serializable;

public enum Estate implements Serializable {
    MCDONALDS(1, "MacDonalds", 250, EstateColour.BLUE),
    BURGERKING(2, "BurgerKing", 150, EstateColour.BLUE), KFC(3, "KFC", 200, EstateColour.BLUE), VOLVO(4, "Volvo", 300, EstateColour.ORANGE), MERCEDES(6, "Mercedes-Benz", 400, EstateColour.ORANGE),
    FORD(7, "Ford", 350, EstateColour.ORANGE), GUCCI(8, "Gucci", 220, EstateColour.PURPLE), ADIDAS(9, "Adidas", 250, EstateColour.PURPLE), NIKE(10, "Nike", 300, EstateColour.PURPLE), NIVEA(11, "Nivea", 100, EstateColour.YELLOW),
    GARNIER(12, "Garnier", 150, EstateColour.YELLOW), GIVENCHY(13, "Givenchy", 200, EstateColour.YELLOW), PFIZER(14, "Pfizer", 400, EstateColour.GREEN), JOHNSONANDJOHNSON(16, "Johnsonh&Johnson", 500, EstateColour.GREEN),
    DANAHER(17, "Danaher", 450, EstateColour.GREEN), APPLE(18, "Apple", 600, EstateColour.BROWN), MICROSOFT(19, "Microsoft", 700, EstateColour.BROWN), START(0), COURT(15), JAIL(5);

    private int cost;
    private double pledgeCost;
    private final int position;
    private LevelUp level;
    private final String name;
    private Owner owner;
    private EstateState state;
    private EstateColour colour;

    Estate() {
        position = 0;
        name = null;
    }

    Estate(int position) {
        this.position = position;
        cost = 0;
        name = null;
    }

    Estate(int position, String name, int cost, EstateColour colour) {
        this.position = position;
        this.cost = cost;
        pledgeCost = (cost * 1.2);
        this.level = LevelUp.TINY;
        this.name = name;
        this.state = EstateState.NOOWNER;
        this.colour = colour;
    }

    void updateBusiness(Estate estate) {
        if (estate.level.equals(LevelUp.TINY))
            this.level = LevelUp.INCREASED;
        else if (estate.level.equals(LevelUp.INCREASED))
            this.level = LevelUp.BIG;
        else if (estate.level.equals(LevelUp.BIG))
            this.level = LevelUp.ENORMOUS;
        else if (estate.level.equals(LevelUp.ENORMOUS))
            this.level = LevelUp.GIANT;
        else System.out.println("your estate can`t be updated!");
    }

    String getName(Estate estate) {
        return estate.name;
    }

    int getCost(Estate estate) {
        return estate.cost;
    }

    void setBoughtState(Estate estate) {
        estate.state = EstateState.BOUGHT;
    }

    void setPledgedState(Estate estate) {
        estate.state = EstateState.PLEDGED;
    }

    double getPledgeCost(Estate estate) {
        return estate.pledgeCost;
    }

    void setCost(Estate estate, int cost) {
        estate.cost = cost;
    }

    int getPosition(Estate estate) {
        return estate.position;
    }

    LevelUp getLevel(Estate estate) {
        return this.level;
    }

    void setOwner(Owner owner, Estate estate) {
        estate.owner = owner;
    }

    Owner getOwner(Estate estate) {
        return estate.owner;
    }

}
