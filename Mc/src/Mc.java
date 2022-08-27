public class Mc {

 private float weightPerson;
   private float heightPerson;
    
    public float calculateIMC(){
        float imc = weightPerson / (heightPerson * heightPerson);
        return imc;
    }

    public void setWeightPerson(float weightPerson){
        this.weightPerson = weightPerson;
    }

    public float getWeightPerson(){
        return weightPerson;
    }


    public void setHeightPerson(float heightPerson){
        this.heightPerson = heightPerson;
    }

    public float getHeightPerson(){
        return heightPerson;
    }

}
