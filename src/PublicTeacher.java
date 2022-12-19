public class PublicTeacher extends Teacher {
    private String school;

    public PublicTeacher(String name, String email, String subject, String school) {
        super(name, email, subject);
        this.school = school;
    }
}
