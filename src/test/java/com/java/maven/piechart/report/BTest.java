package com.java.maven.piechart.report;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.java.maven.piechart.report.util.ScpTestListener;

@Listeners(value=ScpTestListener.class)
public class BTest {
	
	@Test
	public void b1(){
		System.out.println("b1 excuted");
	}
	@Test
	public void b2(){
		System.out.println("b2 excuted");
	}
	
	@Test(dependsOnMethods="b4")
	public void b3(){
		System.out.println("b3 excuted");
	}
	
	@Test
	public void b4(){
		System.out.println("b4 excuted");
		Assert.fail("B4() Method failed...!!!!"); 
	}
	
	@Test
	public void b5(){
		System.out.println("b5 excuted");
		Assert.fail("B5() Method failed...!!!!"); 
	}
	
	@Test
	public void b6(){
		System.out.println("b6 excuted");
	}
	
	@Test
	public void b7(){
		System.out.println("b7 excuted");
	}
	
}
