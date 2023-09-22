public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "john";
        student.introduce();
        student.school = "middle school";
        student.study();

        Teacher teacher = new Teacher();
        teacher.name ="bob";
        teacher.subject ="math";
        teacher.introduce();
        teacher.teach();
    }
}