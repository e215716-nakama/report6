import jp.ac.uryukyu.ie.e215716.*;


public class Main{
    public static void main(String[] args) {
        Tehai myTehai = new Tehai("私");
        myTehai.addTehai("i-wan", 1);
        myTehai.addTehai("ryan-wan", 2);
        myTehai.addTehai("san-wan", 3);
        myTehai.printTehai();
        myTehai.tehaisuu();
        
        Syuntu syuntu = new Syuntu(0);
        syuntu.addHai("i-wan", 1);
        syuntu.addHai("ryan-wan", 2);
        syuntu.addHai("san-wan", 3);
        syuntu.printHai();
        syuntu.countMentu(syuntu.getHai());

        Kotu kotu = new Kotu(0,0,0);
        kotu.addHai("i-wan", 1);
        kotu.addHai("i--wan",1);
        kotu.addHai("i---wan", 1);
        kotu.printHai();
        kotu.countMentu(kotu.getHai());

        Kantu kantu = new Kantu(0, 0, 0);
        kantu.addHai("i-wan", 1);
        kantu.addHai("i--wan", 1);
        kantu.addHai("i---wan", 1);
        kantu.addHai("i----wan", 1);
        kantu.printHai();
        kantu.countMentu(kantu.getHai());

        Zyantou zyantou = new Zyantou(0,0,0);
        zyantou.addHai("i-wan", 1);
        zyantou.addHai("i--wan",1);
        zyantou.printHai();
        zyantou.countMentu(zyantou.getHai());
    }
}
