package collection.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        //准备牌
        ArrayList<String> poker=new ArrayList<>();
        String[] colors={"♠","♥","♣","♦"};
        String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");

        for (String s1 : colors) {
            for (String s2 : numbers) {
                poker.add(s1+s2);
            }
        }

        //洗牌
        Collections.shuffle(poker);
//        System.out.println(poker);

        //发牌
        ArrayList<String> player01=new ArrayList<>();
        ArrayList<String> player02=new ArrayList<>();
        ArrayList<String> player03=new ArrayList<>();
        ArrayList<String> left=new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if(i>=51){
                left.add(p);
            }else if(i%3==0){
                player01.add(p);
            }else if(i%3==1){
                player02.add(p);
            }else {
                player03.add(p);
            }
        }

        //看牌
        System.out.println(player01);
        System.out.println(player02);
        System.out.println(player03);
        System.out.println(left);

    }
}
