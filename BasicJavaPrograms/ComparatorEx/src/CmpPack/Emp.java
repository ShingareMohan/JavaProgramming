package CmpPack;

import java.util.*;

public class Emp {
    int age;
    int Id;
    String name;
    double salary;

    public Emp(int age, int id, String name, double salary) {
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
        return "Emp{" +
                "age=" + age +
                ", Id=" + Id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class AgeComp implements Comparator<Emp> {


    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getAge()-o2.getAge();
    }
}
class IdCmp implements Comparator<Emp>{

    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getId()-o2.getId();
    }
}

class T1{
    public static void main(String[] args){
        Emp e1 = new Emp(24,11,"Mohan",50000);
        Emp e2 = new Emp(26,14,"Aman",51000);
        Emp e3 = new Emp(21,10,"Shekhar",55000);
        Emp e4 = new Emp(30,12,"Angad",59000);

        List<Emp> Emplist = new ArrayList<>();
        Emplist.add(e1);
        Emplist.add(e2);
        Emplist.add(e3);
        Emplist.add(e4);

     AgeComp Age = new AgeComp();
        Collections.sort(Emplist, Age);

        System.out.println(Emplist);

        IdCmp id = new IdCmp();
        Collections.sort(Emplist, id);
        System.out.println(Emplist);

    }
}