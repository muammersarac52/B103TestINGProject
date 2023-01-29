package techproed.tests;

import org.testng.annotations.*;

public class Day19TestNGAnnotations {
    /*
   @Test : Test case ousturmak icin kullanilir
    @Before ve @After : 5 Before 5 After anotations var
    suite > tests > grup > class > method
    @BeforeSuite : her bir test suite den once 1 sefer calisir
    @AfterSuite : her bir test suiteden sonra 1 sefer calisir
    @BeforeTest : her bir testden once(TEST CASE ILE KARISTIRILMAMALI) 1 sefer calisir
    @AfterTest : her bir testden sonra(TEST CASE ILE KARISTIRILMAMALI) 1 sefer calisir
    @BeforeClass: her bir classdan once 1 sefer calisir
    @AfterClass: her bir classdan sonra 1 sefer calisir
    @BeforeMethod: her bir @Test annotationdan once tek sefer calisir. JUnitdeki karsiligi @Before
    @AfterMethod: her bir @Test annotationdan sonra tek sefer calisir. JUnitdeki karsiligi @After
    -------------------------------------------------------------------------------------------
     @Ignore : @Test caseleri atlamak(skip,ignore) icin kullanilir
    @Test(enabled = false) : @Test caseleri kullanima kapatmak icin kullanilir


    priority = 1 : Test caseleri onceliklendirmek icin kullanilir

    TestNG de test case ler isim sirasina gore calisir
    @Test(priority = 1) : Test caseler oncelemek icin kullnalir
     */

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("");
    }




    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");

    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");

    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("After Groups");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }




    @Test
    public void test1() {
        System.out.println("Test1");
    }

    @Test @Ignore//@Ignore yazarsan bunu calistirmaz
    public void test2() {
        System.out.println("Test2");
    }

    @Test(enabled = false)//(enabled = false)kullanma      yesil ok bile gitti      kullanima kapat
    public void test3() {
        System.out.println("Test3");
    }

    @Test(priority=4)
    public void test4() {
        System.out.println("Test4");
    }

    @Test(priority=2)
    public void test5() {
        System.out.println("Test5");
    }

    @Test(priority=-5)
    public void test6() {
        System.out.println("Test6");
    }
    @Test(priority=1)
    public void test7() {
        System.out.println("Test6");
    }
}
//BeforeSuite
//BeforeTest
//BeforeClass




//beforeMethod
//Test1
//After Method
//beforeMethod
//Test2
//After Method
//beforeMethod
//Test3
//After Method
//beforeMethod
//Test4
//After Method
//beforeMethod
//Test5
//After Method
//beforeMethod
//Test6
//After Method



//After Class
//After Test
//After Suite
