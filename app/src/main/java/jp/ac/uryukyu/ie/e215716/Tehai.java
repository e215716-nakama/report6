package jp.ac.uryukyu.ie.e215716;

import java.util.*;

public class Tehai {
    private String name;
    private Map<String, Integer> hai;

    public String getName() {
        return name;
    }
    public Map<String, Integer> getHai() {
        return hai;
    }

    public Tehai(String name){
        this.name = name;
        hai = new HashMap<>();
    }

    public void addTehai(String haiName,Integer haiNumber){
        hai.put(haiName, haiNumber);
    }

    public void tehaisuu(){
        if(hai.size()==14){
            System.out.println("手牌の数は正しいです");
        }else{
            System.out.println("手配の数が正しくありません");
        }
    } 

    public void printTehai(){
        System.out.println(hai.keySet());
    }   
}