package Java.com;

public class TestCallback {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("按钮被点击了");
            }
        });
        //()->System.out.println("按钮被点击了");
        button.clik();
    }
}
