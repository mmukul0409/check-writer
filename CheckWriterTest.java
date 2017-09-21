package com.app.checkwriter;

import static org.junit.Assert.*;
import com.app.checkwriter.EnglishCheckWriter;

import org.junit.Test;

public class CheckWriterTest {

	EnglishCheckWriter checkWriter = new EnglishCheckWriter();
	
@Test
public void testReturn1() {
    String actual = checkWriter.processNumber(99.328939);
    System.out.println(actual);
    String expected = "Ninety Nine and 33/100";
    assertEquals(expected, actual);
}

@Test
public void testReturn2() {
    String actual = checkWriter.processNumber(-10.00);
    System.out.println(actual);
    String expected = "Please provide Positive Numbers Only";
    assertEquals(expected, actual);
}

@Test
public void testReturn3() {
    String actual = checkWriter.processNumber(95.00);
    System.out.println(actual);
    String expected = "Ninety Five only";
    assertEquals(expected, actual);
}


}

