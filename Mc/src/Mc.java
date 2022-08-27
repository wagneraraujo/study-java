public class Mc {

    float weightPerson;
    float heightPerson;
    
    public float calculateIMC(){
        float imc = weightPerson / (heightPerson * heightPerson);
        return imc;
    }

}
