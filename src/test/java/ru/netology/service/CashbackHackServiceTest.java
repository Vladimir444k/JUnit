package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int expected = 10;

        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 10;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}