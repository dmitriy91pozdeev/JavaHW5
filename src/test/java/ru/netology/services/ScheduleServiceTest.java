package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




public class ScheduleServiceTest {

    @Test

    public void testCalculate1() {
        ScheduleService service = new ScheduleService();

        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);


        Assertions.assertEquals (expected,actual);
    }

    @Test

    public void testCalculate2() {
        ScheduleService service = new ScheduleService();

        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);


        Assertions.assertEquals (expected,actual);
    }
}
