package com.java.maven.piechart.report;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.java.maven.piechart.report.util.ScpTestListener;

@Listeners(value=ScpTestListener.class)
public class ATest {
	@Test
	public void a1(){
		System.out.println("a1 excuted");
	}
	@Test
	public void a2(){
		System.out.println("a2 excuted");
	}
	
	@Test
	public void a3(){
		System.out.println("a3 excuted");
	}
	
	@Test
	public void a4(){
		System.out.println("a4 excuted");
	}
	
	@Test
	public void a5(){
		System.out.println("a5 excuted");
	}
	
	
}
