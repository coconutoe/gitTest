package com.atguigu.maven;

import org.junit.Test;

public class HelloTest {
	@Test
	public void testHello() {
		Hello he = new Hello();
		
		he.sayHello();
	}
	
	@Test
	public void testHello2() {
		System.out.println(11);
		System.out.println(22);
		System.out.println("船舰分支");
		System.out.println("主干跟新");
		System.out.println("hello, xiaohuihui");
	}
}
