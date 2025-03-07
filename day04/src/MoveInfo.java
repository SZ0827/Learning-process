public class MoveInfo {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;
    private String actor;
    public MoveInfo(int id, String name, double price, String actor) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.actor = actor;
    }
    public MoveInfo(){}
 public String toString() {
        return "MoveInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", actor='" + actor + '\'' +
                '}';
    }
}
