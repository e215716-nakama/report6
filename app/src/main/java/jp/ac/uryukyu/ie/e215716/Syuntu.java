package jp.ac.uryukyu.ie.e215716;
import java.util.*;

public class Syuntu extends Mentu {
    private int countSyuntu;

    public int getCountSyuntu() {
        return countSyuntu;
    }

    public Syuntu(int countSyuntu){
        super();
        this.countSyuntu = 0;
    }

    @Override
    public void countMentu(Map<String,Integer> hai){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : hai.values()){
            list.add(i);
        }
        for(int j: list){
            for(int k=0;k<list.size();k++){
                if(j+1==list.get(k)){
                    for(int l=0;l<list.size();l++){
                        if(j+2==list.get(l)){
                            countSyuntu+=1;                           
                        }
                    }
                }
            }
        }
        System.out.println("順子が"+countSyuntu+"通りあります");
    }
}