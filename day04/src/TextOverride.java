public class TextOverride {
    public static void main(String[] args) {
        Student[] students=new Student[3];
        students[0]=new Student("小明",'男',18);
        students[1]=new Student("小红",'女',18);
        students[2]=new Student("小刚",'男',18);
        System.out.println(students[0].toString());
    }
}
class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    private char sex;
    private int age;
    public Student(){}
    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    @Override
    public String toString() {

        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

}
