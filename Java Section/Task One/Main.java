public class Main {
    public static void main(String[] args) {
        Application app=new Application();
        Instructor instructor1=new Instructor("abdo","abdoman","123");
        Student student1=new Student("student1","student1","123");
        student1.addCourse(new Course("Java Programming"));
        student1.addCourse(new Course("Web Development"));
        app.addStudent(student1);
        Student student2=new Student("student2","student2","123");
        app.addStudent(student2);
        Student student3=new Student("student3","student3","123");
        app.addStudent(student3);
        instructor1.addStudent(student1);
        instructor1.addStudent(student2);
        app.addInstrctor(instructor1);
        app.start();

    }
}
