import java.util.List;

public interface ICourseService {
    List<Student> getStudents();

    List<Course> getCourses();

    Student getStudentById(int studentId);

    Course getCourseById(int courseId);

    List<Course> getCoursesOfStudents(int studentId);

    boolean addStudentToCourse(int studentId, int courseId);
}