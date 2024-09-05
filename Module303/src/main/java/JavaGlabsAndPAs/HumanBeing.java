package JavaGlabsAndPAs;

public class HumanBeing {
    private float weight;
    private float height;
    private float bmi;
    public HumanBeing(float weight, float height, float bmi)
    {
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
    }
    public HumanBeing(){

    }
    public float getWeight(){
        return weight;
    }
    public float getHeight(){
        return height;
    }
    public float getBmi(){
        return bmi;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }
    public void setHeight(float height){
        this.height = height;
    }
    public void setBmi(float bmi){
        this.bmi = bmi;
    }

    public static void main(String[] args) {
        System.out.println("Needed to generate a file");
    }
}
