package ru.yandex.praktikum;

public class Program {
    int age;
    boolean result;
    public boolean checkIsAdult(int age) {
        if(age >= 18) {
            result = true;
        }
        else result = false;
        return result;
    }
}
