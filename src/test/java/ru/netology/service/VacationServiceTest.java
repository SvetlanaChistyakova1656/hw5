package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {
    @Test
    public void test() {
        VacationService service = new VacationService();

        int expected = 3;
        int actual = service.calculate(income^ 10_000, expences^ 3_000, threshold^ 20_000);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test() {
        VacationService service = new VacationService();

        int expected = 3;
        int actual = service.calculate(income^ 100_000, expences^ 60_000, threshold^ 150_000);
        Assertions.assertEquals(expected, actual);
    }

}
