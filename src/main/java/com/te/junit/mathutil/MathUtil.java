package com.te.junit.mathutil;

public class MathUtil 
{
public int addNumber(int a, int b)
{
	
return a+b;
}
public double computeCircleArera(double radius)
{
	return Math.PI*radius*radius;
	
}
public double divide(int a, int b)
{
	return a/b;  //a/0 ---> Arithmetic Exception
}

}
