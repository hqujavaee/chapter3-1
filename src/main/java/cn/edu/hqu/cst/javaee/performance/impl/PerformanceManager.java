package cn.edu.hqu.cst.javaee.performance.impl;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceManager {
	/*@Pointcut("execution(** Movie.perform(..))")
	public void performance() {
		
	}*/
	@Before("execution(** cn.edu.hqu.cst.javaee.performance.Performance.perform(..))")
	public void silenceCellPhones() {
		System.out.println("请将手机调为静音！");
	}
	
	@Before("execution(** cn.edu.hqu.cst.javaee.performance.Performance.perform(..))")
	public void takeSeats() {
		System.out.println("请坐在自己位置上，不要到处走动！");
	}
	@AfterReturning("execution(** cn.edu.hqu.cst.javaee.performance.Performance.perform(..))")
	public void orderlyRetreat() {
		System.out.println("请大家有序退场！");
	}
	@AfterThrowing("execution(** cn.edu.hqu.cst.javaee.performance.Performance.perform(..))")
	public void refound() {
		System.out.println("到售票处退票！");
	}
}
