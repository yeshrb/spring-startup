package com.tutorialspoint;

import org.junit.Test;
import org.junit.runner.RunWith;
import static junit.framework.TestCase.assertEquals;
import org.junit.runners.BlockJUnit4ClassRunner;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestHelloWorldBean  {

    @Test
    public void testWithApplicationContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        assertEquals("Hello Lijunjie",obj.getMessage());

    }

    @Test
    public void testWithBeanFactory() {
        XmlBeanFactory context = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        assertEquals("Hello Lijunjie",obj.getMessage());

    }
    @Test
    public void testWithFileSystemXmlContext() {
        ApplicationContext context  =
                new FileSystemXmlApplicationContext("D:\\learnProgramming\\springdata\\spring-startup\\src\\main\\resources\\Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        assertEquals("Hello Lijunjie",obj.getMessage());

    }




}
