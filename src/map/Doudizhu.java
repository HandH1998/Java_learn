package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Doudizhu {
    public static void main(String[] args) {
        //准备牌
        HashMap<Integer,String> poker=new HashMap<>();
        ArrayList<Integer> pokerIndex=new ArrayList<>();

        String[] colors={"♠","♥","♣","♦"};
        String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.put(0,"大王");
        poker.put(1,"小王");
        pokerIndex.add(0);
        pokerIndex.add(1);
        int index=2;
        for (int i = 0; i < numbers.length; i++) {
            for (int i1 = 0; i1 < colors.length; i1++) {
                poker.put(index,colors[i1]+numbers[i]);
                pokerIndex.add(index++);
            }
        }
//        System.out.println(poker);
//        System.out.println(pokerIndex);
        //洗牌

        Collections.shuffle(pokerIndex);

        System.out.println(pokerIndex);
        //发牌
        ArrayList<Integer> player01=new ArrayList<>();
        ArrayList<Integer> player02=new ArrayList<>();
        ArrayList<Integer> player03=new ArrayList<>();
        ArrayList<Integer> left=new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            if(i>=51){
                left.add(pokerIndex.get(i));
            }else if(i%3==0){
                player01.add(pokerIndex.get(i));
            }else if(i%3==1){
                player02.add(pokerIndex.get(i));
            }else{
                player03.add(pokerIndex.get(i));
            }
        }
//        System.out.println(player01);
//        System.out.println(player02);
//        System.out.println(player03);
//        System.out.println(left);

        //排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(left);

//        System.out.println(player01);
//        System.out.println(player02);
//        System.out.println(player03);
//        System.out.println(left);

        //看牌
        showpoker("player01",player01,poker);


    }
    public static void showpoker(String name,ArrayList<Integer> list,HashMap<Integer,String> map){
        System.out.print(name+"的牌：");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(map.get(list.get(i))+" ");

        }
    }

}
