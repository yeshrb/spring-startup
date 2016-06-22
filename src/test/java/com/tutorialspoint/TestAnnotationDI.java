package com.tutorialspoint;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@RunWith(BlockJUnit4ClassRunner.class)
public class TestAnnotationDI {
    @Test
    public void testRequired(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Student st = (Student)context.getBean("student");
        System.out.println("Name: "+st.getName());
        System.out.println("Age: "+st.getAge());
    }
}
