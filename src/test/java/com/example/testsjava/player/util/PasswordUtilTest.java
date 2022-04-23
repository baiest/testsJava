package com.example.testsjava.player.util;

import com.example.testsjava.util.PasswordUtil;
import com.example.testsjava.util.PasswordUtil.SecurityLavel;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_than_8_letters() {
        SecurityLavel result = PasswordUtil.assertPassword("15sa!7");
        assertEquals(result, SecurityLavel.WEAK);
    }
    @Test
    public void weak_when_has_only_letters() {
        SecurityLavel result = PasswordUtil.assertPassword("abcdefg");
        assertEquals(result, SecurityLavel.WEAK);
    }

    @Test
    public void medium_when_has_letter_and_numbers() {
        SecurityLavel result = PasswordUtil.assertPassword("abcd1234");
        assertEquals(result, SecurityLavel.MEDIUM);
    }

    @Test
    public void strong_when_has_letter_numbers_and_symbols() {
        SecurityLavel result = PasswordUtil.assertPassword("abcd1234!");
        assertEquals(result, SecurityLavel.STRONG);
    }
}