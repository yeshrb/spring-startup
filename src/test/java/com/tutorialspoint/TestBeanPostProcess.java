package com.tutorialspoint;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import static junit.framework.TestCase.assertNotSame;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanPostProcess {

    @Test
    public void testM() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TempClass obj1 = (TempClass) context.getBean("tempClass");
        System.out.println(obj1.getMessage());
        context.registerShutdownHook();
    }


}
