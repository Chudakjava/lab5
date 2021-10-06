package com.company;

public class Lecturer extends  Person {
    private String nameСathedra;
    private int salary;

    public String getnameСathedra() {
        return nameСathedra;
    }

    public void setnameСathedra(String nameСathedra) {
        this.nameСathedra = nameСathedra;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String printInfo()
    {
        return "Преподаватель кафедры " + getnameСathedra() + " " + getSurname() + " " + getName() + ", возраст " + getAge() + '\n' + "Зарплата: " + getSalary();
    }
}
