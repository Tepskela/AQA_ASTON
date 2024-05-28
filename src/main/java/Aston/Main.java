package Aston;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
            Employee[] employees = new Employee[5];
            employees[0] = new Employee("Иванов Иван Иванович", "тестировщик", "qwerty@mail.ru", "8-800-555-35-35", 15000.99, 20);
            employees[1] = new Employee("Веселый Василий Васильевич", "Душа компании", "assdfghj@yandex.ru", "8-900-999-99-99", 500000.10, 60);
            employees[2] = new Employee("Самыйлучший Владислав Александрович", "Проверяющий ДЗ кандидатов", "qwasdfe@googl.com", "8-123-456-78-90", 9999999, 19);
            employees[3] = new Employee("Всегдаправко Егор Егорыч", "Самый важный начальник", "zxbcb@mail.ru", "8-777-777-77-77", 7777.44, 90);
            employees[4] = new Employee("Шарль де  Голль", "Президент Франции", "FranchTop@Paris.com", "8-111-123-45-67", 454545.45, 45);
            employees[0].outputEmployee();
            employees[1].outputEmployee();
            employees[2].outputEmployee();
            employees[3].outputEmployee();
            employees[4].outputEmployee();
        }
    }


