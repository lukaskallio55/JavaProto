import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Course {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int CourseId;
    private String CourseName;
    private String TeacherName;
    private List<Integer> studentsOnCourse = new ArrayList<Integer>();

    public Course(){
        this("","");
    }

    public Course(String ClassName, String TeacherName){
        this.CourseId = count.incrementAndGet();
        this.CourseName = ClassName;
        this.TeacherName = TeacherName;
    }

    public int getClassId() {
        return this.CourseId;
    }

    public String getClassName() {
        return this.CourseName;
    }

    public void setClassName(String ClassName) {
        this.CourseName = ClassName;
    }

    public String getTeacherName() {
        return this.TeacherName;
    }

    public void setTeacherName(String TeacherName) {
        this.TeacherName = TeacherName;
    }

    public List<Integer> getStudents(){
        return this.studentsOnCourse;
    }

    public boolean addStudent(int studentId){
        studentsOnCourse.add(studentId);
        return true;
    }

    public boolean getStudent(int studentId){
        
        boolean b = studentsOnCourse.contains(studentId);
        if(b){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return CourseName + " " + TeacherName;
    }
}