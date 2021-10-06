package com.company;

public class Main {
    public static void main(String[] args) {
        Student student_1 = new Student();
        student_1.setNumberGroup("AД-201");
        student_1.setNumberSticket(13);
        student_1.setAge(18);
        student_1.setName("Евгений");
        student_1.setSurname("Виноградов");

        Student student_2 = new Student();
        student_2.setNumberGroup("АД-201");
        student_2.setNumberSticket(9);
        student_2.setAge(18);
        student_2.setName("Ярослав");
        student_2.setSurname("Чудак");

        Lecturer lecturer_1 = new Lecturer();
        lecturer_1.setnameСathedra("Преисполнение в существовании");
        lecturer_1.setSalary(10000);
        lecturer_1.setAge(32);
        lecturer_1.setName("Олег");
        lecturer_1.setSurname("Малахов");

        Lecturer lecturer_2 = new Lecturer();
        lecturer_2.setnameСathedra("Преисполнение в существовании");
        lecturer_2.setSalary(15000);
        lecturer_2.setAge(65);
        lecturer_2.setName("Владимир");
        lecturer_2.setSurname("Великий");

        Person Array[] = new Person[]{student_1, student_2, lecturer_1, lecturer_2};

        for (int i = 0; i < Array.length; ++i) {
            System.out.print(Array[i].printInfo() + '\n' + '\n');
        }
    }
}