public class User {
    public static void main(String[] args) {
        GoldCard goldCard=new GoldCard("123456789","小明","123456000",1000.0);
        SliverCard sliverCard=new SliverCard("123456789","小花","123456789",100.0);
         goldCard.consum(100);
        System.out.println(goldCard.getCardMoney());
        sliverCard.consum(12);
        System.out.println(sliverCard.getCardMoney());
    }
    public static void pay(Card a){
        System.out.println("请刷卡");
        a.consum(100);
    }
}
