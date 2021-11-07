import java.util.List;

public class App {
    private static List<Course> print;

    public static void main(String[] args) throws Exception {
        
        CourseService c = new CourseService();
        print = c.getCourses();
        System.out.println(print);
    }
}