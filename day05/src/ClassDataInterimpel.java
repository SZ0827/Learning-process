import lombok.Data;

@Data
public class ClassDataInterimpel implements Interface1{
    private Student[] students;
    public ClassDataInterimpel() {
    }
    public ClassDataInterimpel(Student[] students) {
        this.students = students;
    }
    @Override
    public void printAllStudent() {
        for (Student student : students) {
            System.out.println(student);
        }

    }

    @Override
    public void printAvageScre() {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum =sum+ students[i].getScore();
        }
        System.out.println("平均成绩为：" + sum / students.length);
    }
}
