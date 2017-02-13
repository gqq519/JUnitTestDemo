package com.feicuiedu.junittestdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gqq on 2017/2/13.
 */
public class RegexUtilsTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void verifyUsername() throws Exception {
        int username = RegexUtils.verifyUsername("123456");
        assertEquals(0,username);
    }

    @Test
    public void verifyPassword() throws Exception {

    }

    @Test
    public void verifyNickname() throws Exception {

    }

}