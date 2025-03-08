public class Test {
    public static void main(String[] args) {
        //面向对象家具控制系统
        JD[] jds = new JD[3];
        jds[0] = new JD("电视", true);
        jds[1] = new JD("洗衣机", false);
        jds[2] = new JD("空调", true);
        Smart smart =Smart.getInstance();
       smart.control(jds[0]);
    }
}
