public class OnlineCourse extends Course{
    private String adress;

    public OnlineCourse(){
        this("","","");
    }

    public OnlineCourse(String ClassName, String TeacherName, String adress){
        super(ClassName, TeacherName);
        this.adress = adress;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString(){
        return super.toString() + " " + adress;
    }
}