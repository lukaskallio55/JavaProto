import java.io.FileNotFoundException;
import java.util.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseFileService implements ICourseFileService {
    public List<Student> students = new ArrayList<>();
    public List<Course> courses = new ArrayList<>();

    @Override
    public List<Student> readStudentsFromFile(String filePath) throws FileNotFoundException {
        File f = new File(filePath);
        Scanner sc = new Scanner(f);

        while(sc.hasNextLine()){
            String[] studentInfo = sc.nextLine().split(" ");
            Student s = new Student(studentInfo[0], studentInfo[1]);

            students.add(s);
        }
        sc.close();
        return students;
    }

    @Override
    public List<Course> readCoursesFromFile(String filePath) throws FileNotFoundException {
        File f = new File(filePath);
        Scanner sc1 = new Scanner(f);
        Scanner sc2 = new Scanner(f);

        while(sc1.hasNextLine()){
            String input = sc1.nextLine();

            String[] words = input.split("--");
            String[] courseInfo = sc2.nextLine().split("--");

            if(words.length == 3){
                LocalCourse l = new LocalCourse(courseInfo[0], courseInfo[1], courseInfo[2]);
                courses.add(l);
            } else{
                OnlineCourse o = new OnlineCourse(courseInfo[0], courseInfo[1], courseInfo[2]);
                courses.add(o);
            }
        }
        sc1.close();
        sc2.close();
        return courses;
    }
}