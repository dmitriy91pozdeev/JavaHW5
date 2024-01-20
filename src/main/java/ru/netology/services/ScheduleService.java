package ru.netology.services;

public class ScheduleService {
    public int calculate(int income, int expenses, int threshold) {

        int money = 0; // количество денег на счету
        int rest = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                month++; // увеличиваем счётчик месяцев отдыха
                money = (money + income - expenses) / 3;
                rest++;

            } else {

                money = (money - expenses + income);

            }
        }
        return rest;
    }
}

