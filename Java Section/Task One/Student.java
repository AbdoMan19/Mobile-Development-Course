import java.util.ArrayList;
import java.util.List;

public class Student extends User{
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    List<Course>courses=new ArrayList<>();
    public Student(String name,String username,String password) {
        super(name,username,password);
    }
    public void addCourse(Course course){
        courses.add(course);
    }

}
