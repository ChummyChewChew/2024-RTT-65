package JavaGlabsAndPAs;

public class SecondStudent {
    //First step is to initialize out values
    private int studentID;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    //Step 2 is we create our constructor
    //Overloading more ways to create objects can be useful when you want only a specific type of information
    public SecondStudent(int studentID, String firstName,
                         String lastName, String email,
                         String phone) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }
    public SecondStudent(){

    }


    //Step 3. Then we set up out setters. These will take in values and set them to a specific instance of a object
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public void setFirstName(String firstname){
        this.firstName = firstname;
    }
    public void setLastName(String lastname){
        this.lastName = lastname;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    //Step 4. Once we have our values, we can use these get methods to take our values and display them for the user
    //We can even put in more code so we don't have to put in the SOUT code. Since these return a int, the return statement MUST BE LAST
    public int getStudentID(){
        System.out.println("The ID is " + studentID);
        return studentID;

    }
    public String getFirstName(){
        System.out.println("The first name is " + firstName);
        return firstName;
    }
    public String getLastname(){
        System.out.println("The last name is " + lastName);
        return lastName;
    }
    public String getEmail(){
        System.out.println("The email is " + email);
        return email;
    }
    public String getPhone(){
        System.out.println("The phone number is " + phone);
        return phone;
    }

    public static void main(String[] args) {
        SecondStudent s = new SecondStudent();
        s.setStudentID(1);
        s.setFirstName("John");
        s.setLastName("Doe");
        s.setEmail("john@doe.com");
        s.setPhone("123456789");
        s.getStudentID();
        s.getFirstName();
        s.getLastname();
        s.getEmail();
        s.getPhone();
        SecondStudent s2 = new SecondStudent();
        s2.setStudentID(2);
        s2.setFirstName("Jane");
        s2.setLastName("Doe");
        s2.setEmail("jane@doe.com");
        s2.setPhone("123456789");
        s2.getStudentID();
        s2.getFirstName();
        s2.getLastname();
        s2.getEmail();
        s2.getPhone();

    }
}
