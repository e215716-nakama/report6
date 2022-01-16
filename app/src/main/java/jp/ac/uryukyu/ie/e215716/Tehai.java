package jp.ac.uryukyu.ie.e215716;

import java.util.*;

/**
 * 手牌クラス
 *  String name; //自風の名前
 *  Map<String, Integer> hai; //手牌(牌の名前,牌に設定された数値)
 */
public class Tehai {
    private String name;
    private Map<String, Integer> hai;

    /**
     * nameのgetter。nameを取得する。
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * haiのgetter。haiを取得する。
     * @return hai
     */
    public Map<String, Integer> getHai() {
        return hai;
    }

    /**
     * コンストラクタ。名前を指定、手牌のインスタンスを生成。
     * @param name 自風の名前
     */
    public Tehai(String name){
        this.name = name;
        hai = new HashMap<>();
    }

    /**
     * 手牌に牌を加えるメソッド。
     * 入力された引数をMapにputする。
     * @param haiName　//牌の名前
     * @param haiNumber //牌に設定された数値
     */
    public void addTehai(String haiName,Integer haiNumber){
        hai.put(haiName, haiNumber);
    }

    /**
     * 手牌の数が正しいのか判定するメソッド。
     * 手牌の数(Mapの長さ)をsize()で取得し、その数が14になっているか判定する。
     */
    public void tehaisuu(){
        if(hai.size()==14){
            System.out.println("手牌の数は正しいです");
        }else{
            System.out.println("手配の数が正しくありません");
        }
    } 

    /**
     * 手牌を出力するメソッド。
     * Mapのキーを羅列して出力する
     */
    public void printTehai(){
        System.out.println(hai.keySet());
    }   
}