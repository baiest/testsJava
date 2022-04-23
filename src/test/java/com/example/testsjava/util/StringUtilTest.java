package com.example.testsjava.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void repeat_string_once(){

        Assert.assertEquals("hola", StringUtil.repeate("hola", 1));
    }
    @Test
    public void repeat_string_multiple_times(){
        Assert.assertEquals("holaholahola", StringUtil.repeate("hola", 3));
    }
    @Test
    public void repeat_string_zero_times(){
        Assert.assertEquals("", StringUtil.repeate("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times(){
        Assert.assertEquals("", StringUtil.repeate("hola", -1));
    }
}