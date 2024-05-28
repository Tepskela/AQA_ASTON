package Aston;


import java.sql.SQLOutput;

public class Employee {
    String fullName;
    String post;
    String email;
    String telephone;
    double salary;
    int age;
    public Employee (String fullName, String post, String email, String telephone, double salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    public void outputEmployee(){
        System.out.println("ФИО: " + fullName + "\nДолжность: " + post + "\nemail: " + email + "\nТелефон: " + telephone + "\nЗарплата: " + salary + "\nВозрст: " + age);
    }
}
