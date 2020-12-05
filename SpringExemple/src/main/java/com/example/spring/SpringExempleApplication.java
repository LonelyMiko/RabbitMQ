package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExempleApplication {

    public static void main(String[] args) {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("beans.xml");

        Hello myBean = (Hello) beanFactory.getBean("produs1");
        myBean.printHello();

        myBean = (Hello) beanFactory.getBean("produs2");
        myBean.printHello();

        myBean = (Hello) beanFactory.getBean("produs3");
        myBean.printHello();

        myBean = (Hello) beanFactory.getBean("produs4");
        myBean.printHello();

        myBean = (Hello) beanFactory.getBean("produs5");
        myBean.printHello();
    }

}

