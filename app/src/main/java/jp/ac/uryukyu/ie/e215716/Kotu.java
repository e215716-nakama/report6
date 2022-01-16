package jp.ac.uryukyu.ie.e215716;

import java.util.*;

/**
 * 刻子クラス
 *  int count; //countMentuで使用する値(=0)
 *  int count2; //countMentuで使用する値(=0)
 *  int countKotu; //刻子の数(=0)
 */
public class Kotu extends Mentu {
    private int count;
    private int count2;
    private int countKotu;

    /**
     * countKotuのgetter。countKotuを取得する。
     * @return countKotu
     */
    public int getCountKotu() {
        return countKotu;
    }

    /**
     * コンストラクタ。count,count2,countKotuを0に指定する。
     */
    public Kotu(){
        this.count =0;
        this.count2 = 0;
        this.countKotu = 0;
    }

    /**
     * 刻子を数えるメソッド。
     * 加えた牌の中に刻子が何通りあるか数えて、出力する。
     * @param hai 牌(牌の名前,牌に設定された数値)
     */
    @Override
    public void countMentu(Map<String,Integer> hai){
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
        System.out.println("刻子が"+countKotu+"通りあります");
    }
}