package demo;

import org.testng.annotations.Test;

public class A extends D{

    @Test
    public void m2(){
        System.out.println("inside m2 of A");
    }

    @Test
    public void m3(){
        System.out.println("inside m3 of A");
    }

}
