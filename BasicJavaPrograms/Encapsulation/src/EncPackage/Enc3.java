package EncPackage;

public class Enc3 {
    private int age;
    private String name;
    private String lastName;
    private double salary;

    public Enc3(int age, String name, String lastName, double salary) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class test7{
  public static void main(String[] args){
      Enc3 obj = new Enc3(27,"Java","Programming",60000);
      System.out.println(obj.getAge());
      System.out.println(obj.getName());
      System.out.println(obj.getLastName());
      System.out.println(obj.getSalary());
  }
}
