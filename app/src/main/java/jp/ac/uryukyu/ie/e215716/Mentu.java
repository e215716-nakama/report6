package jp.ac.uryukyu.ie.e215716;

import java.util.*;

public abstract class Mentu {
    private Map<String, Integer> hai;

    public Map<String, Integer> getHai() {
        return hai;
    }

    public Mentu(){
        hai = new HashMap<>();
    }

    public void printHai(){
        System.out.println(hai);
    }

    public void addHai(String haiName,Integer haiNumber){
        hai.put(haiName, haiNumber);
    }

    public abstract void countMentu(Map<String, Integer> hai);
}
