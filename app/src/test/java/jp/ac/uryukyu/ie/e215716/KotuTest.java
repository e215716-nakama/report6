/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jp.ac.uryukyu.ie.e215716;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KotuTest {
    @Test 
    void countKotuTest() {
        Kotu demoKotu = new Kotu();
        demoKotu.addHai("i-wan", 1);
        demoKotu.addHai("i--wan",1);
        demoKotu.addHai("i---wan", 1);
        demoKotu.countMentu(demoKotu.getHai());
        int oneKotu = 1;
        assertEquals(oneKotu, demoKotu.getCountKotu());
    }
}
