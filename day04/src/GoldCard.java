public class GoldCard extends Card{

    @Override
    public void consum(double money) {
        System.out.println("你当前消费金额" + money + "元");
        System.out.println("优惠后价格" + money * 0.9);
        if(getCardMoney()<money*0.9){
            System.out.println("金额不足，请充钱");
        }else{
        setCardMoney(getCardMoney()-money*0.9);
        if(money*0.9>200){
            printTicket();
        }else{
            System.out.println("消费不满足");
        }
    }}
        public GoldCard(String cardId, String carname, String cardPhone, double cardMoney) {
            super(cardId, carname, cardPhone, cardMoney);
        }
    //打印西侧票
    public void printTicket(){
        System.out.println("欢迎使用金卡,送你洗车卷");
    }
}
