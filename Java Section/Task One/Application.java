import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    private Scanner sc=new Scanner(System.in);
    private List<User>users=new ArrayList<>();
    private User userAuthentication(String username,String password){
        for (User user:users) {
            if(username.equals(user.getUsername())&&password.equals(user.getPassword())){
                return user;
            }
        }

        return null;
    };
    private User login(){
        String username,password;
        User user=null;
        while (user==null){
            System.out.print("Enter username:");
            username= sc.nextLine();
            System.out.print("Enter password:");
            password= sc.nextLine();
            user=userAuthentication(username,password);
            if (user==null)System.out.println("Invalid username or password. Please try again.");
        }
        System.out.println("Login successfully");
        return user;

    }
    public void start(){
        System.out.println("Welcome to Course Center Application!");
        User user=login();
        if (user instanceof Student) {
            getStudentMenu((Student) user);
        }else if (user instanceof Instructor){
            getInstructorMenu((Instructor)user);
        }

    }
    private void getStudentMenu(Student student){
        System.out.println("List of Courses: ");
        for (Course course:student.getCourses()){
            System.out.println("- "+course.getName());
        }
    }
    private void getInstructorMenu(Instructor instructor){
        System.out.println("List of Students: ");
        for (Student student:instructor.getStudents()){
            System.out.println("- "+student.getName());
        }
    }
    public void addStudent(Student student){
        users.add(student);
    }
    public void addInstrctor(Instructor instructor){
        users.add(instructor);
    }

}
