import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student("张安", 20, "女");
        students[1] = new Student("李四", 16, "男");
        students[2] = new Student("王五", 22, "女");
        students[3] = new Student("赵六", 23, "男");
        students[4] = new Student("孙七", 18, "女");
        students[5] = new Student("钱八", 25, "男");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------");
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAge()>o2.getAge()){
                    return 1;
                }else if(o1.getAge()<o2.getAge()){
                    return -1;
                }
                return 0;
            }
        });
        //遍历数组
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
