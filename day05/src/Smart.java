public class Smart {
    private static  final Smart smart=new Smart();//饿汉式
    private  Smart(){};//构造器私有化
    public static Smart getInstance(){
        return smart;
    }//返回一个单例
    public void control(JD id){
        System.out.println(id.getName()+"开关状态："+id.isStatus());
        id.swich();
        System.out.println(id.getName()+"开关状态："+id.isStatus());

    }
}
