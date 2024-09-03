package EncPackage;

public class Enc5 {
    private int age;
    private String name;
    private int Id;
    private int Salary;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public Enc5(int age, String name, int id, int salary) {
        this.age = age;
        this.name = name;
        Id = id;
        Salary = salary;
    }
}

class tes7t{
    public static void main(String[] args){
        Enc5 e5 = new Enc5(29,"Java",35456,90000);
        System.out.println(e5.getAge());
        System.out.println(e5.getName());
        System.out.println(e5.getId());
        System.out.println(e5.getSalary());

    }
}