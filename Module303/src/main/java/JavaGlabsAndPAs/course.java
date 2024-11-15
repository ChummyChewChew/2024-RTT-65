package JavaGlabsAndPAs;

public class course {
    private  String code, courseName, instructorName;
    public course (String code, String name, String instructor){
        this.code = code;
        this.courseName = name;
        this.instructorName = instructor;
    }
    public course (){

    }
    public String getCode(){
        return code;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getINstructorName(){
        return instructorName;
    }
    public void setCode(String code){
        this.code = code;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public void setInstructorName(String instructorName){
        this.instructorName = instructorName;
    }
}
