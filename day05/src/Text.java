public class Text {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("张三", '男', 100);
        students[1] = new Student("李四", '女', 99);
        students[2] = new Student("王五", '男', 98);
        students[3] = new Student("赵六", '女', 97);
        students[4] = new Student("孙七", '男', 96);
        students[5] = new Student("钱八", '女', 95);
        students[6] = new Student("李九", '男', 94);
        students[7] = new Student("赵十", '女', 93);
        students[8] = new Student("孙十一", '男', 92);
        students[9] = new Student("钱十二", '女', 91);
       ClassDataInterimpel classDataInterimpel = new ClassDataInterimpel(students);
       classDataInterimpel.printAllStudent();
       classDataInterimpel.printAvageScre();
       InterfaceImplement interfaceImplement = new InterfaceImplement(students);
       interfaceImplement.printMaxScore();
       interfaceImplement.printSexCount();

    }
}
