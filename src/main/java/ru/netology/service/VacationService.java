package ru.netology.service;
public class VacationService {
    public int calculate( int income, int expenses ,int threshold) {
        int mounths = 0;
        int cash = 0;
    for (int i = 0; i < 12; i++) {
        if (cash >= threshold) {
       mounths++;
       cash -= expenses; // cash = cash /3
       cash /= 3;
        } else {
        cash += income;
        cash -= expenses;
        }
    }
return mounths;
}
}
