import java.util.concurrent.atomic.AtomicInteger;

public class Student {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int StudentId;
    private String firstName;
    private String lastName;

    public Student(){
        this("","");
    }

    public Student(String firstName, String lastName){
        this.StudentId = count.incrementAndGet();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStudentId() {
        return this.StudentId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return firstName + " " + lastName;
    }
}