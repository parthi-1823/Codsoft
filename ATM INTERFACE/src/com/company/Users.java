package com.company;
import java.util.HashMap;

public class Users {
    private HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();

    public void addToMap(int key,int val){
        map.put(key,val);
    }
    public int getValue(int key){
        return map.get(key);
    }

    public boolean contains(int key){
        if(map.containsKey(key)){
            return true;
        }
        return false;
    }

    public int checkBalance(int key){
        return map.get(key);
    }


}
