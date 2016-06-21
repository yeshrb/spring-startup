package com.tutorialspoint;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static junit.framework.TestCase.assertNotSame;
import static junit.framework.TestCase.assertSame;
//import static junit.framework.TestCase.assertNotSame;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope {

    @Test
    public void testSingleton() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj1 = (HelloWorld) context.getBean("helloWorldSingletone");
        HelloWorld obj2 = (HelloWorld) context.getBean("helloWorldSingletone");
        assertSame(obj1, obj2);
    }

    @Test
    public void testPrototype() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj1 = (HelloWorld) context.getBean("helloWorldPrototype");
        HelloWorld obj2 = (HelloWorld) context.getBean("helloWorldPrototype");
        assertNotSame(obj1, obj2);
    }


}
