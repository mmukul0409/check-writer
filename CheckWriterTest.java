package com.app.checkwriter;

import static org.junit.Assert.*;
import com.app.checkwriter.EnglishCheckWriter;

import org.junit.Test;

public class CheckWriterTest {

    EnglishCheckWriter checkWriter = new EnglishCheckWriter();

    @Test
    public void testReturn1() {
        String actual = checkWriter.processNumber(99.328939);
        String expected = "Ninety Nine and 33/100";
        assertEquals(expected, actual);
    }

    @Test
    public void testReturn2() {
        String actual = checkWriter.processNumber(-10.00);
        String expected = "Please provide Positive Numbers Only";
        assertEquals(expected, actual);
    }

    @Test
    public void testReturn3() {
        String actual = checkWriter.processNumber(95.00);
        String expected = "Ninety Five only";
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReturn4() {
        String actual = checkWriter.processNumber(3219323233281983021.987987978997);
        String expected = "Number Entered is out of Range, Please try different Number";
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReturn5() {
        String actual = checkWriter.processNumber(-2121344.987987978997);
        String expected = "Please provide Positive Numbers Only";
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReturn6() {
        String actual = checkWriter.processNumber(-2121344.987987/10);
        String expected = "Please provide Positive Numbers Only";
        assertEquals(expected, actual);
    }


}
