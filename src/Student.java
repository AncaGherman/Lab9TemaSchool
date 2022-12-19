public class Student extends Person{
    private String classes;
    private String grades;

    public Student(String name, String email, String classes, String grades) {
        super(name, email);
        this.classes = classes;
        this.grades = grades;
    }
}
