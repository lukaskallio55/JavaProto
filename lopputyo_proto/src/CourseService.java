import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class CourseService implements ICourseService{
    public List<Course> courses = new ArrayList<>();
    public List<Course> coursesOfStudent = new ArrayList<>();
    public List<Student> array = new ArrayList<>();
    
    CourseFileService cfs = new CourseFileService();

    public CourseService() throws FileNotFoundException{
        courses = cfs.readCoursesFromFile("./src/courses.txt");
        array = cfs.readStudentsFromFile("./src/students.txt");
    }

    @Override
    public List<Student> getStudents() {
        return array;
    }

    @Override
    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public Student getStudentById(int studentId) {
        List<Student> array = this.getStudents();

        for (Student s : array) {
            if(s.getStudentId() == studentId){
            return s;
            }
        }
        return null;
        }

    @Override
    public Course getCourseById(int courseId) {

        for (Course c : courses) {
            if(c.getClassId() == courseId){
            return c;
            }
        }
        return null;
    }

    @Override
    public List<Course> getCoursesOfStudents(int studentId) {

        boolean b;

        for (Course c : courses) {
            b = c.getStudent(studentId);
            if(b){
                coursesOfStudent.add(c);
            }
        }
        return coursesOfStudent;
    }

    @Override
    public boolean addStudentToCourse(int studentId, int courseId) {

        for (Course c : courses) {
            if(c.getClassId() == courseId){
                boolean a = c.addStudent(studentId);
                if(a){
                    return true;
                }
            }
        }
        return false;
    }    
}