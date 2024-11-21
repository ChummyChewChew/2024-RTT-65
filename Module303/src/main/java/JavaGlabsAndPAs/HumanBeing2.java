package JavaGlabsAndPAs;

public class HumanBeing2 {
    private float weight;
    private float height;
    private float bmi;

    public HumanBeing2(float weight, float height, float bmi){
     this.weight = weight;
     this.height = height;
     this.bmi = bmi;
    }
    public HumanBeing2(){

    }
    public float getWeight(){
        return weight;

    }
    public void setWeight(float weight){
        this.weight = weight;
    }
    public float getHeight(){
        return height;
    }
    public void setHeight(float height){
        this.height = height;
    }
    public float getBmi(){
        return bmi;
    }
    public void setBmi(float bmi){
        this.bmi = bmi;
    }
}


