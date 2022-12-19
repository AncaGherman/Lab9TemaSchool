public class School {
    public static void main(String[] args) {
        Person p1 = new Person("Popescu", "popescu@gmail.com");
        Person p2 = new Person("Ionescu", "ionescu@gmail.com");
        Teacher t1 = new Teacher(p1.getName(), p1.getEmail(), "Informatics");
        Teacher t2 = new Teacher(p2.getName(), p2.getEmail(), "Biology");
        Teacher t3 = new Teacher(p1.getName(), p1.getEmail(), "Mathematics");

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
    }
}
