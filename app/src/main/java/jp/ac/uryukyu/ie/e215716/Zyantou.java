package jp.ac.uryukyu.ie.e215716;

import java.util.*;
public class Zyantou extends Mentu {   
    private int count;
    private int count2;
    private int countZyantou;

    public Zyantou(int count,int count2,int countZyantou){
        this.count =0;
        this.count2 = 0;
        this.countZyantou = 0;
    }

    @Override
    public int countMentu(Map<String,Integer> hai){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : hai.values()){
            list.add(i);
        }
        for(int j: list){
            count=0;
            for(int k=0;k<list.size();k++){
                if(j==list.get(k)){
                    count +=1;
                    if(count==2){                        
                        count2+=1;
                        if(count2==2){
                            count2=0;
                            countZyantou+=1;
                        }                        
                    }
                }
            }         
        }
        return countZyantou;
    }
}
