package EncPackage;

public class Enc4 {
    private int id;
    private String EmpName;
    private String lastName;
    private int salary;
    private String adderess;

    public Enc4(int id, String empName, String lastName, int salary, String adderess) {
        this.id = id;
        EmpName = empName;
        this.lastName = lastName;
        this.salary = salary;
        this.adderess = adderess;
    }

    public int getId(){
      return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getempName(){
        return EmpName;
    }
    public void setempName(String EmpName){
        this.EmpName = EmpName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAdderess() {
        return adderess;
    }

    public void setAddress(String adderess) {
        this.adderess = adderess;
    }
}
class test8{
    public static void main(String[] args){
        Enc4 t1 = new Enc4(2324,"abc","xyz",70000,"pqrs");
        System.out.println(t1.getId());
        System.out.println(t1.getempName());
        System.out.println(t1.getLastName());
        System.out.println(t1.getSalary());
        System.out.println(t1.getAdderess());

    }
}
