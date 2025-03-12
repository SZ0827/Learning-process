package Game;


import java.util.*;

public class Room {
    private List<Gard> card = new ArrayList<>();
    int count=0;
    { String[] nums= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] colors= {"♥","♦","♣","♠"};
    for(String num:nums){
        count++;
        for(String color:colors){
            card.add(new Gard(num,color,count));
        }
    }
//    card.add(new Gard("","小王"));
//    card.add(new Gard("","大王"));
    Collections.addAll(card, new Gard("","小王",++count),new Gard("","大王",++count));
        System.out.println(card);

    }
    public void start() {
        Collections.shuffle(card);//打乱牌的顺序
        Map<String,List<Gard>> players=new HashMap<>();
        List<Gard> zs=new ArrayList<>();
        players.put("张三",zs);
        List<Gard> ls=new ArrayList<>();
        players.put("李四",ls);
        List<Gard> wz=new ArrayList<>();
        players.put("王五",wz);
        for(int i=0;i<card.size()-3;i++){
            if(i%3==0){
                zs.add(card.get(i));
            }else if(i%3==1){
                ls.add(card.get(i));
            }else{
                wz.add(card.get(i));
            }
        }
        sortCard(zs);
        sortCard(ls);
        sortCard(wz);
        List<Gard> lastGard=card.subList(card.size()-3,card.size());
        for(Map.Entry<String,List<Gard>> entry:players.entrySet()){
            System.out.println(entry.getKey()+"的牌是"+entry.getValue());
        }
        System.out.println("底牌是"+lastGard);}


        private void sortCard(List<Gard> card){
//            card.sort((o1, o2) -> o1.getCount()-o2.getCount());
            card.sort(Comparator.comparingInt(Gard::getCount));
//            Collections.sort(card, new Comparator<Gard>() {
//                @Override
//                public int compare(Gard o1, Gard o2) {
//                    return o1.getCount()-o2.getCount();
//                }
//            });

        }






}
