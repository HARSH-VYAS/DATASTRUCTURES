package com.company;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Harsh P Vyas on 11/3/2016.
 */
public class AmazonLocker {

    ArrayList<String> shipping = new ArrayList<String>();
    HashMap<Integer, Integer> lockerNumberRegistry = new HashMap<Integer, Integer>();

    public AmazonLocker(ArrayList<String> shipping, HashMap<Integer,Integer> lockerNumberRegistry){
        this.shipping = shipping;
        this.lockerNumberRegistry=lockerNumberRegistry;

    }

    public boolean isShipped(int packageNo){
        if(shipping.get(packageNo)=="shipped")
            return false;
        else
            return true;

    }

    public int getLockerNumber(int zipcode){
        return lockerNumberRegistry.get(zipcode);

    }



}
