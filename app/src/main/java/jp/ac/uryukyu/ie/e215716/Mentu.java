package jp.ac.uryukyu.ie.e215716;

import java.util.*;

/**
 * 面子クラス(抽象クラス)
 *  Map<String, Integer> hai; //牌(牌の名前,牌に設定された数値)
 */
public abstract class Mentu {
    private Map<String, Integer> hai;

    /**
     * haiのgetter。haiを取得する。
     * @return hai
     */
    public Map<String, Integer> getHai() {
        return hai;
    }

    /**
     * コンストラクタ。手牌のインスタンスを生成。
     */
    public Mentu(){
        hai = new HashMap<>();
    }

    /**
     * 牌を出力するメソッド。
     * Mapのキー、値を出力するメソッド。
     */
    public void printHai(){
        System.out.println(hai);
    }
    
    /**
     * 牌を加えるメソッド。
     * 入力された引数をMapにputする。
     * @param haiName //牌の名前
     * @param haiNumber //牌に設定された数値
     */
    public void addHai(String haiName,Integer haiNumber){
        hai.put(haiName, haiNumber);
    }

    /**
     * 面子を数えるメソッド(抽象メソッド)。
     * 加えた牌の中に面子が何通りあるか数えて、出力する。
     * @param hai //牌(牌の名前,牌に設定された数値)
     */
    public abstract void countMentu(Map<String, Integer> hai);
}
