package Java.com;

public class Study {
    public static void main(String[] args) {
        config config = new config();
        System.out.println("配置值："+config.CONFIG_VALUE);
    }
    public static class config{
        public static  String CONFIG_VALUE ;
        public config(){
            System.out.println("静态");
        }
        static {
            CONFIG_VALUE = "config value";
            System.out.println("config init");
        }
    }
}
