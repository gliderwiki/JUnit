package com.libqa.junit;

import org.junit.*;

import static org.junit.Assert.assertTrue;

/**
 * @Author : yion
 * @Date : 2017. 4. 15.
 * @Description :
 */
public class JUnitHelloWorldTest  {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class!");
    }

    @Before
    public void before() {
        System.out.println("Before TestCase");
    }

    @Test
    public void isGreaterTest() {
        System.out.println("Test");
        JUnitHelloWorld helloWorld = new JUnitHelloWorld();
        assertTrue("num 1 is greater than num 2", helloWorld.isGreater(2, 3));

    }

    @After
    public void after() {
        System.out.println("After TestCase");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class!");
    }
}
