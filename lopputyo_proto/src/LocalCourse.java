public class LocalCourse extends Course{
    private String classRoom;
    private static int studentCounter = 0;

    public LocalCourse(){
        this("","","");
    }

    public LocalCourse(String ClassName, String TeacherName, String classRoom){
        super(ClassName, TeacherName);
        this.classRoom = classRoom;
    }

    public String getClassRoom() {
        return this.classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public boolean addStudent(int studentId) {
        if(studentCounter < 25) {
            super.addStudent(studentId);
            studentCounter++;
            return true;
        } else{
            return false;
        }
    }

    @Override
    public String toString(){
        return super.toString() + " " + classRoom;
    }
}