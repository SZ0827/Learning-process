import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String cardId;
    private String carname;
    private String cardPhone;
    private double cardMoney;

//    public String getCardId() {
//        return cardId;
//    }
//
//    public void setCardId(String cardId) {
//        this.cardId = cardId;
//    }
//
//    public String getCarname() {
//        return carname;
//    }
//
//    public void setCarname(String carname) {
//        this.carname = carname;
//    }
//
//    public String getCardPhone() {
//        return cardPhone;
//    }
//
//    public void setCardPhone(String cardPhone) {
//        this.cardPhone = cardPhone;
//    }
//
//    public double getCardMoney() {
//        return cardMoney;
//    }
//
//    public void setCardMoney(double cardMoney) {
//        this.cardMoney = cardMoney;
//    }
//
//    public Card() {
//    }
//
//    public Card(String cardId, String carname, String cardPhone, double cardMoney) {
//        this.cardId = cardId;
//        this.carname = carname;
//        this.cardPhone = cardPhone;
//        this.cardMoney = cardMoney;
//    }

    //预存金额
    public void deposit(double money){
        this.cardMoney += money;
    }
public void consum(double money){
        this.cardMoney -= money;
}
}
