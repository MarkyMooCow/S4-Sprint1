package weekFour;

public class Course {
    private String courseName;
    private Instructor Ins;
    private TextBook tb;

    public Course(String name, Instructor Ins, TextBook tb){
        this.courseName = name;
        this.Ins = Ins;
        this.tb = tb;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getIns() {
        return Ins;
    }

    public TextBook getTb() {
        return tb;
    }

    public String toString(){
        return(this.courseName + " is taught by " + this.Ins + " has textbook called " + this.tb);
    }

    
    
}
