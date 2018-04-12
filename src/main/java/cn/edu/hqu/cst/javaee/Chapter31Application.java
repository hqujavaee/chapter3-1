package cn.edu.hqu.cst.javaee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.edu.hqu.cst.javaee.performance.Performance;

public class Chapter31Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
		Performance performance=(Performance) ctx.getBean(Performance.class);
		performance.perform();
		ctx.close();
	}
}
