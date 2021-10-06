package com.company;

public class Student extends  Person {

    private String numberGroup;
    private int numberSticket;

    public String getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(String numberGroup) {
        this.numberGroup = numberGroup;
    }

    public int getNumberSticket() {
        return numberSticket;
    }

    public void setNumberSticket(int numberSticket) {
        this.numberSticket = numberSticket;
    }

    @Override
    public String printInfo()
    {
        return "Студент группы " + this.numberGroup + " " + getSurname() + " " + getName() + ", возраст: " + getAge() + '\n' + "Номер студенческого билета: " + getNumberSticket();
    }
}