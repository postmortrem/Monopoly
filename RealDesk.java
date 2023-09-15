package com.company.cucumber.monopoly.desklogics.desk;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@Component
public class RealDesk implements Serializable {

   List<RealEstate> desk = new LinkedList<RealEstate>(Arrays.asList(new RealEstate(Estate.MCDONALDS), new RealEstate(Estate.BURGERKING),
           new RealEstate(Estate.KFC), new RealEstate(Estate.VOLVO), new RealEstate(Estate.JAIL), new RealEstate(Estate.MERCEDES),
           new RealEstate(Estate.FORD), new RealEstate(Estate.GUCCI), new RealEstate(Estate.ADIDAS), new RealEstate(Estate.NIKE),
           new RealEstate(Estate.NIVEA), new RealEstate(Estate.GARNIER), new RealEstate(Estate.GIVENCHY), new RealEstate(Estate.PFIZER),
           new RealEstate(Estate.COURT), new RealEstate(Estate.JOHNSONANDJOHNSON), new RealEstate(Estate.DANAHER), new RealEstate(Estate.APPLE),
           new RealEstate(Estate.MICROSOFT), new RealEstate(Estate.START)));

}
