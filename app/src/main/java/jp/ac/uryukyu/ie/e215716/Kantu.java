package jp.ac.uryukyu.ie.e215716;
import java.util.*;
public class Kantu extends Mentu {
    private int count;
    private int count2;
    private int countKantu;

    public Kantu(int count,int count2,int countKantu){
        this.count =0;
        this.count2 = 0;
        this.countKantu = 0;
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
                    if(count==4){
                        count=0;
                        count2+=1;
                        if(count2==4){
                            count2=0;
                            countKantu+=1;
                        }                        
                    }
                }
            }         
        }
        return countKantu;
    }
}