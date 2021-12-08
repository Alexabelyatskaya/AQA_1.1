package ru.netology.domain;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldService0() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldServiceUnder1000() {
        assertEquals(service.remain(410), 590);
    }

    @Test
    public void shouldService1000() {
        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void shouldServiceMore1000() {
        assertEquals(service.remain(1120), 880);
    }

    @Test
    public void shouldServiceMore10000() {
        assertEquals(service.remain(10320), 680);
    }
}