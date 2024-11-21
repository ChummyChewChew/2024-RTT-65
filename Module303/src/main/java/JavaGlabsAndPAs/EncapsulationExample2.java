package JavaGlabsAndPAs;

public class EncapsulationExample2 {
    public static void main(String[] args) {
        HumanBeing2 h1 = new HumanBeing2();
                h1.setHeight(1.65F);
                h1.setWeight(68);
                h1.setBmi(calculateBmi(h1));
        System.out.println("Person has "+h1.getWeight()+" kgs and is "+h1.getHeight()+" meters in height, which results in BMI of "+h1.getBmi());
    }
    public static float calculateBmi(HumanBeing2 h1) {
        return h1.getWeight()/(h1.getHeight()*h1.getHeight());
    }
}
