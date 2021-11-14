package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    ApplicationContext context = new ClassPathXmlApplicationContext("com/Pizza.java");
    Pizza pizza= (Pizza) context.getBean("pizza");
    System.out.println(pizza);
  }
}
