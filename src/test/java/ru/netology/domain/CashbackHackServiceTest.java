package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldService0() {
        assertEquals(1000, service.remain(0));
    }

    @Test
    public void shouldServiceUnder1000() {
        assertEquals(590, service.remain(410));
    }

    @Test
    public void shouldService1000() {
        assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldServiceMore1000() {
        assertEquals(880, service.remain(1120));
    }

    @Test
    public void shouldServiceMore10000() {
        assertEquals(680, service.remain(10320));
    }
}