import java.util.Date;

public class Employee {

    private String name;
    private String cpf;
    private Date birthday;
    private float wages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public float getWages() {
        return wages;
    }

    public void setWages(float wages) {
        this.wages = wages;
    }

}
