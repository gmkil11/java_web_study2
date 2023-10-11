package exam02;

import org.junit.jupiter.api.*;

public class TDDTest {
    @BeforeAll
    static void BeforeAll(){
        System.out.println("BeforeAll");
    }
    @AfterAll
    static void AfterAll(){
        System.out.println("AfterAll");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("BeforeEach");
    }

    @AfterEach
    void AfterEach(){
        System.out.println("AfterEach");
    }
    @Test
    void test1(){
        System.out.println("테스트 1번");
    }
    @Test
    void test2(){
        System.out.println("테스트 2번");
    }
}
