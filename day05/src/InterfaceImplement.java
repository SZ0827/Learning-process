public class InterfaceImplement implements Interface2{
     Student[] students;
     public InterfaceImplement() {
     }
     public InterfaceImplement(Student[] students) {
         this.students = students;
     }
    @Override
    public void printMaxScore() {
        double Max=0;
        for (Student student : students) {
            if (student.getScore()>Max){
                Max=student.getScore();
            }
        }
        System.out.println("最高分是："+Max);
    }

    @Override
    public void printSexCount() {
        int man=0;
        int woman=0;
        for (Student student : students) {
            if (student.getSex()=='男'){
                man++;
            }else {
                woman++;
            }
        }
System.out.println("男生人数"+man+"女生人数"+woman);
     }
}
