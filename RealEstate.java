package com.company.cucumber.monopoly.desklogics.desk;

import com.company.cucumber.monopoly.desklogics.Owner;
import lombok.Data;

import java.io.Serializable;

@Data
public class RealEstate implements Serializable {

    private String name;
    private Estate estate;
    private int deskPosition;
    private int price;
    private LevelUp lvl;
    private EstateState status;

    RealEstate(Estate estate) {
        this.estate = estate;
        this.name = estate.getName(estate);
        this.deskPosition = estate.getPosition(estate);
        this.price = estate.getCost(estate);
        this.lvl = estate.getLevel(estate);
    }

    void setStatus(RealEstate estate){

    }
}
