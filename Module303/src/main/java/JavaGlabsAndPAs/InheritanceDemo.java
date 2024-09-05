package JavaGlabsAndPAs;

public class InheritanceDemo {
    public class Doctor{
        String DoctorName;
        String Department;
        public void Doctor_Details(){
            System.out.println("Doctor Details...");
        }
    }
    public class Surgeon extends Doctor{
        void Surgeon_Details(){
            System.out.println("Surgeon Details...");
            System.out.println(Department ="Cardio");
        }
    }
    public class Hospital {
        public void main(String[] args) {
            Surgeon s = new Surgeon();
            s.Doctor_Details();
            s.Surgeon_Details();
        }
    }
}
