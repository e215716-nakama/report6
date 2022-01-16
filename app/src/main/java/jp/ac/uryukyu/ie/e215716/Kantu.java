package jp.ac.uryukyu.ie.e215716;

import java.util.*;

/**
 * 槓子クラス
 *  int count; //countMentuで使用する値(=0)
 *  int count2; //countMentuで使用する値(=0)
 *  int countZyantou; //槓子の数(=0)
 */
public class Kantu extends Mentu {
    private int count;
    private int count2;
    private int countKantu;

    /**
     * countKantuのgetter。countKantuを取得する。
     * @return countKantu
     */
    public int getCountKantu() {
        return countKantu;
    }

    /**
     * コンストラクタ。count,count2,countKantuを0に指定する。
     */
    public Kantu(){
        this.count =0;
        this.count2 = 0;
        this.countKantu = 0;
    }

    /**
     * 槓子を数えるメソッド。
     * 加えた牌の中に槓子が何通りあるか数えて、出力する。
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
        System.out.println("槓子が"+countKantu+"通りあります");
    }
}