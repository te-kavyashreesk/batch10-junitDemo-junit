package com.te.junit.mathutil;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
@EnabledOnOs(OS.WINDOWS)
class MathUtilTest {
	private MathUtil mathutil;
	@BeforeEach
	public void initBeforeEach()
	{
		mathutil=new MathUtil();
	TestInfo testinfo;
	
	
	}

	@Test
	@DisplayName(" add two numbers")
	@RepeatedTest(4)
	void testAddNumbers(RepetitionInfo info)
	{
		
		MathUtil mathutil=new MathUtil();
		int exp=10;
		int act= mathutil.addNumber(9, 8);
		assertEquals(exp, act, " actual is not matching with excepted");
	}
	
	@Test
	@DisplayName("area of circle")
	void testAreaOfCircle()
	{
		MathUtil mathutil=new MathUtil();
		assertEquals(314.15927, mathutil.computeCircleArera(10),"");
	}
	
	@Test
	@Disabled
	void testDivide()
	{
		System.out.println();
		MathUtil mathutil=new MathUtil();
		assertEquals(1, mathutil.divide(2, 2));
		assertThrows(ArithmeticException.class, ()->mathutil.divide(2, 0));
	
	}
@AfterEach
	public void cleanUpAfterEach1()
	{
		System.out.println("after each"); // 3 times
	}
	

	@AfterAll
	public void cleanUpAfterEach()
	{                                                     
		System.out.println("after each"); // 3 times
	}
	
	}


