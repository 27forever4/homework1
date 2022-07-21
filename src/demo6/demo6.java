package demo6;

public class demo6 {
    public static void main(String[] args) {
        Student student=new Student();
        student.age=19;
        student.hobby="足球";
        student.clas=13;
        student.name="侯永健";
        student.show();
        Teacher teacher=new Teacher();
        teacher.direction="信息安全";
        teacher.school="密码学";
        teacher.name="李昕冉";
        teacher.age=18;
        teacher.show();
    }
}
