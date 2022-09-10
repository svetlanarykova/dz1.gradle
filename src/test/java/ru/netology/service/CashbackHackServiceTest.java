package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void test1 () {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotAskToIncreaseTheAmountIfDivisibleByBoundary  () {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void test3 () {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void test4 () {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1500);
        int expected = 500;

        assertEquals(actual, expected);
    }
}