package JavaGlabsAndPAs;

public class EncapsulationExample {
    public static void main(String[] args) {
        HumanBeing h1 = new HumanBeing();
        h1.setHeight(1.65f);
        h1.setWeight(68);
        h1.setBmi(caculateBmi(h1));
        System.out.println("Person has "+ h1.getWeight()+"kgs and is "+h1.getHeight()+
                "meters,w hic result in a BMI of "+h1.getBmi());
    }
    public static float caculateBmi(HumanBeing h1){
        return h1.getBmi()/(h1.getHeight()*h1.getWeight());
    }
}
