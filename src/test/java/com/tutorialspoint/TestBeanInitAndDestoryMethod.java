package com.tutorialspoint;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import static junit.framework.TestCase.assertNotSame;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanInitAndDestoryMethod {

    @Test
    public void testInitAndMethod() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj1 = (HelloWorld) context.getBean("helloWorldSingletone");
        System.out.println(obj1.getMessage());
        context.registerShutdownHook();
    }

    @Test
    public void testDefaultInitAndMethod() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorldPrototype");
        System.out.println(obj.getMessage());
        context.registerShutdownHook();
    }


}
