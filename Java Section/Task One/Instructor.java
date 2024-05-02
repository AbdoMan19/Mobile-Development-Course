import java.util.ArrayList;
import java.util.List;

public class Instructor extends User {
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    List<Student>students=new ArrayList<>();
    public Instructor(String name,String username,String password) {
        super(name,username,password);
    }

    public void addStudent(Student student){
        students.add(student);
    }
}
