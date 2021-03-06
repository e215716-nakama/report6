/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jp.ac.uryukyu.ie.e215716;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TehaiTest {
    /**
     * 牌がしっかりと追加されて数があっているのかを検証
     * 検証手順
     * (1)手牌を準備して、それに14牌追加する
     * (2)しっかりと追加されたのであれば手牌の大きさは14となるはず。それを検証する。
     */
    @Test 
    void addTehaiTest(){
        int defaultTehaisuu = 14;
        Tehai demoTehai = new Tehai("東家");
        demoTehai.addTehai("i-wan", 1);
        demoTehai.addTehai("ryan-wan", 2);
        demoTehai.addTehai("san-wan", 3);
        demoTehai.addTehai("su-wan", 4);
        demoTehai.addTehai("u-wan", 5);
        demoTehai.addTehai("ro-wan", 6);
        demoTehai.addTehai("ti-wan", 7);
        demoTehai.addTehai("pa-wan", 8);
        demoTehai.addTehai("kyu-wan", 9);
        demoTehai.addTehai("i-pin", 11);
        demoTehai.addTehai("ryan-pin", 12);
        demoTehai.addTehai("san-pin", 13);
        demoTehai.addTehai("su-pin", 14);
        demoTehai.addTehai("u-pin", 15);
        assertEquals(defaultTehaisuu, demoTehai.getHai().size());
    }
}
    