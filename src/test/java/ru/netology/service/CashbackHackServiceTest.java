package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test

    void ifAmount500() {
       CashbackHackService service = new CashbackHackService();
       int actual = service.remain(500);
       int expected = 500;

       assertEquals(actual, expected);
    }

    @Test

    void ifAmount0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test

    void ifAmount1() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test

    void ifAmount999() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }
    @Test

    void ifAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test

    void ifAmount1001() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);
    }
}
