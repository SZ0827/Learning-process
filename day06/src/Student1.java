import java.util.ArrayList;
import java.util.List;

public class Student1 extends Person implements Displayable{
    private int id;
    private List<String> course;
    public Student1(String name, int age, int id){
        super(name,age);
        this.id=id;
        this.course=new ArrayList<>();
    }
    public Student1(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

public void addCourse(String course){
    this.course.add(course);
}

    @Override
    public void display() {
        System.out.println("学生id：" + id);
        introduce();
        System.out.println("学生选修的课程："+course);
    }
}
