package CmpPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee  {
    int age;
    int Id;
    String name;
    double salary;

    public Employee(int age, int id, String name, double salary) {
        this.age = age;
        Id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", Id=" + Id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


   // @Override
  //  public int compareTo(Employee o) {
  //      return this.getAge()-o.getAge();
    //}
    class AgeComp implements Comparator<Employee> {


       @Override
       public int compare(Employee o1, Employee o2) {
           return o1.getAge()-o2.getAge();
       }
   }
}
class Test456{
    public static void main(String[] args){
        Employee e1 = new Employee(24,11,"Mohan",50000);
        Employee e2 = new Employee(26,14,"Aman",51000);
        Employee e3 = new Employee(21,10,"Shekhar",55000);
        Employee e4 = new Employee(30,12,"Angad",59000);

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);


    }
}