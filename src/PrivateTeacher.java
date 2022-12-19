public class PrivateTeacher extends Teacher {
    private String students;

    public PrivateTeacher(String name, String email, String subject, String students) {
        super(name, email, subject);
        this.students = students;
    }
}

