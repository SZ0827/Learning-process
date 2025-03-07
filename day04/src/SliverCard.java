public class SliverCard extends Card{

    @Override
    public void consum(double money) {
        System.out.println("你当前消费金额" + money + "元");
        System.out.println("优惠后价格" + money * 0.7);
        if(getCardMoney()<money*0.9){
            System.out.println("金额不足，请充钱");
        }else{
            setCardMoney(getCardMoney()-money*0.7);
        }
    }
    public SliverCard(String cardId, String carname, String cardPhone, double cardMoney) {
        super(cardId, carname, cardPhone, cardMoney);
    }
}
