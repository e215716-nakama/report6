package jp.ac.uryukyu.ie.e215716;

import java.util.*;

/**
 * 雀頭クラス
 *  int count; //countMentuで使用する値(=0)
 *  int count2; //countMentuで使用する値(=0)
 *  int countZyantou; //雀頭の数(=0)
 */
public class Zyantou extends Mentu {   
    private int count;
    private int count2;
    private int countZyantou;

    /**
     * countZyantouのgetter。countZyantouを取得する。
     * @return countZyantou
     */
    public int getCountZyantou() {
        return countZyantou;
    }

    /**
     * コンストラクタ。count,count2,countZyantouを0に指定する。
     */
    public Zyantou(){
        this.count =0;
        this.count2 = 0;
        this.countZyantou = 0;
    }

    /**
     * 雀頭を数えるメソッド。
     * 加えた牌の中に雀頭が何通りあるか数えて、出力する。
     * @param hai ////牌(牌の名前,牌に設定された数値)
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
        System.out.println("雀頭が"+countZyantou+"通りあります");
    }
}
