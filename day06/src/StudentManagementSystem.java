import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Student1 student1 = new Student1("张三", 18, 001);
        Student1 student2 = new Student1("李四", 19, 002);
        student1.addCourse("Math");
        student1.addCourse("English");
        student2.addCourse("Chinese");
        Displayable displayable=student1;//接口多态
        displayable.display();
// 控制语句：if-else
        if (student1.getAge() > student2.getAge()) {
            System.out.println(student1.getName() + " is older than " + student2.getName());
        } else {
            System.out.println(student2.getName() + " is older than " + student1.getName());
        }

        // 控制语句：switch
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
        }

        // 控制语句：for 循环
        for (int i = 0; i < 3; i++) {
            System.out.println("For loop iteration: " + i);
        }

        // 控制语句：while 循环
        int count = 0;
        while (count < 3) {
            System.out.println("While loop iteration: " + count);
            count++;
        }
        // 数组
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Array element: " + num);
        }
        List<Student1> students=new ArrayList<>();
        students.add(student1);
        students.add(student2);
        printStudents(students);
        try {
            int result=10/0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally");
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入你的名字");
        String name=scanner.nextLine();
        System.out.println("你好"+name);
    }
    // 泛型指定类型范围Displayable类或者其子类
    public static <T extends Displayable> void printStudents(List<T> students){
        for (T student : students) {
            student.display();
        }
    }
}
