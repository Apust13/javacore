package com.apust.Golovach.dec_2013_core.n_13_collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GUN on 12/7/2015.
 */
public class House {

    private String adress;

    List <Man> citizen = new ArrayList<>();

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void putCitizenHome (Man man){
        if(man instanceof Man){
        citizen.add(man);
        } else {
            System.out.println("Arg is not Man type");
        }
    }

    private void viewCitizen(){
        for(Man man : this.citizen){
            System.out.println(man);
        }
    }

    @Override
    public String toString() {
        viewCitizen();
        return adress ;


    }
}
