package com.example.testsjava.player.util;

import com.example.testsjava.util.PasswordUtil.SecurityLavel;
import com.example.testsjava.util.StringUtil;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {
    @Test
    public void repeat_string_once(){

        Assert.assertEquals("hola", StringUtil.repeate("hola", 1));
    }
    @Test
    public void repeat_string_multiple_times(){
        assertEquals("holaholahola", StringUtil.repeate("hola", 3));
    }
    @Test
    public void repeat_string_zero_times(){
        assertEquals("", StringUtil.repeate("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times(){
        assertEquals("", StringUtil.repeate("hola", -1));
    }

    @Test
    public void string_is_empty(){
        assertTrue(StringUtil.isEmpty(""));
    }
    @Test
    public void string_is_empty_when_is_null(){
        assertTrue(StringUtil.isEmpty(null));
    }
    @Test
    public void string_is_empty_with_spaces(){
        assertTrue(StringUtil.isEmpty(" "));
    }
}