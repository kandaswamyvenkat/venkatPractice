package venkat.learning.javapractice;

public class Employee {
    int salary=40000;

}

class Programmer extends Employee{
    int bonus=10000;
    public static void main(String[]args){
        Programmer p =new Programmer();
        System.out.println("Programmer salary is" +p.salary);
        System.out.println("bonus for programmer" +p.bonus);
    }
}
