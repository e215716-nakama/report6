package jp.ac.uryukyu.ie.e215716;

import java.util.*;

/**
 * 順子クラス
 *  int countZyantou; //順子の数(=0)
 */
public class Syuntu extends Mentu {
    private int countSyuntu;

    /**
     * countSyuntuのgetter。countSyuntuを取得する。
     * @return countSyuntu
     */
    public int getCountSyuntu() {
        return countSyuntu;
    }

    /**
     * コンストラクタ。countSyuntuを0に指定する。
     */
    public Syuntu(){
        super();
        this.countSyuntu = 0;
    }

    /**
     * 順子を数えるメソッド。
     * 加えた牌の中に順子が何通りあるか数えて、出力する。
     * @param hai 牌(牌の名前,牌に設定された数値)
     */
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