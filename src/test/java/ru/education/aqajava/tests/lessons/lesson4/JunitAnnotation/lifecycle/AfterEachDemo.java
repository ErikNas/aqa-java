package ru.education.aqajava.tests.lessons.lesson4.JunitAnnotation.lifecycle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class AfterEachDemo {

    @AfterEach
    void beforeEach() {
        System.out.println("BeforeEach ");
    }

    @Test
    void test1() {
        System.out.println("-> test1");
    }

    @Test
    void test2() {
        System.out.println("-> test2");
    }

    @Test
    void test3() {
        System.out.println("-> test3");
    }
}
