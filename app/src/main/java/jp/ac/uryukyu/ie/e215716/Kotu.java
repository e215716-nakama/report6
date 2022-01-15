package jp.ac.uryukyu.ie.e215716;
import java.util.*;
public class Kotu extends Mentu {
    private int count;
    private int count2;
    private int countKotu;

    public Kotu(int count,int count2,int countMentu){
        this.count =0;
        this.count2 = 0;
        this.countKotu = 0;
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
                    if(count==3){
                        count2+=1;
                        if(count2==3){
                            count2=0;
                            countKotu+=1;
                        }                        
                    }
                }
            }         
        }
        return countKotu;
    }
}